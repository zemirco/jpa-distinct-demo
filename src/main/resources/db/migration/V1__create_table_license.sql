
create table license (
    id int primary key generated always as identity,
    name text not null
);

insert into license (name) values
    ('mit'),
    ('isc');