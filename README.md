# JEE_JDBC


download and add mysql connector/j into WEB-INF/lib document of project


Pour ce chapitre de préparation, vous aurez  besoin d'exécuter des commandes SQL dans la ligne de commande MySQL pour préparer votre base de données.

Commencez par créer une base appelée java_ee :

CREATE DATABASE javaee DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

Puis créez la structure de la table noms :

CREATE TABLE  noms (

 id INT( 11 ) NOT NULL AUTO_INCREMENT ,

 nom VARCHAR( 200 ) NOT NULL ,

 prenom VARCHAR( 200 ) NOT NULL ,

 PRIMARY KEY ( id )

) ENGINE = INNODB;

