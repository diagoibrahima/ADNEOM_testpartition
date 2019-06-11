package com.adneom.libs;

import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author El Hadji Ibrahima DIAGO
 */
public class SubListTest {

    // Liste initale à partionner
    private Integer[] list = {1, 2, 3, 4, 5};

    // Variable representant le resutat d'un partitionnement avec une taille de valeur 2
    private List<List<Integer>> listPartitionBy2 = asList(
            asList(1,2),
            asList(3,4),
            Collections.singletonList(5));

    // Variable representant le resultat d'un partitionnement avec une taille de valeur 3
    private List<List<Integer>> listPartitionBy3 = asList(
            asList(1,2,3),
            asList(4,5));

    // Variable representant le resultat d'un partitionnement avec une taille de valeur 1
    private List<List<Integer>> listPartitionBy1 = asList(
            Collections.singletonList(1),
            Collections.singletonList(2),
            Collections.singletonList(3),
            Collections.singletonList(4),
            Collections.singletonList(5));

    // Variable representant le resultat d'un partitionnement avec une taille de valeur 10
    private List<List<Integer>> listPartitionBy10 = Collections.singletonList(
            asList(1, 2, 3, 4, 5));

    /***
     * Test de partitionnement avec un parametre taille egale a 2
     */
    @Test
    public void partionBy2() {
        Assert.assertEquals(SubList.partition(Arrays.asList(list), 2),  listPartitionBy2);
    }

    /***
     * Test de partitionnement avec un parametre taille egale a 3
     */
    @Test
    public void partionBy3()  {
        Assert.assertEquals(SubList.partition(Arrays.asList(list), 3),  listPartitionBy3);
    }

    /***
     * Test de partitionnement avec un parametre taille egale a 1
     */
    @Test
    public void partionBy1() {
        Assert.assertEquals(SubList.partition(Arrays.asList(list), 1),  listPartitionBy1);
    }

    /***
     * Test de partitionnement avec un parametre taille egale a 10 qui depasse la taille initale de la liste
     */
    @Test
    public void partitionTailleSuperieureTailleListe()  {
        Assert.assertEquals(SubList.partition(Arrays.asList(list), 10),  listPartitionBy10);
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    /**
     * Ce test permet de vérifer qu'une exception @{@link IllegalArgumentException}
     * est levée quand la taille des sous partition demandée est inférieure à 1
     */
    @Test
    public void partitionTailleInferieurOuEgalAZero() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("the parameter taille should be > 0");
        SubList.partition(Arrays.asList(list), 0);
    }

}