------------------------------------------------------------------------
#TEST JAVA application de partitionnement
------------------------------------------------------------------------

java version 1.8.0_171
maven version 3.5.0 
jUnit version 4.12


#Principe de la solution
------------------------
Dans la solution, j'ai utilis� les librairies natives de java en faisant des red�finitions de m�thode. Ce choix permet d'�viter les boucles for et les streams. 
Elle permet de gagner en performances surtout avec l'utilisation de gros volumes de donn�es.


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


La solution est compos�e de deux modules (partitionlibs et application)

	- Le module partitionlbs comporte le service qui permet de faire les traitements (partitionnement des listes) et les tests unitaires.
	  La compilation de ce module g�n�re un jar qui peut �tre utilis� par d'autres applications.
	  
	- Le module application (facultatif) permet d'impl�m�nter une methode main � usage d'exemple avec des jeux de donn�es pour illustrer 
	  l'usage de la fonction partition se trouvant dans le module partitionlbs. Cette impl�mentation permet d'avoir une meilleur comprehension du programme.

	
#Executer l'application
--------------------------

Pour ex�cuter le programme et les tests unitaires, il faut :
	- Extraire le fichier ADNEOM_testpartition_DIAGO.zip dans un r�pertoire
	- Ouvrir l'invite de commande et se positionner sur le repertoire testpartition
	- Ex�cuter la commande "mvn clean install"
		Cette etape permet de compiler le projet et de faire les tests unitaires dont les resultats seront visibles sur la console
	- Ex�cuter la commande "cd application/taget" pour se positionner dans le repertoire contenant le jar application-1.0-SNAPSHOT.jar
	- Ex�cuter la commande "java -jar application-1.0-SNAPSHOT.jar" pour demarrer la methode main afin de voir les exemples 
	
	
NB 
---
Voir les codes source pour la doc