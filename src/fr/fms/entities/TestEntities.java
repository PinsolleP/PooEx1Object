package fr.fms.entities;

public class TestEntities{
    public static void main(String[] args) {

        Capital washington = new Capital("W-M", "Washington", "USA", 0);
        City pretoria = new City("Pretoria", "Afrique du sud", 0);
        City limoges = new City("Limoges", "France", 0);

        Person[] entities = new Person[]{
                new Employee("Fondation B&M", 100000.0, "Gate",
                        "Bill", 65, "habitant aux USA", washington),
                new Employee("Tesla", 150000.0, "Musk",
                        "Elon", 49, "habitant à palo alto", pretoria),
                new Commercial("brico", 5.0, "Dupont",
                        "robert", 50, "habitant rue des rosiers à Toulouse", limoges)
            };
        for (Person person : entities){
            System.out.println("salaire mensuel de " + person.getFirstName() + " " + person.getLastName() + " : " + person.remuneration());

        }
    }
}


