CREATE SCHEMA persons_schema

CREATE TABLE persons_schema.Persons (
    name VARCHAR NOT NULL,
    surname VARCHAR NOT NULL,
    age INT NOT NULL,
    phone_number VARCHAR NOT NULL,
    city_of_living VARCHAR NOT NULL,
    PRIMARY KEY(name, surname, age)
)

insert into public.persons (
    "age",
    "name",
    surname,
    city_of_living,
    phone_number)
values (
    17,
    'Dmitriy',
    'Ivanovich',
    'Moscow',
    '12345678')
;