--liquibase formatted sql

--changeset nvoxland:1
create table Chat (
    id int primary key,
    name varchar(100)
);