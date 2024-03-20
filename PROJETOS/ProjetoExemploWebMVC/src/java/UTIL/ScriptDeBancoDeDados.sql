CREATE DATABASE IF NOT EXISTS `bancoabc_web_mvc`;

USE `bancoabc_web_mvc`;

CREATE TABLE IF NOT EXISTS `conta` (
`id` int NOT NULL AUTO_INCREMENT, 
`numero` int NOT NULL,
`saldo` double NOT NULL,
`limite` double NOT NULL,
PRIMARY KEY (`id`));
