select d.department_name, count(*), l.city 
from departments d
right join employees e
on(d.department_id = e.department_id)
left join locations l
on(d.location_id = l.location_id)
group by d.department_name