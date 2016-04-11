select e.first_name, e.last_name, d.department_name, l.city
from hr.employees e
join hr.departments d
on(d.manager_id = e.employee_id)
join hr.locations l
on(d.location_id = l.location_id)