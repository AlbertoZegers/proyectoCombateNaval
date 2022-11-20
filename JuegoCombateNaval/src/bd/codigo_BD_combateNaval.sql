/*
SQLyog - Free MySQL GUI v5.11
Host - 5.5.24-log : Database - bd
*********************************************************************
Server version : 5.5.24-log
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `bd`;

USE `bd`;

/*Table structure for table `computador` */

DROP TABLE IF EXISTS `computador`;

CREATE TABLE `computador` (
  `partida` int(5) NOT NULL AUTO_INCREMENT,
  `estado` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`partida`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `computador` */

/*Table structure for table `jugador` */

DROP TABLE IF EXISTS `jugador`;

CREATE TABLE `jugador` (
  `id` varchar(10) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `alias` varchar(10) DEFAULT NULL,
  `victorias` int(5) DEFAULT NULL,
  `derrotas` int(5) DEFAULT NULL,
  `partidas` int(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `jugador` */
