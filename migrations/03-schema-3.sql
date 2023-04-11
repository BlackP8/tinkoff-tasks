--liquibase formatted sql

--changeset nvoxland:1
create table LinkChat (
    link_id int,
    chat_id int,
    CONSTRAINT fk_link
        FOREIGN KEY(link_id)
            REFERENCES Link(id),
    CONSTRAINT fk_chat
        FOREIGN KEY(chat_id)
            REFERENCES Chat(id)
);