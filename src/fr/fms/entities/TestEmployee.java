package fr.fms.entities;
/**
 * Classe de test de la classe {@link Employee}.
 *
 * <p>Permet de tester la création et l'affichage de plusieurs employés.
 * Elle permet également de vérifier qu'un employé peut avoir une
 * {@link City} ou une {@link Capital} comme ville de naissance.</p>
 *
 */
public class TestEmployee {
    /**
     * Point d'entrée du programme.
     *
     * @param args arguments passés au programme (non utilisé ici)
     */
    public static void main(String[] args) {

        // Création des villes de naissance
        Capital washington = new Capital("W-M", "Washington", "USA", 7600000);
        City pretoria = new City("Pretoria", "Afrique du sud", 800000);

        // Création des employés
        Employee bill = new Employee("Fondation B&M", 100000.0, "Gate",
                "Bill", 65, "habitant aux USA", washington);
        Employee elon = new Employee("Tesla", 150000.0, "Musk",
                "Elon", 49, "habitant à palo alto", pretoria);

        // Affichage des employés
        System.out.println(bill);
        System.out.println(elon);
    }
}
