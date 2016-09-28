#Author:ramireddy591@gmail.com

@tag
Feature: Facebook Page


@tag1
Scenario Outline: Facebook valid Login
Given Browser as "<browser>" And Url as "<url>"
When Username as "<user>" And Password as "<pass>"
Then Facebook Should be login Sucessfully

Examples:
    | browser  |url                     | user                      |pass       |
    | firefox |http://www.facebook.com  |ramireddy51@gmail.com      |9989593467 |
    | Chrome  |http://www.facebook.com  |ramireddy591@gmail.com     |998959467  |
    | IE      |http://www.facebook.com  |ramireddy591@gmail.com     |9989593467 |
    