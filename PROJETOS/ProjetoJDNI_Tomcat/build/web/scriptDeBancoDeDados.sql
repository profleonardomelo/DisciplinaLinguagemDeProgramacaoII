CREATE SCHEMA IF NOT EXISTS `bancoabc`;

USE `bancoabc` ;

CREATE TABLE IF NOT EXISTS `conta` (
  `id` int NOT NULL AUTO_INCREMENT,
  `numero` int NOT NULL,
  `saldo` double NOT NULL,
  `limite` double NOT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `conta` (`numero`, `saldo`, `limite`)
SELECT 1234, 1000, 100
WHERE NOT EXISTS (
    SELECT 1 FROM `conta` WHERE `id` = 1
);

INSERT INTO `conta` (`numero`, `saldo`, `limite`)
SELECT 2345, 2000, 200
WHERE NOT EXISTS (
    SELECT 1 FROM `conta` WHERE `id` = 2
);

INSERT INTO `conta` (`numero`, `saldo`, `limite`)
SELECT 3456, 3000, 300
WHERE NOT EXISTS (
    SELECT 1 FROM `conta` WHERE `id` = 3
);

