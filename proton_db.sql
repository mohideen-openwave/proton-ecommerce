/*
SQLyog Community v13.1.9 (64 bit)
MySQL - 5.5.8 : Database - protondb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
USE `protondb`;

/*Table structure for table `order_products` */

CREATE TABLE `order_products` (
  `product_id` int(11) DEFAULT NULL,
  `orders_id` int(11) DEFAULT NULL,
  `id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `order_products` */

insert  into `order_products`(`product_id`,`orders_id`,`id`) values 
(1,1,1);

/*Table structure for table `orders` */

CREATE TABLE `orders` (
  `id` int(11) DEFAULT NULL,
  `customer_name` varchar(200) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `order_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `orders` */

insert  into `orders`(`id`,`customer_name`,`product_id`,`order_date`) values 
(1,'mohideen',1,'2025-01-17 19:02:40');

/*Table structure for table `product` */

CREATE TABLE `product` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `price` varchar(200) DEFAULT NULL,
  `image_url` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `product` */

insert  into `product`(`id`,`name`,`description`,`price`,`image_url`) values 
(1,'bost','offer price',NULL,NULL),
(2,'ToothPast','Medical care tooth past','50.70','/image/Closeup.jpg');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
