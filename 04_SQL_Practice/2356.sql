-- Number of Unique Subjects Taught by Each Teacher

--+-------------+------+
--| Column Name | Type |
--+-------------+------+
--| teacher_id  | int  |
--| subject_id  | int  |
--| dept_id     | int  |
--+-------------+------+

--Write a solution to calculate the number of unique subjects each teacher teaches in the university.


# Write your MySQL query statement below
select teacher_id, count(distinct subject_id) as cnt
from Teacher
group by teacher_id
order by teacher_id;