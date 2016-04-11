select concat(e.first_name,' ' ,e.last_name) as 'Full Name', r.region_name
from hr.employees e
join hr.departments d
on (e.department_id = d.department_id)
join hr.locations l
on (d.location_id = l.location_id)
join hr.countries c
on(l.country_id = c.country_id)
join hr.regions r
on (c.region_id = r.region_id)