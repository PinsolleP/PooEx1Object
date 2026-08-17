public class City {
    //attributs
    public String name;
    public String country;
    public int population;

    public City(String name, String country, int population){
        this.name = name;
        this.country = country;
        this.population = population;
    }
    public void display(){
        System.out.println("name : " + this.name + "\t" +
                           "country : " + this.country + "\t" +
                           "population : " + this.population + "\t");
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
        return "name : " + getName()+ "\t" +
                "country : " + getCountry() + "\t" +
                "population : " + getPopulation() + "\t";
    }
}
