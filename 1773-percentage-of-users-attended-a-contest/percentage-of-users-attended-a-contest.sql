# Write your MySQL query statement below
select contest_id,round((count(distinct user_id)/(select count(user_id)from users))*100,2) percentage from Register
group by contest_id
order by percentage desc,1