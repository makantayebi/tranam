# NAM نام
Convert names between Latin Script and Modern Persian Script.
تبدیل نام از رسم‌الخط فارسی مدرن، به لاتین


## Description

* Write the following algorithm: 

1. Anything past the first parenthesis is removed from the query.
2. If a first or last name is queried, check against the existing list of firstname.csv or lastname.csv and return if match found.
3. If the exact string is not found, check the other csv file (first>last, or last>first) for an exact match. return if match found.
4. If match is not found, but the Persian query has a space or half-space, split the query into substrings, via the whitespace. Search for each substring separately, and concat the result back together and return the result. Log the substrings and their result.
5. If match is not found, add the query in a new line to the file backlog.txt

In Persian string matching:
* Ignore the space or half-space
* Following chars are ignored: َ  - ُ  -  ِ   -  ّ  - ، -  ء - ً  - ٌ  - ٍ 
* ة=ه
* ئ=ي=ی
* 

## TODO
Write the above algorithm
