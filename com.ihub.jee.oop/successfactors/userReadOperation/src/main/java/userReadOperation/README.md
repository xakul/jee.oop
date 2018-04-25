#### [English](#topic) / [Turkish](#konu)
# Topic

SAP Cloud Platform Successfactors Odata service connection with java

## Prequisites

*   Basic Java Knowledge.
*   Understanding of JSON format
*   Understanding of ODATA and it's use.

## Scenario

We have an ODATA service that contains User entity set in Successfactors OData API's. We want to do OData read operations on User entity set and then print on console.

## Explanation

We will do expand, filter, count, top, skip, select operations on Successfactors APIs.

Usage of expand system query option
/User?$expand=directReports

Usage of filter system query option
/User?$filter=username eq 'xgakpinar'

Usage of count system query option
/User/$count

Usage of top system query option
/User?$top=5

Usage of skip system query option
/User?$skip=2

Usage of select system query option
/User?$select=userId,empId

## Summary

We have seen how we can use OData read query options.

## Links

* [OData URI Conventions](http://www.odata.org/documentation/odata-version-2-0/uri-conventions/) - OData
* [SAP API's](https://api.sap.com/) - SAP API's

# Konu

SAP Cloud Platform Successfactors Odata service connection with java

## Önkoşullar

*   Temel Java ve Nesne-Yönelimli Programlama bilgisi.
*   JSON formatı bilgisi.
*   ODATA kullanımı bilgisi.

## Senaryo

Successfactors OData API'ları içerisindeki User veri setine read operasyonları yapmak istiyoruz. Her bir operasyonu ayrı ayrı konsolda yazdırarak göstermek istiyoruz. 

## Açıklama

Successfactors API'larına expand, filter, count, top, skip, select operasyonları yapacağız. 

OData expand sorgusu kullanımı
/User?$expand=directReports

OData filter sorgusu kullanımı
/User?$filter=username eq 'xgakpinar'

OData count sorgusu kullanımı
/User/$count

OData top sorgusu kullanımı
/User?$top=5

OData skip sorgusu kullanımı
/User?$skip=2

OData select sorgusu kullanımı
/User?$select=userId,empId

## Özet

OData okuma operasyonlarını yapmayı öğrendik. 

## Linkler

* [OData URI Conventions](http://www.odata.org/documentation/odata-version-2-0/uri-conventions/) - OData
* [SAP API's](https://api.sap.com/) - SAP API's
