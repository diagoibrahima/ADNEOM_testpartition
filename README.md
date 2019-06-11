# ADNEOM_testpartition

------------------------------------------------------------------------
#TEST JAVA application de partitionnement
------------------------------------------------------------------------


java version 1.8.0_171
maven version 3.5.0 
jUnit version 4.12


#Principe de la solution
------------------------

Dans la solution, j'ai utilisé les librairies natives de java en faisant des redéfinitions de méthode. Ce choix permet d'éviter les boucles for et les streams. 
Elle permet de gagner en performances surtout avec l'utilisation de gros volumes de données.


#Fichiers et repertoires du projet maven
----------------------------------------


+application
	+src
		main.java.com.adneom.application.Main
	pom.xml	
+partitionlibs
	+src
		main.java.com.adneom.libs.SubList
		test.java.com.adneom.libs.SubListTest
	pom.xml
pom.xml
README.txt

Explication 
---------------

La solution est composée de deux modules (partitionlibs et application)
	- Le module partitionlbs comporte le service qui permet de faire les traitements (partitionnement des listes) et les tests unitaires.
	  La compilation de ce module génère un jar qui peut être utilisé par d'autres applications.	  
	- Le module application (facultatif) permet d'impléménter une methode main à usage d'exemple avec des jeux de données pour illustrer 
	  l'usage de la fonction partition se trouvant dans le module partitionlbs. Cette implémentation permet d'avoir une meilleur comprehension du programme.

	
#Executer l'application
--------------------------

Pour exécuter le programme et les tests unitaires, il faut :

	- Extraire le fichier ADNEOM_testpartition_DIAGO.zip dans un répertoire
	
	- Ouvrir l'invite de commande et se positionner sur le repertoire testpartition
	
	- Exécuter la commande "mvn clean install" : Cette etape permet de compiler le projet et de faire les tests unitaires dont les 		  resultats seront visibles sur la console
	
	- Exécuter la commande "cd application/taget" pour se positionner dans le repertoire contenant le jar 
	  application-1.0-SNAPSHOT.jar
	  
	- Exécuter la commande "java -jar application-1.0-SNAPSHOT.jar" pour demarrer la methode main afin de voir les exemples 
	
	
NB 
---
Voir les codes source pour la doc
