import fr.fms.entities.City;
/**
 * Classe de test de la classe {@link City}.
 * Permet de tester la création, la modification et l'affichage
 * des objets City.
 *
 */
public class TestCity {
    /**
     * Point d'entrée du programme.
     *
     * @param args arguments passés au programme (non utilisé ici)
     */
    public static void main(String[] args){
       City toulouse = new City("Toulouse","France",450000);
       City bayonne = new City("Bayonne","France",150000);
       City madrid = new City("Madrid","Espagne",1100000);
       City rabbat = new City("Rabbat", 577000);
       City paris = new City("Paris","France",2000000);
       City nice = new City("Nice", "France", 340000);

       //Test des accesseurs
       //System.out.println(toulouse.getName() + " " + toulouse.getCountry() + " " + toulouse.getPopulation());
       //System.out.println(bayonne.getName() + " " + bayonne.getCountry() + " " + bayonne.getPopulation());
       //System.out.println(madrid.getName() + " " + madrid.getCountry() + " " + madrid.getPopulation());

        //Test de modification de la population
        //toulouse.setPopulation(370000);
        //System.out.println(toulouse);

        //Test de modification du pays
        System.out.println(rabbat.getName() + " " + rabbat.getCountry() + " " + rabbat.getPopulation());
        rabbat.setCountry("Maroc");
        System.out.println(rabbat.getName() + " " + rabbat.getCountry() + " " + rabbat.getPopulation());

        //Test de la méthode display()
        toulouse.display();
        //Test de la méthode tostring
        System.out.println(toulouse);
        //Affichage du nombre d'instances de City
        System.out.println(City.compteur);

    }
}