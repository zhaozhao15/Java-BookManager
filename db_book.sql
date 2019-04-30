/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.1.49-community : Database - db_book
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_book` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `db_book`;

/*Table structure for table `t_book` */

DROP TABLE IF EXISTS `t_book`;

CREATE TABLE `t_book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bookName` varchar(20) DEFAULT NULL,
  `author` varchar(20) DEFAULT NULL,
  `nationality` varchar(20) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `bookTypeId` int(11) DEFAULT NULL,
  `bookDesc` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `bookTypeId` (`bookTypeId`),
  CONSTRAINT `t_book_ibfk_2` FOREIGN KEY (`bookTypeId`) REFERENCES `t_booktype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

/*Data for the table `t_book` */

insert  into `t_book`(`id`,`bookName`,`author`,`nationality`,`price`,`bookTypeId`,`bookDesc`) values (21,'高等数学','cky','中国',30,12,'高等数学 cky'),(22,'量子物理','费曼','外国',80,13,'量子物理 费曼'),(23,'算法导论','尼尔森','外国',100,14,'算法导论 尼尔森'),(24,'线性代数','张宇','中国',30,12,'线性代数 数学');

/*Table structure for table `t_booktype` */

DROP TABLE IF EXISTS `t_booktype`;

CREATE TABLE `t_booktype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bookTypeName` varchar(20) DEFAULT NULL,
  `bookTypeDesc` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

/*Data for the table `t_booktype` */

insert  into `t_booktype`(`id`,`bookTypeName`,`bookTypeDesc`) values (12,'数学','数学相关'),(13,'物理','物理相关'),(14,'计算机','计算机相关'),(15,'化学','化学相关'),(16,'生物','生物相关'),(17,'地理','地理相关'),(18,'历史','历史相关'),(19,'语文',NULL);

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `t_user` */

insert  into `t_user`(`id`,`userName`,`password`) values (1,'java1234','123456'),(2,'zhao','123456');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
