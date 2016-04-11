select j.job_title, d.department_name
from hr.jobs j
join hr.employees e
on(j.job_id = e.job_id)
join hr.departments d
on(e.department_id = d.department_id)