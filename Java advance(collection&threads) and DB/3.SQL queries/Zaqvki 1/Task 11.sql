select first_name, last_name, salary
from hr.employees
where salary between 2000 and 5000
or salary between 10000 and 15000
-- no MINUS in MySQL
