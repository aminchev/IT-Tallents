select first_name, last_name, salary
from hr.employees
where salary
between 3000 and 5000
order by salary