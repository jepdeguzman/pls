CREATE DATABASE  IF NOT EXISTS `plsdb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `plsdb`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: plsdb
-- ------------------------------------------------------
-- Server version	5.5.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `emp_id` varchar(7) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(45) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `role` varchar(25) NOT NULL,
  `shift` varchar(5) DEFAULT 'REG',
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES ('101466','rejie.supsupin','password123','Rejie Ann','Supsupin','Employee','1ST'),('102216','abigail.mondea','password123','Abigail','Moneda','Employee','1ST'),('109356','renza.gabuat','password123','Renza','Gabuat','Employee','3RD'),('109919','dexter.bobis','password123','Dexter John','Bobis','Employee','2ND'),('110016','bryan.deleon','password123','Bryan Ignacius','De Leon','Employee','3RD'),('110104','almie.macasaquit','password123','Almie','Macasaquit','Employee','REG'),('110105','julius.torrente','password123','Julius','Torrente','Employee','REG'),('110106','swilene.andrade','password123','Swilene','Andrade','Employee','REG'),('111316','benji.rinion','password123','Benji','Rinion','Employee','1ST'),('111896','julie.mendoza','password123','Julie Ann','Mendoza','Employee','1ST'),('119646','mabel.francisco','password123','Mabel','Francisco','Employee','3RD'),('120018','herbert.beramo','password123','Herbert','Beramo','Employee','2ND'),('120116','isah.capricho','password123','Isah Jade','Capricho','Employee','3RD'),('120119','arlene.pangkalinawan','password123','Arlene','Pagkalinawan','Employee','REG'),('120134','julien.castilar','password123','Julien Rechie','Castilar','Employee','REG'),('120290','john.balasabas','password123','John Carlos','Balasabas','Employee','REG'),('121166','aime.resubal','password123','Aime Anne','Resubal','Employee','1ST'),('121576','jen.martinez','password123','Jen Sherrina Marie','Martinez','Employee','3RD'),('129936','john.evangelista','password123','John Michael','Evangelista','Employee','3RD'),('130117','von.bandoja','password123','Von Albert','Bandoja','Employee','2ND'),('130121','john.possel','password123','John Cyrus','von Possel','Employee','1ST'),('130216','maria.cabajar','password123','Maria Jasmin','Cabajar','Employee','2ND'),('131016','nikko.ocampo','password123','Nikko','Ocampo','Employee','1ST'),('131256','dickson.lua','password123','Dickson Albert','Lua','Employee','3RD'),('140216','darwin.asuncion','password123','Darwin Christian','Asuncion','Employee','2ND'),('140226','ericka.duque','password123','Ericka Joyce','Duque','Employee','3RD'),('140316','molly.bonzon','password123','Molly','Bonzon','Employee','2ND'),('140319','jennie.villanueva','password123','Jennie','Villanueva','Employee','1ST'),('140866','hannah.ney','password123','Hannah Jill','Ney','Employee','1ST'),('140936','jacinda.jose','password123','Jacinda','Jose','Employee','3RD'),('150166','claire.fabro','password123','Claire Marie','Fabro','Employee','REG'),('150177','gerrel.atanacio','password123','Gerrel','Atanacio','Employee','REG'),('150179','kevinson.legaspi','password123','Kevinson','Legaspi','Employee','REG'),('150193','lloyd.ludovice','password123','Lloyd','Ludovice','Employee','REG'),('150281','francis.costales','password123','Francis Alvin','Costales','Manager','REG'),('150315','joy.adriano','password123','Joy Ann','Adriano','Employee','REG'),('150326','jezra.alcantara','password123','Jezra','Alcantara','Employee','REG'),('150407','brian.cipriano','password123','Brian','Cipriano','Employee','REG'),('150416','mark.bongalos','password123','Mark Jason','Bongalos','Employee','2ND'),('150516','mark.deleon','password123','Mark Alvin','De Leon','Employee','3RD'),('150517','paulo.ullado','password123','Paulo','Ullado','Employee','1ST'),('150616','john.gida','password123','John Paolo','Gida','Employee','3RD'),('150716','justine.montero','password123','Justine Marie','Montero','Employee','1ST'),('160054','abe.dalit','password123','Abe James','Dalit','Manager','REG'),('160214','jose.manalili','password123','Jose Rafael','Manalili','Manager','REG'),('80070','manuel.macapagal','password123','Manuel','Macapagal','Manager','REG');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_project`
--

