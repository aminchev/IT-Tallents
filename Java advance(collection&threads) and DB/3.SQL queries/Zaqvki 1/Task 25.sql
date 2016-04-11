select e.first_name, e.last_name, e.department_id
from hr.employees e
where department_id in(80, 100)
and hire_date between '1995-01-01' and '2000-01-01'