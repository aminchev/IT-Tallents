select d.department_name, avg(e.salary) from departments d
join employees e
on(d.department_id = e.department_id)
group by d.department_name
