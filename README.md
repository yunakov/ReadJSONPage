# ReadJSONPage

Java works with another URL, but not the "sanctions.nazk.gov.ua" URL.

When the code is called with String json = readUrl("http://www.javascriptkit.com/dhtmltutors/javascriptkit.json"); it works
When the code is called with String json = readUrl("https://sanctions.nazk.gov.ua/api/person/53"); it doesn't works

The "sanctions.nazk.gov.ua" URL can be retrieved using the following six lines pasted in "https://www.programiz.com/python-programming/online-compiler/"

import requests
headers= {'User-Agent': ''}
url="https://sanctions.nazk.gov.ua/api/person/53/"
response = requests.get (url, headers=headers)
data = response.json()
print(data)
