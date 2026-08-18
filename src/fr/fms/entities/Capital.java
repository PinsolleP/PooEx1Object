package fr.fms.entities;
/**
 * Représente une capitale, qui est une ville possédant un monument.
 *
 * <p>Cette classe hérite de {@link City} et ajoute l'attribut
 * correspondant au monument de la capitale.
 *
 */
public class Capital extends City {
    /** Monument associé à la capitale. */
    private String monument;

    public Capital(String monument, String name, String country, int population) {
        /**
         * Construit une capitale avec son monument, son nom, son pays
         * et sa population.
         *
         * @param monument monument associé à la capitale
         * @param name nom de la capitale
         * @param country pays de la capitale
         * @param population nombre d'habitants de la capitale
         */
        super(name, country, population);
        this.monument = monument;
    }

    // Accesseurs
    public String getMonument() { return monument ; }

    public void setMonument(String monument) {
        this.monument = monument;
    }

    public String toString() {
        /**
         * Retourne une représentation textuelle de la capitale.
         *
         * @return le nom, le pays et le monument de la capitale
         */
        return  getName() + " , " +
                getCountry() + " , " +
                getMonument();
    }
}


