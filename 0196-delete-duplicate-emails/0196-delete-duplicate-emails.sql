# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below
DELETE P FROM PERSON P  JOIN PERSON P1 WHERE P.EMAIL = P1.EMAIL AND  P.ID > P1.ID;
