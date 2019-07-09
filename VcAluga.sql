-- MySQL dump 10.13  Distrib 5.7.24, for Linux (x86_64)
--
-- Host: localhost    Database: VcAluga
-- ------------------------------------------------------
-- Server version	5.7.24-0ubuntu0.16.04.1

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
-- Table structure for table `cartao`
--

DROP TABLE IF EXISTS `cartao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cartao` (
  `nmr_cartao` varchar(24) NOT NULL,
  `data_validade` date NOT NULL,
  `titular` varchar(255) NOT NULL,
  `cod_seguranca` varchar(255) NOT NULL,
  PRIMARY KEY (`nmr_cartao`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cartao`
--

LOCK TABLES `cartao` WRITE;
/*!40000 ALTER TABLE `cartao` DISABLE KEYS */;
INSERT INTO `cartao` VALUES ('21821828','2010-10-10','gustavo','2121'),('2182182818','2010-10-10','gustavo','211'),('372172717','2010-10-10','gustavo','218');
/*!40000 ALTER TABLE `cartao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cartao_cliente`
--

DROP TABLE IF EXISTS `cartao_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cartao_cliente` (
  `fk_cliente_cpf` varchar(255) DEFAULT NULL,
  `fk_cartao_nmr_cartao` varchar(24) DEFAULT NULL,
  KEY `FK_cartao_cliente_1` (`fk_cliente_cpf`),
  KEY `FK_cartao_cliente_2` (`fk_cartao_nmr_cartao`),
  CONSTRAINT `FK_cartao_cliente_1` FOREIGN KEY (`fk_cliente_cpf`) REFERENCES `cliente` (`cpf`) ON DELETE CASCADE,
  CONSTRAINT `FK_cartao_cliente_2` FOREIGN KEY (`fk_cartao_nmr_cartao`) REFERENCES `cartao` (`nmr_cartao`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cartao_cliente`
--

LOCK TABLES `cartao_cliente` WRITE;
/*!40000 ALTER TABLE `cartao_cliente` DISABLE KEYS */;
INSERT INTO `cartao_cliente` VALUES ('13218218','372172717'),('1218218','21821828'),('221218218','2182182818');
/*!40000 ALTER TABLE `cartao_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `cpf` varchar(255) NOT NULL,
  `datanasc` date DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `idCliente` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES ('1218218','1994-10-10','5521990016565','Pedro',0),('13218218','1994-10-10','552199019210','Gustavo',0),('221218218','1994-10-10','55212192199','gUSTAVO',0);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `endereco`
--

DROP TABLE IF EXISTS `endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `endereco` (
  `ender_completo` varchar(255) NOT NULL,
  `cep` varchar(15) NOT NULL,
  `bairro` varchar(255) NOT NULL,
  `id_ender` int(11) NOT NULL AUTO_INCREMENT,
  `cidade` varchar(255) NOT NULL,
  `estado` varchar(255) NOT NULL,
  PRIMARY KEY (`id_ender`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endereco`
--

LOCK TABLES `endereco` WRITE;
/*!40000 ALTER TABLE `endereco` DISABLE KEYS */;
INSERT INTO `endereco` VALUES ('bobos 0 recreio','22790430','recreio',1,'recreio','recreio'),('bobos 0 recreio','22279040','recreio',2,'rio de janeiro ','rio de janeiro'),('BOBOS 0 RECREIO','22789209','RECREIO',3,'RECREIO','RECREIO');
/*!40000 ALTER TABLE `endereco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `endereco_cliente`
--

DROP TABLE IF EXISTS `endereco_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `endereco_cliente` (
  `fk_endereco_id_ender` int(11) DEFAULT NULL,
  `fk_cliente_cpf` varchar(255) DEFAULT NULL,
  KEY `FK_endereco_cliente_1` (`fk_endereco_id_ender`),
  CONSTRAINT `FK_endereco_cliente_1` FOREIGN KEY (`fk_endereco_id_ender`) REFERENCES `endereco` (`id_ender`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endereco_cliente`
--

LOCK TABLES `endereco_cliente` WRITE;
/*!40000 ALTER TABLE `endereco_cliente` DISABLE KEYS */;
INSERT INTO `endereco_cliente` VALUES (1,'13218218'),(2,'1218218'),(3,'221218218');
/*!40000 ALTER TABLE `endereco_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `habilitacao`
--

DROP TABLE IF EXISTS `habilitacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `habilitacao` (
  `nmr_registro` varchar(15) NOT NULL,
  `tipo` varchar(10) NOT NULL,
  `categoria` varchar(2) NOT NULL,
  `cpf_cliente` varchar(255) DEFAULT NULL,
  `data_exped` date DEFAULT NULL,
  `data_validade` date DEFAULT NULL,
  PRIMARY KEY (`nmr_registro`),
  KEY `FK_habilitacao_2` (`cpf_cliente`),
  CONSTRAINT `FK_habilitacao_2` FOREIGN KEY (`cpf_cliente`) REFERENCES `cliente` (`cpf`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habilitacao`
--

LOCK TABLES `habilitacao` WRITE;
/*!40000 ALTER TABLE `habilitacao` DISABLE KEYS */;
INSERT INTO `habilitacao` VALUES ('219212919','definitiva','ab','1218218','2019-10-10','2020-10-10'),('2821821288','PROVISORIA','AB','13218218','2009-11-10','2010-10-10'),('28328328','definitiva','ab','221218218','2010-10-10','2020-10-10');
/*!40000 ALTER TABLE `habilitacao` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-10 23:24:58
