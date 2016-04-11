select l.city, c.country_name
from hr.locations l 
join hr.countries c
on (l.country_id = c.country_id)