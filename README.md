# JEE_JDBC

download and add mysql connector/j jar file into WEB-INF/lib document of project
IDE : Eclipse


***************************
Preparation de bdd

Pour ce chapitre de préparation, vous aurez  besoin d'exécuter des commandes SQL dans la ligne de commande MySQL pour préparer votre base de données.

Commencez par créer une base appelée java_ee :

CREATE DATABASE javaee DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

Puis créez la structure de la table noms :

CREATE TABLE  names (

 id INT( 11 ) NOT NULL AUTO_INCREMENT ,

 lastname VARCHAR( 200 ) NOT NULL ,

 firstname VARCHAR( 200 ) NOT NULL ,

 PRIMARY KEY ( id )

) ENGINE = INNODB;

