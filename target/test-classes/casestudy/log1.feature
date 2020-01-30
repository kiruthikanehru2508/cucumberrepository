Feature: login
Scenario Outline: login with multiple reg
* User lauches googleapplication
* User launches TestMe
* User clicks SignIn
* User enters "<username>"
* User enters as "<password>"
* User clicks login
Examples:
|username|password|
|kirthi|kirthi123|
|Lalitha|Password123|