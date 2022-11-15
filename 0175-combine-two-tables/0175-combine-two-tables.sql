# Write your MySQL query statement below

SELECT p.firstName , p.lastName ,a.city , a.state from  person as p  left JOIN Address as a On p.personId = a.personId;