-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: db_books_manage
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `borrow_log`
--

DROP TABLE IF EXISTS `borrow_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `borrow_log` (
  `borrow_id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL COMMENT '借阅人Id',
  `user_name` varchar(20) NOT NULL COMMENT '借阅人姓名',
  `borrow_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '借阅日期',
  `reversion_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '返还日期',
  `status` int NOT NULL DEFAULT '0' COMMENT '归还状态（0：未归还，1：已归还）',
  `is_delete` int NOT NULL DEFAULT '0' COMMENT '0：未删；1已删',
  PRIMARY KEY (`borrow_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='借阅记录';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `borrow_log`
--

LOCK TABLES `borrow_log` WRITE;
/*!40000 ALTER TABLE `borrow_log` DISABLE KEYS */;
INSERT INTO `borrow_log` VALUES (1,1,'admin','2023-02-21 11:57:01','2023-02-28 11:57:01',0,0),(2,1,'admin','2023-02-21 12:00:33','2023-02-28 12:00:33',0,0),(3,1,'admin','2023-02-21 12:04:06','2023-02-28 12:04:06',0,0),(4,1,'admin','2023-02-21 12:05:09','2023-02-28 12:05:09',0,0),(5,1,'admin','2023-02-21 14:15:43','2023-02-28 14:15:43',0,0),(6,1,'admin','2023-02-21 14:16:06','2023-02-28 14:16:06',0,0),(7,1,'admin','2023-02-21 14:18:05','2023-02-28 14:18:05',0,0);
/*!40000 ALTER TABLE `borrow_log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_book`
--

DROP TABLE IF EXISTS `tb_book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_book` (
  `book_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL COMMENT '图书名称',
  `author` varchar(20) DEFAULT NULL COMMENT '作者',
  `edition` int DEFAULT NULL COMMENT '版次',
  `price` double DEFAULT '25' COMMENT '单价',
  `publishing_house` varchar(20) DEFAULT NULL COMMENT '出版社',
  `type` int DEFAULT '1' COMMENT '图书分类',
  `publish_time` date DEFAULT NULL COMMENT '出版时间',
  `status` int NOT NULL DEFAULT '0' COMMENT '借阅状态（0：未借出；1：已借出）',
  `is_delete` int NOT NULL DEFAULT '0' COMMENT '0：未删；1已删',
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_book`
--

LOCK TABLES `tb_book` WRITE;
/*!40000 ALTER TABLE `tb_book` DISABLE KEYS */;
INSERT INTO `tb_book` VALUES (1,'人性论','休谟',1,62.5,'台海出版社',1,'2023-02-17',0,0),(2,'纯粹理性批判','康德',1,40,'中国画报出版社',1,'2023-02-16',0,0),(3,'扫起落叶好过冬','林达',1,50,'三联书店',2,'2023-02-16',0,0),(4,'大变局下的中国法治','季卫东',1,35,'北京大学出版社',2,'2023-02-16',0,0),(5,'JAVA编程思想','埃克尔',4,108,'机械工业出版社',3,'2023-02-16',0,0),(6,'JavaScript高级程序设计','马特·弗里斯比',4,129,'人民邮电出版社',3,'2023-02-17',0,0),(7,'JavaScript权威指南','大卫·弗拉纳根',7,139,'机械工业出版社',3,'2021-03-01',1,0),(8,'test','test',1,0,'test',1,NULL,1,1),(9,'','',1,0,'',1,NULL,0,1),(10,'test','test',3,2,'test',2,'2023-02-20',1,0),(11,'test','test',1,112.99,'test',2,'2023-02-22',0,0);
/*!40000 ALTER TABLE `tb_book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_department`
--

DROP TABLE IF EXISTS `tb_department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_department` (
  `department_id` int NOT NULL AUTO_INCREMENT COMMENT '部门ID',
  `name` varchar(20) NOT NULL COMMENT '部门名称',
  `is_delete` int NOT NULL DEFAULT '0' COMMENT '逻辑删除 0：未删；1：已删',
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_department`
--

LOCK TABLES `tb_department` WRITE;
/*!40000 ALTER TABLE `tb_department` DISABLE KEYS */;
INSERT INTO `tb_department` VALUES (1,'采访部',0),(2,'编目部',0),(3,'流通部',0),(4,'期刊部',0),(5,'参考咨询部',0),(6,'技术部',0);
/*!40000 ALTER TABLE `tb_department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_education`
--

DROP TABLE IF EXISTS `tb_education`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_education` (
  `education_id` int NOT NULL AUTO_INCREMENT COMMENT '学历ID',
  `name` varchar(20) NOT NULL COMMENT '学历',
  `is_delete` int NOT NULL DEFAULT '0' COMMENT '0：未删；1已删',
  PRIMARY KEY (`education_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='学历表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_education`
--

LOCK TABLES `tb_education` WRITE;
/*!40000 ALTER TABLE `tb_education` DISABLE KEYS */;
INSERT INTO `tb_education` VALUES (1,'研究生',0),(2,'本科',0),(3,'大专',0),(4,'高中',0),(5,'初中',0),(6,'小学',0);
/*!40000 ALTER TABLE `tb_education` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_major`
--

DROP TABLE IF EXISTS `tb_major`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_major` (
  `major_id` int NOT NULL AUTO_INCREMENT COMMENT '专业ID',
  `name` varchar(20) NOT NULL COMMENT '专业',
  `is_delete` int NOT NULL DEFAULT '0' COMMENT '0：未删；1已删',
  PRIMARY KEY (`major_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='专业表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_major`
--

LOCK TABLES `tb_major` WRITE;
/*!40000 ALTER TABLE `tb_major` DISABLE KEYS */;
INSERT INTO `tb_major` VALUES (6,'物联网工程',0),(7,'计算机科学',0),(8,'信息与通信工程',0),(9,'电子信息技术',0),(10,'英语',0),(11,'物流管理',0);
/*!40000 ALTER TABLE `tb_major` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_position`
--

DROP TABLE IF EXISTS `tb_position`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_position` (
  `position_id` int NOT NULL AUTO_INCREMENT COMMENT '职务ID',
  `name` varchar(20) NOT NULL COMMENT '职务名称',
  `is_delete` int NOT NULL DEFAULT '0' COMMENT '0：未删；1已删',
  PRIMARY KEY (`position_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_position`
--

LOCK TABLES `tb_position` WRITE;
/*!40000 ALTER TABLE `tb_position` DISABLE KEYS */;
INSERT INTO `tb_position` VALUES (1,'馆长',0),(2,'副馆长',0),(3,'科长',0),(4,'员工',0);
/*!40000 ALTER TABLE `tb_position` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_professional_title`
--

DROP TABLE IF EXISTS `tb_professional_title`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_professional_title` (
  `professional_title_id` int NOT NULL AUTO_INCREMENT COMMENT '职称ID',
  `name` varchar(20) NOT NULL COMMENT '职称名',
  `is_delete` int NOT NULL DEFAULT '0' COMMENT '0：未删；1：已删',
  PRIMARY KEY (`professional_title_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='职称表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_professional_title`
--

LOCK TABLES `tb_professional_title` WRITE;
/*!40000 ALTER TABLE `tb_professional_title` DISABLE KEYS */;
INSERT INTO `tb_professional_title` VALUES (1,'研究馆员',0),(2,'副研究馆员',0),(3,'馆员',0),(4,'助理馆员',0),(5,'管理员',0);
/*!40000 ALTER TABLE `tb_professional_title` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_type`
--

DROP TABLE IF EXISTS `tb_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_type` (
  `type_id` int NOT NULL AUTO_INCREMENT COMMENT '读者类型ID',
  `name` varchar(20) NOT NULL COMMENT '读者类型',
  `is_delete` int NOT NULL DEFAULT '0' COMMENT '0：未删；1已删',
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='读者类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_type`
--

LOCK TABLES `tb_type` WRITE;
/*!40000 ALTER TABLE `tb_type` DISABLE KEYS */;
INSERT INTO `tb_type` VALUES (1,'哲学',0),(2,'政律',0),(3,'计算机',0);
/*!40000 ALTER TABLE `tb_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_user`
--

DROP TABLE IF EXISTS `tb_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_user` (
  `user_id` int NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `role` int NOT NULL DEFAULT '0' COMMENT '用户身份 0：普通用户；1：内部用户；',
  `account` varchar(20) NOT NULL COMMENT '员工账号',
  `password` varchar(20) NOT NULL COMMENT '密码',
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `gender` int DEFAULT '0' COMMENT '0: 女 1：男',
  `department_id` int DEFAULT NULL COMMENT '部门',
  `position_id` int DEFAULT NULL COMMENT '职务',
  `professional_title_id` int DEFAULT NULL COMMENT '职称',
  `education_id` int DEFAULT NULL COMMENT '学历',
  `major_id` int DEFAULT NULL COMMENT '专业',
  `phone` varchar(20) DEFAULT NULL COMMENT '电话',
  `issuance_date` date DEFAULT NULL COMMENT '办证日期',
  `documentary_number` varchar(20) DEFAULT NULL COMMENT '书证编号',
  `reader_type` int DEFAULT NULL COMMENT '读者类别(不同类别的读者有不同的借书数量和借书期限限制)',
  `is_delete` int NOT NULL DEFAULT '0' COMMENT '逻辑删除（0：未删除；1：已删除）',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `tb_employee_pk2` (`account`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_user`
--

LOCK TABLES `tb_user` WRITE;
/*!40000 ALTER TABLE `tb_user` DISABLE KEYS */;
INSERT INTO `tb_user` VALUES (1,1,'admin','admin','admin',0,1,1,1,1,6,NULL,'2023-02-16','1234567',1,0),(2,0,'user','user','user',0,1,1,1,1,7,NULL,'2023-02-16',NULL,2,0);
/*!40000 ALTER TABLE `tb_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-21 17:46:39
