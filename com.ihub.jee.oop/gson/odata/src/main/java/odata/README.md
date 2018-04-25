[HEDE HODO](#scenario)
[HEDE HODO](https://github.com/incubationhub/jee.oop/tree/master/com.ihub.jee.oop/gson/odata/src/main/java/odata#scenario)
[HEDE HODO](https://github.com/incubationhub/jee.oop/tree/master/com.ihub.jee.oop/gson/odata/src/main/java/odata#scenario)
[HEDE HODO](https://github.com/incubationhub/jee.oop/tree/master/com.ihub.jee.oop/gson/odata/src/main/java/odata#scenario)

[HEDE HODO](https://github.com/incubationhub/jee.oop/tree/master/com.ihub.jee.oop/gson/odata/src/main/java/odata#scenario)
[HEDE HODO](https://github.com/incubationhub/jee.oop/tree/master/com.ihub.jee.oop/gson/odata/src/main/java/odata#scenario)
[HEDE HODO](https://github.com/incubationhub/jee.oop/tree/master/com.ihub.jee.oop/gson/odata/src/main/java/odata#scenario)
[HEDE HODO](https://github.com/incubationhub/jee.oop/tree/master/com.ihub.jee.oop/gson/odata/src/main/java/odata#scenario)

# Topic

The purpose of this tutorial is to explain how GSON can be used to generate objects in Java from existing JSON files.
Similarly, we can generate JSON files from existing instances of objects.

This tutorial will also explain how ODATA and GSON comes together for development on an enterprise scenario.

## Prerequisites

*   Basic Java/OOP Knowledge.
*	Maven Structure Basics.
*   Understanding of JSON format
*   Understanding of ODATA and it's use.

You need to add GSON to the Maven dependencies part of your "pom.xml" file in your project.

```
<dependencies>
    ...
    <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.8.2</version>
    </dependency>
    ...
</dependencies>
```

## Scenario

We have an ODATA service that contains Products, Categories and Suppliers as entity sets.
These entity sets are in nested groups and we want to work with these values as objects in Java.
How do we obtain objects on Java that are fed with the data contained from our ODATA JSON response?
We use GSON for this integration purpose.

## Explanation

We need to analyze how the JSON response is, depending on the service.
Names of the data sets and the attributes are very important, since GSON identifies these values from their names and assigns them accordingly.

```
{
    "d": [
    {
        "__metadata": {
        "uri": "http://services.odata.org/V2/OData/OData.svc/Products(0)",
        "type": "ODataDemo.Product"
        },
            "ID": 0,
            "Name": "Bread",
            "Description": "Whole grain bread",
            ...
```
This is the response to a GET operation to:
http://services.odata.org/V2/OData/OData.svc/Products

Notice that the response starts with a "d": identifier. In order to obtain all the values correctly, we need to create a class that contains "d": itentifier as the only attribute.

##### ProductData.java
```
public class ProductData {
    public ArrayList<Product> d;
}
```
Because we will obtain a lot of Products, we need a list structure. After GSON reaching here, it will try to access the class of the object directly, meaning it will fill the attributes in the Product class, and so on.

##### Product.java
```
public class Product {
    public String ID;
    public String Name;
    ...
    public Category Category;
    public Supplier Supplier;
}
```
As described above, GSON will also access the contents of Category and Supplier classes.
It will fill them if there are values in the incoming JSON file.
That's why, we need to expand all the contents of the values in the ODATA service for our JSON to encapsulate all the variables that are in our classes.
For this, we need to do an expand operation in our URI link:
http://services.odata.org/V2/OData/OData.svc/Products?$expand=Category,Supplier

Now, we have all the needed categories expanded, meaning JSON will have all the contents of the entities exposed.

Using the GSON's 
* fromJson (JSON_AS_STRING, CLASS_TYPE)

function we can obtain objects from the JSON file. The usage of the function is shown below.

```
Gson gson = new Gson();
ProductData productData = gson.fromJson(JsonResponse, ProductData.class);
```

## Summary

We have seen how we can integrate Java and ODATA services that provide JSON responses with GSON.

## Links

* [GSON](https://github.com/google/gson) - GSON
* [MAVEN](https://maven.apache.org/) - Maven

---
---

# Konu

Bu alıştırmanın amacı, GSON kütüphanesinin, JSON formatındaki dosyalardan nasıl Java objeleri yarattığını açıklamaktır.
Benzer şekilde, bu objelerden de bir JSON dosyası yaratmak, bu kütüphane ile mümkündür.

Bu alıştırma, GSON ve ODATA, bir işletme senaryosunda nasıl bir araya geldiğini açıklayacak.

## Önkoşullar

*   Temel Java ve Nesne-Yönelimli Programlama bilgisi.
*	Maven Yapısı Temelleri.
*   JSON formatı bilgisi.
*   ODATA kullanımı bilgisi.

Maven projenizde bulunan "pom.xml" dosyasına, gereksinim olarak GSON kütüphanesini eklemeniz gerekmektedir.

```
<dependencies>
    ...
    <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.8.2</version>
    </dependency>
    ...
</dependencies>
```

## Senaryo

Elimizde Ürünler(Products), Kategoriler(Categories) ve Ürün Sağlayıcıları(Suppliers) adı altında üç veri seti var.
Bu veriler iç içe birbirlerini kapsayabilmektedirler. Biz bu veriler ile Java'da obje bazlı işlem yapmak istiyoruz.
Bize ODATA servisinde gelen JSON cevabındaki verilerle, Java objelerimizi nasıl besleyebiliriz?
GSON kütüphanesi, basit ve hızlı bir şekilde bu entegrasyonu yapmamıza olanak sağlıyor.

## Açıklama

Öncelikle, ODATA servisinden gelen JSON cevabını inceleyelim.

GSON için, veri setlerinin isimleri çok önemli. Çünkü, GSON kütüphanesi, otomatik olarak yaratılan objeleri, sınıflandırmalarında belirtilen isimlere göre besliyor.
```
{
    "d": [
    {
        "__metadata": {
        "uri": "http://services.odata.org/V2/OData/OData.svc/Products(0)",
        "type": "ODataDemo.Product"
        },
            "ID": 0,
            "Name": "Bread",
            "Description": "Whole grain bread",
            ...
```
Yukarıda bulunan, belirtilen linke uygulanan "GET" sorgusunun cevabı.
http://services.odata.org/V2/OData/OData.svc/Products

Fark ettiyseniz, bu cevap, "d": tanımlamasıyla başlıyor. Tüm değerleri doğru alabilmemiz için, bizim de yalnızca bu ibareyi içeren bir sınıflandırmamız olması gerekiyor.

##### ProductData.java
```
public class ProductData {
    public ArrayList<Product> d;
}
```
Birden fazla ürün gelebileceği için, bir liste yapısına ihtiyacımız var. Listemizin içerdiği türler Product. GSON, bunu algılayıp, içeride bulunan tüm dahil sınıflandırmaları, JSON formatlı cevaptaki verilerle doldurmayı deneyecek. Bunu, özel bir sınıflandırma olmayana kadar, iç katmanlara kadar devam ettirecek.

##### Product.java
```
public class Product {
    public String ID;
    public String Name;
    ...
    public Category Category;
    public Supplier Supplier;
}
```

Yukarıda açıklandığı gibi, burada da Category ve Supplier sınıflandırmalarının içleri de GSON tarafından doldurulacak.
Bu sebeple, bu sınıflandırmaların verilerinin bulunduğu objeler de dolmuş olacaklar.

JSON dosyasının her veri seti için bulunan her değeri göstermesi için, "GET" operasyonunu "Expand" sorgusu bulunan şu URI'a yapmalıyız:
http://services.odata.org/V2/OData/OData.svc/Products?$expand=Category,Supplier

Böylece veri setlerinin içerisinde bulunan diğer veri setleri, JSON'da açık bir şekilde görünecekler.

GSON Kütüphanesinde bulunan
* fromJson (STRING_OLARAK_JSON, CLASS_TIPI),

fonksiyonunu aşağıda bulunan örnek gibi kullanarak, JSON String yapısından tüm objelerimizi doldurabiliriz.

```
Gson gson = new Gson();
ProductData productData = gson.fromJson(JsonResponse, ProductData.class);
```

## Özet

JSON dönütlerini GSON aracılığıyla, Java objelerine nasıl çevirebileceğimizi görmüş olduk.

## Linkler

* [GSON](https://github.com/google/gson) - GSON
* [MAVEN](https://maven.apache.org/) - Maven

