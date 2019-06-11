package com.adneom.libs;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * Class SubList
 * Cette classe est une implementation d'une Collection de Lists
 * qui représente les sous-liste d'une liste intiale partionnée
 * selon le parametre "taille'
 *
 * @author El Hadji Ibrahima DIAGO
 *
 * @param <T> : Type générique des elements à partitioner
 */
public class SubList<T> extends AbstractList<List<T>> {


    private final List<T> liste;
    private final int taille;

    private SubList(List<T> liste, int taille) {
        this.liste = liste;
        this.taille = taille;
    }

    /**
     *
     * @param liste Représente la liste à partionner
     * @param taille Réprésente la taille maximum de chaque partition
     * @param <T> : Type génerique des elements de la liste
     * @return La liste des sous partitions
     */
    public static <T> List<List<T>> partition(List<T> liste, int taille) {

        if(taille <= 0 )
        {
            throw new IllegalArgumentException("the parameter taille should be > 0");
        }

        return new SubList<>(liste, taille);
    }

    /**
     * Redéfinition de la méthode get de la nouvelle structure qui renvoie
     * la sous partition à l'index donné
     * @param index : Position de la sous partition à retourner
     * @return La sous partition à l'index @index
     */
    @Override
    public List<T> get(int index) {
        int debut = index * taille;
        int fin = (debut + taille) > liste.size() ? liste.size() : (debut + taille) ;

        if (debut > fin) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        return new ArrayList<>(liste.subList(debut, fin));
    }

    /**
     * Retourne le taille des sous partition resultant
     * @return
     */
    @Override
    public int size() {
        return (int) Math.ceil((double) liste.size() / (double) taille);
    }
}
