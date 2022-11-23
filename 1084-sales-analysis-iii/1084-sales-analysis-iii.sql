# Write your MySQL query statement below
select  distinct product.product_id , product.product_name from product join sales s on product.product_id = s.product_id
group by s.product_id 
having 
min(s.sale_date) >= '2019-01-01' and max(s.sale_date)<='2019-03-31'