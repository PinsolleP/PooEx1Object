public class TestCity {
    public static void main(String[] args){
       City toulouse = new City("Toulouse","France",450000);
       City bayonne = new City("Bayonne","France",150000);
       City madrid = new City("Madrid","Espagne",1100000);

       toulouse.display();
       bayonne.display();
       madrid.display();
    }
}