CREATE TABLE brand(
id SERIAL,
brandName varchar ,
brandNameTn varchar ,
brandDescriptionTn varchar,
brandDescription varchar,

UNIQUE(brandName,brandNameTn),
CONSTRAINT brandpkey PRIMARY KEY (id)
)


