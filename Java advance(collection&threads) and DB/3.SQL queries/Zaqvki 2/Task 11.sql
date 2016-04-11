select d.department_name, coalesce(j.job_title, 'Nqma rabotni imena') as 'Job Title', count(employee_id) from employees e
join  jobs j
on(e.job_id = j.job_id)
right join departments d
on(e.department_id = d.department_id)
group by d.department_name, job_title