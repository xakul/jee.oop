# Topic

The purpose of this tutorial is to explain how GSON can be used to generate objects in Java from existing JSON files. Similarly, we can generate JSON files from existing instances of objects.

This tutorial will also explain how ODATA and GSON comes together for development on an enterprise scenario.

## Prequisites

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

## Explanation

### A simple example
Firstly, let us understand how GSON works in java by a very simple example.
In our example, we read two JSON files from the hard drive and generated objects from it using the GSON library. The files that are used are:

Example.json
```
{
    "firstVariable" : "Hello ",
    "secondVariable" : "World!"
}
```

Nested.json
```
{
    "firstVariable" : "Incubation ",
    "secondVariable" : "Hub: ",
    "example" : {
        "firstVariable" : "Hello ",
        "secondVariable" : "World!"
    }
}
```

After this, as a backwards operation, we generated JSON files from these objects.
To do these, we use "toJson()" and "fromJson()" functions that GSON provides us.

Initialize.java
```
...
ExampleClass example = gson.fromJson(getStringFromJsonFile("Example.json"), ExampleClass.class);
		System.out.println(example.firstVariable + example.secondVariable);

String exampleToJson = gson.toJson(example);
		System.out.println(exampleToJson);
...
```
Details and more explanation can be found in the file itself.

### ODATA Example

Now, lets see the procedure with the ODATA response.
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

FirstLayer.java
```
public class FirstLayer {
    public ArrayList<Product> d;
}
```
Because we will obtain a lot of Products, we need a list structure. After GSON reaching here, it will try to access the class of the object directly, meaning it will fill the attributes in the Product class, and so on.

Product.java
```
public class Product {
    public String ID;
    public String Name;
    ...
    public Category Category;
    public Supplier Supplier;
}
```

## Summary

Inter Milan

## Links

* [GSON](https://github.com/google/gson) - GSON
* [MAVEN](https://maven.apache.org/) - Maven
