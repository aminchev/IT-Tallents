create table users(
	users_id int primary key auto_increment,
    username varchar(50) unique not null,
    userPass varchar(20) not null,
    fullname varchar(50),
    lastLogin datetime
);

create trigger auto_name before insert on users
for each row
set new.fullname = 'nekvo ime';