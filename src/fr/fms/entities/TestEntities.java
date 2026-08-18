package fr.fms.entities;
/**
 * Classe de test des différentes entités du projet.
 *
 * <p>Cette classe permet de tester le polymorphisme en utilisant
 * un tableau de {@link Person} contenant des {@link Employee} et
 * des {@link Commercial}.</p>
 *
 * <p>Elle permet également de tester le calcul de la rémunération
 * propre à chaque type de personne.</p>
 *
 * @author
 * @version 1.0
 */
public class TestEntities{
    /**
     * Point d'entrée du programme.
     *
     * <p>Crée plusieurs personnes, les stocke dans un tableau de type
     * {@link Person}, puis parcourt ce tableau afin d'afficher leur
     * rémunération.</p>
     *
     * @param args arguments passés au programme (non utilisé ici)
     */
    public static void main(String[] args) {

        // Création des villes de naissance
        Capital washington = new Capital("W-M", "Washington", "USA", 0);
        City pretoria = new City("Pretoria", "Afrique du sud", 0);
        City limoges = new City("Limoges", "France", 0);

        // Création d'un tableau contenant des Employee et du Commercial
        Person[] entities = new Person[]{
                new Employee("Fondation B&M", 100000.0, "Gate",
                        "Bill", 65, "habitant aux USA", washington),
                new Employee("Tesla", 150000.0, "Musk",
                        "Elon", 49, "habitant à palo alto", pretoria),
                new Commercial("brico", 5.0, "Dupont",
                        "robert", 50, "habitant rue des rosiers à Toulouse", limoges)
            };

        // Parcours du tableau et calcul de la rémunération
        for (Person person : entities){
            System.out.println("salaire mensuel de " + person.getFirstName() + " " + person.getLastName() + " : " + person.remuneration());

        }
    }
}


