# NAM نام
Convert names between Latin Script and Modern Persian Script.
تبدیل نام از رسم‌الخط فارسی مدرن، به لاتین


## Description

* Write the following algorithm: 

* [x] remove paranthesis from the query, but not the content.
* [x] If a first or last name is queried, check against the existing list of firstname.csv or lastname.csv and return if match found.
* [x] If the exact string is not found, check the other csv file (first>last, or last>first) for an exact match. return if match found.
* [x] If match is not found, but the Persian query has a space or half-space, split the query into substrings, via the whitespace. Search for each substring separately, and concat the result back together and return the result. Log the substrings and their result.
* [ ] If match is not found, add the query in a new line to the file backlog.txt
* [ ] If there is paranthesis in a record, produce the result, but warn the user
* [ ] If anything except these letters  [‌‌آبپتث‌جچحخدذرزژسشصضطظعغفقکگلمنوهی‌] and the ignore list comes up, warn the user.

In Persian string matching:
* [x] Ignore the space or half-space
* [x] Following chars are ignored: َ  - ُ  -  ِ  -  ّ  - ، -  ء - ً  - ٌ  - ٍ   ّ
* [x] ة=ه
* [x] ي=ی

## Get started
* On Ubuntu, make sure gradle is installed.
* To run the JUnit Tests, run `./gradlew test --info`