
CREATE TABLE product (
    id UUID,
    nome VARCHAR(255),
    sobrenome VARCHAR(50),
    PRIMARY KEY (id)
);

CREATE TABLE product_redis (
    id UUID,
    nome VARCHAR(255),
    sobrenome VARCHAR(50),
    PRIMARY KEY (id)
);