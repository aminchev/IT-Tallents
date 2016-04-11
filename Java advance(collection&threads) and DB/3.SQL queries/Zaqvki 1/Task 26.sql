select e.first_name, e.last_name
from employees e
join job_history jh
on(jh.employee_id = e.employee_id) and e.department_id = 80;


