
SELECT user_id ,
 count(distinct(follower_id)) as foloower_count
  from Followers 
  group by user_id 
  order by user_id ;
    