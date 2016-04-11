select first_name, last_name , salary 
from employees
where salary = 
(select min(salary) from employees);

