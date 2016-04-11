select first_name, last_name from hr.employees
where last_name like '%ei%';

select concat(first_name, ' ', last_name) as 'FullName'
from hr.employees
where last_name like '%ei%'