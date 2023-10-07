CREATE SCHEMA IF NOT EXISTS `bancoabc_camadas`;

USE `bancoabc_camadas` ;

CREATE TABLE IF NOT EXISTS `conta` (
  `id` int NOT NULL AUTO_INCREMENT,
  `numero` int NOT NULL,
  `saldo` double NOT NULL,
  `limite` double NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `acesso` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `usuario` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(70) NOT NULL,
  PRIMARY KEY (`id`));

INSERT INTO `acesso` (`usuario`, `senha`)
SELECT 'admin', '1234'
WHERE NOT EXISTS (
    SELECT 1 FROM `acesso` WHERE `id` = 1
);