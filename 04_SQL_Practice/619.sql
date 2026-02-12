select max(num) as num
 from MyNumbers
  as num
 in (select num from MYNumbers group by num having count(num) = 1);