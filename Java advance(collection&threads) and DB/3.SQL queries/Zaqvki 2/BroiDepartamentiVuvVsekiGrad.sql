select l.city, count(d.department_id) from locations l
join departments d
on(l.location_id = d.location_id)
group by l.city