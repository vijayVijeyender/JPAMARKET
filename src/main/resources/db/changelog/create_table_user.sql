CREATE TABLE users(
loginId varchar NOT NULL,
igg varchar,
firstName varchar,
lastName varchar,
email varchar,
updatedDate timestamp,

CONSTRAINT userpkey PRIMARY KEY (loginId)
);