DROP TABLE IF EXISTS `employee_project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee_project` (
  `emp_proj_id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_id` varchar(7) NOT NULL,
  `proj_alias` varchar(100) NOT NULL,
  `start_date` datetime NOT NULL,
  `end_date` datetime DEFAULT NULL,
  PRIMARY KEY (`emp_proj_id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_project`
--

LOCK TABLES `employee_project` WRITE;
/*!40000 ALTER TABLE `employee_project` DISABLE KEYS */;
INSERT INTO `employee_project` VALUES (1,'80070','Sergei Rachmaninoff','2010-06-01 00:00:00','2017-12-12 00:00:00'),(2,'110104','Pisces','2011-10-24 00:00:00','2017-12-12 00:00:00'),(3,'110105','Sailor Moon','2012-12-24 00:00:00','2017-12-12 00:00:00'),(4,'110106','BogusProject','2014-06-01 00:00:00','2015-06-01 00:00:00'),(5,'120119','Sergei Rachmaninoff','2010-06-01 00:00:00','2017-12-12 00:00:00'),(6,'120134','Pisces','2011-10-24 00:00:00','2017-12-12 00:00:00'),(7,'120290','Sailor Moon','2012-12-24 00:00:00','2017-12-12 00:00:00'),(8,'150166','BogusProject','2014-06-01 00:00:00','2015-06-01 00:00:00'),(9,'150177','Sergei Rachmaninoff','2010-06-01 00:00:00','2017-12-12 00:00:00'),(10,'150179','Pisces','2011-10-24 00:00:00','2017-12-12 00:00:00'),(11,'150193','Sailor Moon','2012-12-24 00:00:00','2017-12-12 00:00:00'),(12,'150281','BogusProject','2014-06-01 00:00:00','2015-06-01 00:00:00'),(13,'150326','Sergei Rachmaninoff','2010-06-01 00:00:00','2017-12-12 00:00:00'),(14,'150407','Pisces','2011-10-24 00:00:00','2017-12-12 00:00:00'),(15,'160054','Sailor Moon','2012-12-24 00:00:00','2017-12-12 00:00:00'),(16,'160214','BogusProject','2014-06-01 00:00:00','2015-06-01 00:00:00'),(17,'150315','Sergei Rachmaninoff','2010-06-01 00:00:00','2017-12-12 00:00:00'),(18,'140216','Pisces','2011-10-24 00:00:00','2017-12-12 00:00:00'),(19,'130117','Sailor Moon','2012-12-24 00:00:00','2017-12-12 00:00:00'),(20,'120018','BogusProject','2014-06-01 00:00:00','2015-06-01 00:00:00'),(21,'109919','Sergei Rachmaninoff','2010-06-01 00:00:00','2017-12-12 00:00:00'),(22,'150416','Pisces','2011-10-24 00:00:00','2017-12-12 00:00:00'),(23,'140316','Sailor Moon','2012-12-24 00:00:00','2017-12-12 00:00:00'),(24,'130216','BogusProject','2014-06-01 00:00:00','2015-06-01 00:00:00'),(25,'120116','Sergei Rachmaninoff','2010-06-01 00:00:00','2017-12-12 00:00:00'),(26,'110016','Pisces','2011-10-24 00:00:00','2017-12-12 00:00:00'),(27,'150516','Sailor Moon','2012-12-24 00:00:00','2017-12-12 00:00:00'),(28,'140226','BogusProject','2014-06-01 00:00:00','2015-06-01 00:00:00'),(29,'129936','Sergei Rachmaninoff','2010-06-01 00:00:00','2017-12-12 00:00:00'),(30,'119646','Pisces','2011-10-24 00:00:00','2017-12-12 00:00:00'),(31,'109356','Sailor Moon','2012-12-24 00:00:00','2017-12-12 00:00:00'),(32,'150616','BogusProject','2014-06-01 00:00:00','2015-06-01 00:00:00'),(33,'140936','Sergei Rachmaninoff','2010-06-01 00:00:00','2017-12-12 00:00:00'),(34,'131256','Pisces','2011-10-24 00:00:00','2017-12-12 00:00:00'),(35,'121576','Sailor Moon','2012-12-24 00:00:00','2017-12-12 00:00:00'),(36,'111896','BogusProject','2014-06-01 00:00:00','2015-06-01 00:00:00'),(37,'102216','Sergei Rachmaninoff','2010-06-01 00:00:00','2017-12-12 00:00:00'),(38,'150716','Pisces','2011-10-24 00:00:00','2017-12-12 00:00:00'),(39,'140866','Sailor Moon','2012-12-24 00:00:00','2017-12-12 00:00:00'),(40,'131016','BogusProject','2014-06-01 00:00:00','2015-06-01 00:00:00'),(41,'121166','Sergei Rachmaninoff','2010-06-01 00:00:00','2017-12-12 00:00:00'),(42,'111316','Pisces','2011-10-24 00:00:00','2017-12-12 00:00:00'),(44,'150517','BogusProject','2014-06-01 00:00:00','2015-06-01 00:00:00'),(45,'140319','Sergei Rachmaninoff','2010-06-01 00:00:00','2017-12-12 00:00:00'),(46,'130121','Pisces','2011-10-24 00:00:00','2017-12-12 00:00:00'),(47,'80070','Sailor Moon','2012-12-24 00:00:00','2017-12-12 00:00:00'),(48,'110104','BogusProject','2014-06-01 00:00:00','2015-06-01 00:00:00'),(49,'110105','Sergei Rachmaninoff','2010-06-01 00:00:00','2017-12-12 00:00:00'),(50,'110106','Pisces','2011-10-24 00:00:00','2017-12-12 00:00:00'),(51,'120119','Sailor Moon','2012-12-24 00:00:00','2015-06-01 00:00:00');
/*!40000 ALTER TABLE `employee_project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_seat`
--

DROP TABLE IF EXISTS `employee_seat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee_seat` (
  `emp_id` varchar(7) NOT NULL,
  `seat_id` int(11) NOT NULL,
  `bldg_id` varchar(5) NOT NULL,
  `effect_date` datetime NOT NULL,
  `approver_id` int(11) NOT NULL,
  PRIMARY KEY (`emp_id`,`seat_id`,`bldg_id`,`effect_date`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_seat`
--

LOCK TABLES `employee_seat` WRITE;
/*!40000 ALTER TABLE `employee_seat` DISABLE KEYS */;
INSERT INTO `employee_seat` VALUES ('101466',104,'PIC','2016-11-21 00:00:00',80070),('102216',38,'PLC','2016-11-21 00:00:00',80070),('109356',142,'PIC','2016-11-21 00:00:00',80070),('109919',93,'PIC','2016-11-21 00:00:00',160054),('110016',116,'PIC','2016-11-21 00:00:00',160214),('110104',6,'PTC','2016-11-21 00:00:00',160214),('110104',38,'PLC','2017-01-24 00:00:00',160054),('110105',10,'PTC','2016-12-24 00:00:00',160054),('110106',14,'PTC','2016-11-21 00:00:00',80070),('111316',94,'PIC','2016-11-21 00:00:00',160054),('111896',31,'PTC','2016-11-21 00:00:00',160054),('119646',134,'PIC','2016-11-21 00:00:00',160054),('120018',83,'PIC','2016-11-21 00:00:00',160214),('120116',109,'PIC','2016-11-21 00:00:00',80070),('120119',20,'PTC','2016-11-21 00:00:00',160214),('120134',27,'PTC','2016-12-21 00:00:00',160054),('120290',29,'PTC','2016-11-21 00:00:00',80070),('121166',84,'PIC','2016-11-21 00:00:00',160214),('121576',22,'PTC','2016-11-21 00:00:00',160214),('129936',127,'PIC','2016-11-21 00:00:00',160214),('130117',82,'PIC','2016-11-21 00:00:00',80070),('130121',128,'PIC','2016-11-21 00:00:00',80070),('130216',105,'PIC','2016-10-21 00:00:00',160054),('131016',81,'PIC','2016-11-21 00:00:00',80070),('131256',11,'PTC','2016-11-21 00:00:00',80070),('140216',78,'PIC','2016-11-21 00:00:00',160054),('140226',125,'PIC','2016-11-21 00:00:00',80070),('140316',103,'PIC','2016-10-20 00:00:00',160214),('140319',119,'PIC','2016-11-21 00:00:00',160054),('140866',79,'PLC','2016-11-21 00:00:00',160054),('140936',8,'PTC','2016-11-21 00:00:00',160054),('150166',35,'PTC','2016-11-21 00:00:00',160214),('150177',37,'PLC','2016-11-21 00:00:00',160054),('150179',41,'PLC','2016-11-21 00:00:00',80070),('150193',50,'PLC','2016-11-21 00:00:00',160214),('150281',52,'PLC','2016-11-21 00:00:00',160054),('150315',77,'PIC','2016-11-21 00:00:00',160214),('150326',55,'PLC','2016-12-21 00:00:00',80070),('150407',59,'PLC','2016-11-21 00:00:00',160214),('150416',98,'PIC','2016-11-21 00:00:00',80070),('150516',118,'PIC','2016-11-21 00:00:00',160054),('150517',110,'PIC','2016-01-21 00:00:00',160214),('150616',144,'PIC','2016-11-21 00:00:00',160214),('150716',54,'PLC','2016-02-21 00:00:00',160214),('160054',67,'PLC','2016-11-21 00:00:00',160054),('160214',70,'PLC','2016-11-21 00:00:00',80070),('80070',2,'PTC','2016-10-24 00:00:00',80070),('80070',128,'PIC','2017-11-21 00:00:00',160214);
/*!40000 ALTER TABLE `employee_seat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location`
--

DROP TABLE IF EXISTS `location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `location` (
  `bldg_id` varchar(5) NOT NULL,
  `bldg_name` varchar(100) NOT NULL,
  `bldg_address` varchar(100) NOT NULL,
  PRIMARY KEY (`bldg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location`
--

LOCK TABLES `location` WRITE;
/*!40000 ALTER TABLE `location` DISABLE KEYS */;
INSERT INTO `location` VALUES ('PIC','Pointwest Innovations Corp.','Quezon City'),('PLC','Pointwest Labs','Ortigas'),('PTC','Pointwest Technologies Corp.','Makati City');
/*!40000 ALTER TABLE `location` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `project` (
  `proj_alias` varchar(100) NOT NULL,
  `proj_name` varchar(100) NOT NULL,
  `proj_start_date` date NOT NULL,
  `proj_end_date` date DEFAULT NULL,
  PRIMARY KEY (`proj_alias`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
INSERT INTO `project` VALUES ('BogusProject','Project Never Exist','2014-06-01','2015-06-01'),('Pisces','Axis','2011-10-24','2021-06-01'),('Sailor Moon','Snapp','2012-12-24','2020-06-01'),('Sergei Rachmaninoff','TechOps Support','2010-06-01',NULL);
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seat`
--

DROP TABLE IF EXISTS `seat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `seat` (
  `seat_id` int(11) NOT NULL AUTO_INCREMENT,
  `bldg_id` varchar(5) NOT NULL,
  `floor_number` varchar(3) NOT NULL,
  `quadrant` varchar(2) NOT NULL,
  `row_number` varchar(3) NOT NULL,
  `column_number` varchar(3) NOT NULL,
  `local_number` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`seat_id`),
  UNIQUE KEY `seat_id_UNIQUE` (`seat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=145 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seat`
--

LOCK TABLES `seat` WRITE;
/*!40000 ALTER TABLE `seat` DISABLE KEYS */;
INSERT INTO `seat` VALUES (1,'PTC','12','A','1','1','1000'),(2,'PTC','12','A','1','2',''),(3,'PTC','12','A','1','3','1001'),(4,'PTC','12','A','2','1',''),(5,'PTC','12','A','2','2','1002'),(6,'PTC','12','A','2','3','1003'),(7,'PTC','12','A','3','1',''),(8,'PTC','12','A','3','2','1004'),(9,'PTC','12','A','3','3',''),(10,'PTC','12','B','1','1','1005'),(11,'PTC','12','B','1','2',''),(12,'PTC','12','B','1','3','1006'),(13,'PTC','12','B','2','1',''),(14,'PTC','12','B','2','2','1007'),(15,'PTC','12','B','2','3','1008'),(16,'PTC','12','B','3','1',''),(17,'PTC','12','B','3','2','1009'),(18,'PTC','12','B','3','3',''),(19,'PTC','12','C','1','1','1010'),(20,'PTC','12','C','1','2','1011'),(21,'PTC','12','C','1','3',''),(22,'PTC','12','C','2','1',''),(23,'PTC','12','C','2','2','1012'),(24,'PTC','12','C','2','3',''),(25,'PTC','12','C','3','1','1013'),(26,'PTC','12','C','3','2',''),(27,'PTC','12','C','3','3','1014'),(28,'PTC','12','D','1','1',''),(29,'PTC','12','D','1','2','1015'),(30,'PTC','12','D','1','3',''),(31,'PTC','12','D','2','1','1016'),(32,'PTC','12','D','2','2',''),(33,'PTC','12','D','2','3','1017'),(34,'PTC','12','D','3','1',''),(35,'PTC','12','D','3','2',''),(36,'PTC','12','D','3','3',''),(37,'PLC','9','A','1','1','2000'),(38,'PLC','9','A','1','2',''),(39,'PLC','9','A','1','3','2001'),(40,'PLC','9','A','2','1',''),(41,'PLC','9','A','2','2',''),(42,'PLC','9','A','2','3','2002'),(43,'PLC','9','A','3','1',''),(44,'PLC','9','A','3','2','2003'),(45,'PLC','9','A','3','3',''),(46,'PLC','9','B','1','1',''),(47,'PLC','9','B','1','2','2004'),(48,'PLC','9','B','1','3',''),(49,'PLC','9','B','2','1',''),(50,'PLC','9','B','2','2','2005'),(51,'PLC','9','B','2','3',''),(52,'PLC','9','B','3','1',''),(53,'PLC','9','B','3','2','2006'),(54,'PLC','9','B','3','3',''),(55,'PLC','9','C','1','1',''),(56,'PLC','9','C','1','2','2007'),(57,'PLC','9','C','1','3',''),(58,'PLC','9','C','2','1',''),(59,'PLC','9','C','2','2','2008'),(60,'PLC','9','C','2','3',''),(61,'PLC','9','C','3','1','2009'),(62,'PLC','9','C','3','2',''),(63,'PLC','9','C','3','3','2010'),(64,'PLC','9','D','1','1','2011'),(65,'PLC','9','D','1','2',''),(66,'PLC','9','D','1','3',''),(67,'PLC','9','D','2','1','2012'),(68,'PLC','9','D','2','2',''),(69,'PLC','9','D','2','3',''),(70,'PLC','9','D','3','1','2013'),(71,'PLC','9','D','3','2',''),(72,'PLC','9','D','3','3',''),(73,'PIC','2','A','1','1','3000'),(74,'PIC','2','A','1','2','3001'),(75,'PIC','2','A','1','3',''),(76,'PIC','2','A','2','1','3002'),(77,'PIC','2','A','2','2',''),(78,'PIC','2','A','2','3','3003'),(79,'PIC','2','A','3','1',''),(80,'PIC','2','A','3','2',''),(81,'PIC','2','A','3','3','3004'),(82,'PIC','2','B','1','1',''),(83,'PIC','2','B','1','2',''),(84,'PIC','2','B','1','3','3005'),(85,'PIC','2','B','2','1',''),(86,'PIC','2','B','2','2','3006'),(87,'PIC','2','B','2','3','3007'),(88,'PIC','2','B','3','1',''),(89,'PIC','2','B','3','2',''),(90,'PIC','2','B','3','3','3008'),(91,'PIC','2','C','1','1','3009'),(92,'PIC','2','C','1','2',''),(93,'PIC','2','C','1','3','3010'),(94,'PIC','2','C','2','1',''),(95,'PIC','2','C','2','2','3011'),(96,'PIC','2','C','2','3',''),(97,'PIC','2','C','3','1',''),(98,'PIC','2','C','3','2',''),(99,'PIC','2','C','3','3','3012'),(100,'PIC','2','D','1','1',''),(101,'PIC','2','D','1','2',''),(102,'PIC','2','D','1','3','3013'),(103,'PIC','2','D','2','1',''),(104,'PIC','2','D','2','2','3014'),(105,'PIC','2','D','2','3',''),(106,'PIC','2','D','3','1','3015'),(107,'PIC','2','D','3','2',''),(108,'PIC','2','D','3','3',''),(109,'PIC','3','A','1','1','3016'),(110,'PIC','3','A','1','2',''),(111,'PIC','3','A','1','3','3017'),(112,'PIC','3','A','2','1',''),(113,'PIC','3','A','2','2','3018'),(114,'PIC','3','A','2','3','3019'),(115,'PIC','3','A','3','1',''),(116,'PIC','3','A','3','2','3020'),(117,'PIC','3','A','3','3',''),(118,'PIC','3','B','1','1','3021'),(119,'PIC','3','B','1','2',''),(120,'PIC','3','B','1','3','3022'),(121,'PIC','3','B','2','1',''),(122,'PIC','3','B','2','2','3023'),(123,'PIC','3','B','2','3',''),(124,'PIC','3','B','3','1','3024'),(125,'PIC','3','B','3','2',''),(126,'PIC','3','B','3','3','3025'),(127,'PIC','3','C','1','1',''),(128,'PIC','3','C','1','2','3026'),(129,'PIC','3','C','1','3','3027'),(130,'PIC','3','C','2','1',''),(131,'PIC','3','C','2','2',''),(132,'PIC','3','C','2','3','3028'),(133,'PIC','3','C','3','1',''),(134,'PIC','3','C','3','2','3029'),(135,'PIC','3','C','3','3',''),(136,'PIC','3','D','1','1',''),(137,'PIC','3','D','1','2','3030'),(138,'PIC','3','D','1','3',''),(139,'PIC','3','D','2','1',''),(140,'PIC','3','D','2','2','3031'),(141,'PIC','3','D','2','3',''),(142,'PIC','3','D','3','1',''),(143,'PIC','3','D','3','2','3032'),(144,'PIC','3','D','3','3','');
/*!40000 ALTER TABLE `seat` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-12 17:26:35
