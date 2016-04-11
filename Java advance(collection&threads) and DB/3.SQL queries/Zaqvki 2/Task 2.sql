select count(*) from employees e
join departments d
on(e.department_id = d.department_id)
where department_name = 'Sales';