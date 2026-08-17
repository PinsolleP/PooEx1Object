public class TestCity {
    public static void main(String[] args){
       City toulouse = new City("Toulouse","France",450000);
       City bayonne = new City("Bayonne","France",150000);
       City madrid = new City("Madrid","Espagne",1100000);

       //System.out.println(toulouse.getName() + " " + toulouse.getCountry() + " " + toulouse.getPopulation());
       //System.out.println(bayonne.getName() + " " + bayonne.getCountry() + " " + bayonne.getPopulation());
       //System.out.println(madrid.getName() + " " + madrid.getCountry() + " " + madrid.getPopulation());

        toulouse.setPopulation(-300);
        System.out.println(toulouse);

    }
}