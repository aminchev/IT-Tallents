select count(*) from departments
where manager_id is null;

select count(*) from departments d
left join employees e
on(d.manager_id = e.employee_id)
where d.manager_id is null