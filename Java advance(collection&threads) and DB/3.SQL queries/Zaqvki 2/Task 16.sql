select first_name, last_name from employees
where substr(first_name,1,1) like substr(last_name,1,1)