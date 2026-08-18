package fr.fms.entities;
/**
 * Représente une ville avec un nom, un pays et une population.
 * La classe permet également de compter le nombre d'instances de City créées.
 *
 */
public class City {
    //attributs
    public String name;
    public String country;
    public int population;
    public static int compteur;

    public City(String name, String country, int population){
        /**
         * Construit une ville avec son nom, son pays et sa population.
         *
         * @param name nom de la ville
         * @param country pays de la ville
         * @param population nombre d'habitants
         */
        this.name = name;
        this.country = country;
        this.setPopulation(population);
        compteur += 1;
    }

    public City(String name, int population){
        /**
         * Construit une ville avec son nom et sa population.
         * Le pays est initialisé à "unknown".
         *
         * @param name nom de la ville
         * @param population nombre d'habitants
         */
        this.name = name;
        this.country = "unknown";
        this.setPopulation(population);
        City.compteur += 1;
    }

    public void display(){
        /**
         * Affiche les informations de la ville.
         */
        System.out.println("Ville de " + getName() +
                        " en " + getCountry() + " ayant " +
                        getPopulation() + " habitants.");
    }

    //accesseurs

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population < 0){
            throw new RuntimeException("La population ne peut pas être négative!");
        }
        this.population = population;
    }

    // Méthodes

    /**
     * Retourne une représentation textuelle de la ville.
     *
     * @return le nom et le pays de la ville
     */
    @Override
    public String toString() {
            return "Ville de naissance : " + getName() +
                   " , " + getCountry();
            }

    }

