CREATE SCHEMA IF NOT EXISTS `bancoabc`;

USE `bancoabc`;

CREATE TABLE IF NOT EXISTS `cliente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(65) NOT NULL,
  `cpf` bigint NOT NULL,
  `email` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `cliente` (`nome`, `cpf`, `email`)
SELECT 'ana', 12345677890, 'ana@zmail.com' 
WHERE NOT EXISTS (
    SELECT 1 FROM `cliente` WHERE `id` = 1
);

INSERT INTO `cliente` (`nome`, `cpf`, `email`)
SELECT 'maria', 9876543210, 'maria@zmail.com' 
WHERE NOT EXISTS (
    SELECT 1 FROM `cliente` WHERE `id` = 2
);

INSERT INTO `cliente` (`nome`, `cpf`, `email`)
SELECT 'joão', 9182736450, 'joao@zmail.com' 
WHERE NOT EXISTS (
    SELECT 1 FROM `cliente` WHERE `id` = 3
);

CREATE TABLE IF NOT EXISTS `conta` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `numero` INT NOT NULL,
  `saldo` DOUBLE NOT NULL,
  `limite` DOUBLE NOT NULL,
  `cliente_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_conta_cliente` FOREIGN KEY (`cliente_id`) REFERENCES `bancoabc`.`cliente` (`id`)
 );

CREATE TABLE IF NOT EXISTS `acesso` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `usuario` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(70) NOT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `acesso` (`usuario`, `senha`)
SELECT 'admin', '1234'
WHERE NOT EXISTS (
    SELECT 1 FROM `acesso` WHERE `id` = 1
);
