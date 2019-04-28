Feature: Gmail  login
Scenario Outline: validate user id
Given launch gmail site
When enter user id as "<x>"
And click userid next
Then validate output for "<y>" criteria
And close site
 Examples: 
      | x                       |     y         | 
      | rajubh428@gmail.com     |     valid     | 
      | rajubh@gmail.com        |     invalid   | 
      |                         |     invalid   | 
      
Scenario Outline:validate password
Given launch gmail site
When enter user id as "rajubh428@gmail.com"
And click userid next
When enter password as "<x>"
And click password next
Then validate result for "<y>" criteria
And close site

 Examples: 
      | x               |     y         | 
      | bh7382126728    |     valid     | 
      | bh738212        |     invalid   | 
      |                 |     invalid   | 
      