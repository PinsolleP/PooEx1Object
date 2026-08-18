package fr.fms.entities;
/**
 * Classe de test de la classe {@link Commercial}.
 *
 * <p>Permet de tester la création et l'affichage d'un commercial
 * ainsi que l'utilisation de sa ville de naissance.</p>
 *
 */
public class TestCommercial {
    /**
     * Point d'entrée du programme.
     *
     * @param args arguments passés au programme (non utilisé ici)
     */
    public static void main(String[] args) {

        // Création de la ville de naissance
        City limoges = new City("Limoges", "France", 133000);

        // Création du commercial
        Commercial robert = new Commercial("brico", 5.0, "Dupont",
                "robert", 50, "habitant rue des rosiers à Toulouse", limoges);

        // Affichage du commercial
        System.out.println(robert);
    }
}
