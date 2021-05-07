create table doctors
(
    id       integer not null
        constraint doctors_pkey
            primary key,
    name     text    not null,
    email    text    not null,
    password text    not null
);
insert into doctors
values (1,'john','john@mail.com','john'),
       (2,'doctor2','doctor.2@mail.com','doctor2');