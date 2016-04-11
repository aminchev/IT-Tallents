select count(*) from departments d
where d.manager_id is not null;

select count(*) from departments d
join employees e
on(d.manager_id = e.employee_id)