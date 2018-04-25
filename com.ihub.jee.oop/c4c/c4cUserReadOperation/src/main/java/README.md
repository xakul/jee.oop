#### [English](#topic) / [Turkish](#konu)

# Topic

SAP Cloud Platform, Cloud For Customer(C4C) Odata service connection with java

## Prequisites

*   Basic Java Knowledge.
*   Understanding of JSON format
*   Understanding of ODATA and it's use.

## Scenario

We have an ODATA service that contains User entity set in Cloud For Customer(C4C) OData API's. We want to do OData read operations on User entity set and then print on console.

## Explanation

We will do expand, filter, count, top, skip, select operations with Cloud For Customer(C4C) API.

Usage of expand system query option
/UserCollection?$expand=xxxx

Usage of filter system query option
/UserCollection?$filter=UserAccountID eq 'xxxx'

Usage of count system query option
/UserCollection/$count

Usage of top system query option
/UserCollection?$top=5

Usage of skip system query option
/UserCollection?$skip=2

Usage of select system query option
/UserCollection?$select=UserAccountID,ChangedOn

## Summary

We have seen how we can use OData read query options.

## Links

* [OData URI Conventions](http://www.odata.org/documentation/odata-version-2-0/uri-conventions/) - OData
* [SAP API's](https://api.sap.com/) - SAP API's

---
---

# Konu

SAP Cloud Platform, Cloud For Customer(C4C) Odata service connection with java

## Önkoşullar

*   Temel Java ve Nesne-Yönelimli Programlama bilgisi.
*   JSON formatı bilgisi.
*   ODATA kullanımı bilgisi.

## Senaryo

Cloud For Customer(C4C) OData API'ları içerisindeki User veri setine read operasyonları yapmak istiyoruz. Her bir operasyonu ayrı ayrı konsolda yazdırarak göstermek istiyoruz.

## Açıklama

Cloud For Customer(C4C) API'larına expand, filter, count, top, skip, select operasyonları yapacağız.

OData expand sorgusu kullanımı
/UserCollection?$expand=xxxx

OData filter sorgusu kullanımı
/UserCollection?$filter=UserAccountID eq 'xxxx'

OData count sorgusu kullanımı
/UserCollection/$count

OData top sorgusu kullanımı
/UserCollection?$top=5

OData skip sorgusu kullanımı
/UserCollection?$skip=2

OData select sorgusu kullanımı
/UserCollection?$select=UserAccountID,ChangedOn

## Özet

OData okuma operasyonlarını yapmayı öğrendik.

## Linkler

* [OData URI Conventions](http://www.odata.org/documentation/odata-version-2-0/uri-conventions/) - OData
* [SAP API's](https://api.sap.com/) - SAP API's
