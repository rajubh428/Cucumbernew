Feature: Gmail home page title
@Smoketest
Scenario: validate gmail home page title
Given launch gmail site 
Then title is "Gmail" for homepage
And close site
Scenario: validate user id visibility
Given launch gmail site
Then userid field is displyed
And close site