
create table version (
    id int primary key generated always as identity,
    pkg_id int not null references package,
    license_id int references license,
    version text not null
);

insert into version (pkg_id, license_id, version) values
    (1, 1, '17.0.0'),
    (1, 1, '16.0.0'),
    (1, 1, '15.0.0'),

    (2, 2, '1.0.0'),
    (2, 2, '2.0.0'),
    (2, 2, '3.0.0'),
    (2, 2, '4.0.0');
