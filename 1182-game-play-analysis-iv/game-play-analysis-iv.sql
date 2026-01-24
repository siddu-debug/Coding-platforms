select 
    round(
        count(distinct a.player_id) / 
        (select count(distinct player_id) from activity),
        2
    ) as fraction
from activity a
join activity b
on a.player_id = b.player_id
and datediff(b.event_date, a.event_date) = 1
where a.event_date = (
    select min(event_date)
    from activity
    where player_id = a.player_id
);
