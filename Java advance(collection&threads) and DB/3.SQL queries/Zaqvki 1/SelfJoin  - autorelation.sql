select e.first_name, m.first_name
from employees e
join employees m
on(e.employee_id = m.manager_id)