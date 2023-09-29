CREATE DATABASE livraria;

USE livraria;

CREATE TABLE cliente (
    id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    telefone bigint NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE livro (
    id INT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(45) NOT NULL,
    ano INT NOT NULL,
    paginas INT NOT NULL,
    autores VARCHAR(100) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (`id`) 
);
