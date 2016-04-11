select first_name, last_name, salary as 'Mounth Salaray', salary/20 as 'Day Salary', salary/160 as 'Hour Salary'
from hr.employees
order by salary desc;