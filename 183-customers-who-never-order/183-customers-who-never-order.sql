# Write your MySQL query statement below

SELECT customers.name AS Customers
FROM
customers
WHERE NOT EXISTS (SELECT 1 FROM Orders WHERE
                  Orders.customerId = Customers.id)