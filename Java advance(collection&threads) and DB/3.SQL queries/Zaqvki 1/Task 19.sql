select d.department_name, concat(e.first_name,' ' ,e.last_name) as 'Manager name', l.city
from hr.departments d
join hr.locations l
on(d.location_id = l.location_id)
join employees e
on(d.manager_id = e.employee_id);

select d.department_name, concat(e.first_name,' ' ,e.last_name) as 'Manager name', l.city
from hr.departments d
join hr.locations l
on(d.location_id = l.location_id)
left outer join employees e
on(d.manager_id = e.employee_id);