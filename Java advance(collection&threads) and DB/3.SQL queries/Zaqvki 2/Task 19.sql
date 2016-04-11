select date_format(now(),'%T %d/%m/%y');

select date_add(now(), interval 1 week);

select date_format(date_add(now(), interval 1 week),'%T %d/%m/%y')