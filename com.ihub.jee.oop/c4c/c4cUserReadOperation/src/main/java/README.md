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

# Topic

SAP Cloud Platform, Cloud For Customer(C4C) Odata service connection with java

## Prequisites

*   Temel Java ve Nesne-Y�nelimli Programlama bilgisi.
*   JSON format� bilgisi.
*   ODATA kullan�m� bilgisi.

## Scenario

Cloud For Customer(C4C) OData API'lar� i�erisindeki User veri setine read operasyonlar� yapmak istiyoruz. Her bir operasyonu ayr� ayr� konsolda yazd�rarak g�stermek istiyoruz.

## Explanation

Cloud For Customer(C4C) API'lar�na expand, filter, count, top, skip, select operasyonlar� yapaca��z.

OData expand sorgusu kullan�m�
/UserCollection?$expand=xxxx

OData filter sorgusu kullan�m�
/UserCollection?$filter=UserAccountID eq 'xxxx'

OData count sorgusu kullan�m�
/UserCollection/$count

OData top sorgusu kullan�m�
/UserCollection?$top=5

OData skip sorgusu kullan�m�
/UserCollection?$skip=2

OData select sorgusu kullan�m�
/UserCollection?$select=UserAccountID,ChangedOn

## Summary

OData okuma operasyonlar�n� yapmay� ��rendik.

## Links

* [OData URI Conventions](http://www.odata.org/documentation/odata-version-2-0/uri-conventions/) - OData
* [SAP API's](https://api.sap.com/) - SAP API's