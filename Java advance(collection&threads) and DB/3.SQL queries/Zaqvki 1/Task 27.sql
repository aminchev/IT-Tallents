select concat(e.first_name,' ', e.last_name) as 'Employee', concat(m.first_name,' ',m.last_name) as 'His Manager'
from employees e
join employees m
on(m.employee_id = e.manager_id);




