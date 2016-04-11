select count(*) from locations l
join departments d
on(l.location_id = d.location_id);


select count(l.location_id) from locations l
join departments d
on(l.location_id = d.location_id);


