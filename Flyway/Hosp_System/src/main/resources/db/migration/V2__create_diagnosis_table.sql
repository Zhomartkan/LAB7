create table diagnosis
(
    id        integer not null
        constraint diagnosis_pkey
            primary key,
    name      text    not null,
    treatment text    not null
);
insert into diagnosis
values (1,'COVID','treatment'),
       (2,'diagnosis2','treatment');
