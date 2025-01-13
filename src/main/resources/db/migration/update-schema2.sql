ALTER TABLE jc_mentor
DROP
FOREIGN KEY FK3n10nf4jdfcxu30dmqndwerar;

ALTER TABLE jc_instructor
DROP
FOREIGN KEY FKhgq7c5es8nf1vihvymk3kqdlt;

CREATE TABLE test_model
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    created_at datetime NULL,
    updated_at datetime NULL,
    status     SMALLINT NULL,
    text_field VARCHAR(255) NULL,
    CONSTRAINT pk_testmodel PRIMARY KEY (id)
);

ALTER TABLE jc_instructor
    ADD user_id BIGINT NULL;

ALTER TABLE jc_mentor
    ADD user_id BIGINT NULL;

ALTER TABLE st_user
    ADD user_type INT NULL;

UPDATE st_user
SET user_type = 'st_user'
WHERE user_type is null;

ALTER TABLE jc_instructor
    ADD CONSTRAINT FK_JC_INSTRUCTOR_ON_USER FOREIGN KEY (user_id) REFERENCES jc_user (id);

ALTER TABLE jc_mentor
    ADD CONSTRAINT FK_JC_MENTOR_ON_USER FOREIGN KEY (user_id) REFERENCES jc_user (id);

DROP TABLE testtable;

ALTER TABLE jc_instructor
DROP
COLUMN id;

ALTER TABLE jc_mentor
DROP
COLUMN id;

ALTER TABLE st_user
DROP
COLUMN dtype;

ALTER TABLE st_user
    MODIFY no_of_hours INT NOT NULL;

ALTER TABLE st_user
    MODIFY ratings INT NOT NULL;

ALTER TABLE jc_instructor
    ADD PRIMARY KEY (user_id);

ALTER TABLE jc_mentor
    ADD PRIMARY KEY (user_id);