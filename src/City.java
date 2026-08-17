public class City {
    //attributs
    public String name;
    public String country;
    public int population;
    static int compteur;

    public City(String name, String country, int population){
        this.name = name;
        this.country = country;
        this.setPopulation(population);
        compteur += 1;
    }

    public City(String name, int population){
        this.name = name;
        this.country = "unknown";
        this.setPopulation(population);
        City.compteur += 1;
    }

    public void display(){
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

    //méthodes
    public String toString() {
        return "Ville de " + getName() +
                " en " + getCountry() + " ayant " +
                getPopulation() + " habitants.";
    }
}
