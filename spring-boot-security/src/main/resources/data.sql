insert into users(username, password, enabled) 
values('user','pass',true);

insert into users(username, password, enabled) 
values('admin','pass',true);

insert into authorities(username, authority) 
values('user','ROLE_user');

insert into authorities(username, authority) 
values('admin','ROLE_admin');
