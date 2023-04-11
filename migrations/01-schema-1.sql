--liquibase formatted sql

--changeset nvoxland:1
create table Link (
    id int primary key,
    url varchar(100)
);