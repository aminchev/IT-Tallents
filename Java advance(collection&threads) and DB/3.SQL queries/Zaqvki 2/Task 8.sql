select d.department_name, concat(e.first_name, ' ', e.last_name) as 'Manager', count(*) as 'Count of employees' from departments d
join employees e
on(d.manager_id = e.employee_id)
join employees m
on(e.employee_id = m.manager_id)
group by d.department_name, 'Manager'