select d.department_name, l.city
from hr.departments d
join hr.locations l
on(d.location_id = l.location_id)