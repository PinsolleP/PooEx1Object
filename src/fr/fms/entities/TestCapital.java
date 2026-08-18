package fr.fms.entities;
/**
 * Classe de test de la classe {@link Capital}.
 *
 * <p>Permet de tester la création et l'affichage de plusieurs capitales.</p>
 *
 */
public class TestCapital {
    /**
     * Point d'entrée du programme.
     *
     * @param args arguments passés au programme (non utilisé ici)
     */
    public static void main(String[] args){

        // Création de plusieurs capitales
        Capital paris = new Capital("Tour Eiffel", "Paris", "France", 2000000);
        Capital londres = new Capital("Bigben", "Londres", "GB", 9400000);

        // Affichage des capitales
        System.out.println(paris);
        System.out.println(londres);
    }
}
