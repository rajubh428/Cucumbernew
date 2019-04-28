$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/batch365/Cucumber/adwize2/src/test/resources/feature/f1.feature");
formatter.feature({
  "line": 1,
  "name": "Gmail home page title",
  "description": "",
  "id": "gmail-home-page-title",
  "keyword": "Feature"
});
formatter.before({
  "duration": 213998,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "validate gmail home page title",
  "description": "",
  "id": "gmail-home-page-title;validate-gmail-home-page-title",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "launch gmail site",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title is \"Gmail\" for homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "close site",
  "keyword": "And "
});
formatter.match({
  "location": "Gmailmethods.method2()"
});
formatter.result({
  "duration": 31273242930,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gmail",
      "offset": 10
    }
  ],
  "location": "Gmailmethods.method3(String)"
});
formatter.write("test is passed");
formatter.result({
  "duration": 25758308,
  "status": "passed"
});
formatter.match({
  "location": "Gmailmethods.method4()"
});
formatter.result({
  "duration": 7128813095,
  "status": "passed"
});
});