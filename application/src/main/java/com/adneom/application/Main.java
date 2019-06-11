package com.adneom.application;

import com.adneom.libs.SubList;

import java.util.Arrays;

/**
 * Class Main
 * @author El Hadji Ibrahima DIAGO

 * Une classe de test pour illustrer l'usage de la fonction partition de {@link SubList}
 */
public class Main {

    public static void main(String[] args) {

        Integer[] liste = {1, 2, 3, 4, 5};
        int taille1 = 1;
        int taille2 = 2;
        int taille3 = 3;

        System.out.println("Test 1");
        System.out.println("Initial list : " + Arrays.asList(liste) + ", taille : " + taille1);
        System.out.println("Result  list : " + SubList.partition(Arrays.asList(liste), taille1));

        System.out.println("\nTest 2");
        System.out.println("Initial list : " + Arrays.asList(liste) + ", taille : " + taille2);
        System.out.println("Result  list : " + SubList.partition(Arrays.asList(liste), taille2));

        System.out.println("\nTest 3");
        System.out.println("Initial list : " + Arrays.asList(liste) + ", taille : " + taille3);
        System.out.println("Result  list : " + SubList.partition(Arrays.asList(liste), taille3));

    }
}
