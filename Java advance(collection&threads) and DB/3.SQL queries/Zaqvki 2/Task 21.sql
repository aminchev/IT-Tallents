insert into users values
(null, 'Iliq3', 24214, 'Iliq Iliev', date_sub(now(), interval 3 day));

create view person_today as
select username from users
where lastLogin>date_sub(now(), interval 1 day)