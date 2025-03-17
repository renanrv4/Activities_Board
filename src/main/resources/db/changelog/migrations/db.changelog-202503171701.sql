--liquibase formatted sql
--changeset renan:202503171701
--comment: set unblock reason nullable

ALTER TABLE BLOCKS MODIFY COLUMN unblock_reason VARCHAR(255) NULL;

--rollback DROP TABLE BLOCKS
