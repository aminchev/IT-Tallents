select e.first_name, e.last_name, department_name, city from employees e
join employees m
on(e.employee_id = m.manager_id)
join departments d
on(e.department_id = d.department_id) -- тук  при смяна на е.с m. не работи коректно??
join locations l
on(d.location_id = l.location_id)
group by e.first_name, e.last_name
having count(e.manager_id) = 5
