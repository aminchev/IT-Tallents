select concat(department_name, ' d') as Department from hr.departments
union
select concat(region_name, ' r') from hr.regions
union 
select concat(country_name, ' co') as f from hr.countries
union 
select concat(city, ' ci') from hr.locations
order by Department