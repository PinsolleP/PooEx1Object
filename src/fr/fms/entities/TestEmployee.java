package fr.fms.entities;

public class TestEmployee {

    public static void main(String[] args) {


        Capital washington = new Capital("W-M", "Washington", "USA", 7600000);
        City pretoria = new City("Pretoria", "Afrique du sud", 800000);

        Employee bill = new Employee("Fondation B&M", 100000.0, "Gate",
                "Bill", 65, "habitant aux USA", washington);
        Employee elon = new Employee("Tesla", 150000.0, "Musk",
                "Elon", 49, "habitant à palo alto", pretoria);

        System.out.println(bill);
        System.out.println(elon);
    }
}
