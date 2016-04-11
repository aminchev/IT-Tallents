select l.city, d.department_name
from departments d
left join locations l
on(l.location_id = d.location_id)
