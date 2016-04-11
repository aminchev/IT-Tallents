select department_name, city
from hr.departments 
join hr.locations 
using(location_id)