create table admins
(
    id       integer not null
        constraint admins_pkey
            primary key,
    name     text    not null,
    email    text    not null,
    password text    not null
);
insert into admins
values (1,'Zhomart','zhomart@mail.com','zhomart');