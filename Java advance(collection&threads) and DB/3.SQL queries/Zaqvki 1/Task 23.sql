select e.first_name, e.last_name, d.department_name
from hr.employees e
join hr.departments d
on(d.manager_id = e.employee_id)