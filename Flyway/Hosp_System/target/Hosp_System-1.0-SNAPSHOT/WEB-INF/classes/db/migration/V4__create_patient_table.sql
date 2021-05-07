create table patients
(
    id        integer not null
        constraint patients_pkey
            primary key,
    name      text    not null,
    email     text    not null,
    password  text    not null,
    diagnosis text    not null
);
insert into patients
values (1,'patient1','patient.1@mail.com','patient1','diagnosis1'),
(2,'patient2','patient.2@mail.com','patient2','diagnosis2');