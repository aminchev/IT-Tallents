select e.first_name, e.last_name, e.salary 
from employees e
where e.salary<
(select min(salary)*1.1 from employees)



