
create table package (
    id int primary key generated always as identity,
    name text not null
);

insert into package (name) values
    ('react'),
    ('angular');