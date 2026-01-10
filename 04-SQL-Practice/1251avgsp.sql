-- leetcode 1251 : average selling price 
select p.product_id , ROUND( 
    IFNULL(SUM(p.price*u.units)/Sum(u.units),0),2) as Average_price  
     from Prices p  left join UnitsSold u  on p.product_id =u.product_id AND  u.purchase_date BETWEEN p.start_date AND p.end_date GROUP BY p.product_id;