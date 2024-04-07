CREATE TABLE product(
id SERIAL,
productName varchar,
productNameTn varchar,
cid INTEGER,
bid INTEGER,
productUnit varchar,
productSellingPrice DECIMAL,
productCostPrice DECIMAL,

CONSTRAINT productpkey PRIMARY KEY (id),
CONSTRAINT fk_product_brand_id FOREIGN KEY (bid) REFERENCES brand(id),
CONSTRAINT fk_product_category_id FOREIGN KEY (cid) REFERENCES category(id)
);