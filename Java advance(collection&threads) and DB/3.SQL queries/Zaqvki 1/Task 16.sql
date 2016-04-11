select department_name, city
from hr.departments 
natural join hr.locations;

select department_name, city
from hr.departments d
join hr.locations l
on(d.location_id = l.location_id)