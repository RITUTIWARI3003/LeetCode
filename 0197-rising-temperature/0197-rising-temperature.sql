# Write your MySQL query statement below

SELECT W1.ID FROM WEATHER W  JOIN WEATHER W1 WHERE DATEDIFF(W1.RECORDDATE, W.RECORDDATE) = 1 AND 
W1.TEMPERATURE > W.TEMPERATURE;