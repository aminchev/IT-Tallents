select d.department_name,  coalesce(concat(first_name, ' ', last_name), 'No manager') as 'Manager'
from employees e
right outer join departments d
on(d.manager_id = e.employee_id)
