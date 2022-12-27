# ReadJSONPage

## Java code
Java code works with another URL, but not with "sanctions.nazk.gov.ua".

It workd with String json = readUrl("http://www.javascriptkit.com/dhtmltutors/javascriptkit.json");
Itdoesn't work with String json = readUrl("https://sanctions.nazk.gov.ua/api/person/53");

## Python code

The "sanctions.nazk.gov.ua" URL can be retrieved using the following six lines pasted in "https://www.programiz.com/python-programming/online-compiler/"

import requests
headers= {'User-Agent': ''}
url="https://sanctions.nazk.gov.ua/api/person/53/"
response = requests.get (url, headers=headers)
data = response.json()
print(data)
