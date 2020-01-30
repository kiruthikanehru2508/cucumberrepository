$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/casestudy/product.feature");
formatter.feature({
  "name": "check product",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user should not move forward without adding product to the cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User opens the chromeapp",
  "keyword": "* "
});
formatter.match({
  "location": "prod.user_opens_the_chromeapp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens the testme app",
  "keyword": "* "
});
formatter.match({
  "location": "prod.user_opens_the_testme_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User SignIn",
  "keyword": "* "
});
formatter.match({
  "location": "prod.user_SignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username as \"Lalitha\"",
  "keyword": "* "
});
formatter.match({
  "location": "prod.user_enters_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User  enters Password as \"Password123\"",
  "keyword": "* "
});
formatter.match({
  "location": "prod.user_enters_Password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks login button",
  "keyword": "* "
});
formatter.match({
  "location": "prod.user_clicks_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User search for the product he wants",
  "keyword": "* "
});
formatter.match({
  "location": "prod.user_search_for_the_product_he_wants()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User cant move to next page without adding to next page",
  "keyword": "* "
});
formatter.match({
  "location": "prod.user_cant_move_to_next_page_without_adding_to_next_page()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [cart] but found [Add to cart]\r\n\tat org.testng.Assert.fail(Assert.java:97)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:136)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:575)\r\n\tat org.testng.Assert.assertEquals(Assert.java:585)\r\n\tat cucumbercs.prod.user_cant_move_to_next_page_without_adding_to_next_page(prod.java:66)\r\n\tat ✽.User cant move to next page without adding to next page(src/test/resources/casestudy/product.feature:10)\r\n",
  "status": "failed"
});
});