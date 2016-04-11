insert into groups (group_id,group_name) values 
(null, 'FourtGropu'), 
(null, 'FifthGroup'), 
(null, 'SixGroup');



alter table users add group_id int;

alter table users add constraint users_groups_fk foreign key(group_id) references groups(group_id);

update users set group_id = 1
where users_id = 3;
