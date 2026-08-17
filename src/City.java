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
}
