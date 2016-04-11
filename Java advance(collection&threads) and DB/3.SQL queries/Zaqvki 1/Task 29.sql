select concat(e.first_name,' ' ,e.last_name) as 'Employee Name', j.job_title, d.department_name, l.city, c.country_name, r.region_name
from jobs j
join employees e
on(j.job_id = e.job_id)
join departments d
on(e.department_id = d.department_id)
join locations l
on(d.location_id = l.location_id)
join countries c
on(l.country_id = c.country_id)
join regions r
on(c.region_id = r.region_id)