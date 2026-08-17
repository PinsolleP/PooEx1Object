public class TestCity {
    public static void main(String[] args){
       City toulouse = new City("Toulouse","France",450000);
       City bayonne = new City("Bayonne","France",150000);
       City madrid = new City("Madrid","Espagne",1100000);
       City rabbat = new City("Rabbat", 577000);
       City paris = new City("Paris","France",2000000);
       City nice = new City("Nice", "France", 340000);

       //System.out.println(toulouse.getName() + " " + toulouse.getCountry() + " " + toulouse.getPopulation());
       //System.out.println(bayonne.getName() + " " + bayonne.getCountry() + " " + bayonne.getPopulation());
       //System.out.println(madrid.getName() + " " + madrid.getCountry() + " " + madrid.getPopulation());

        //toulouse.setPopulation(370000);
        //System.out.println(toulouse);

        System.out.println(rabbat.getName() + " " + rabbat.getCountry() + " " + rabbat.getPopulation());
        rabbat.setCountry("Maroc");
        System.out.println(rabbat.getName() + " " + rabbat.getCountry() + " " + rabbat.getPopulation());

        toulouse.display();
        System.out.println(toulouse);


    }
}