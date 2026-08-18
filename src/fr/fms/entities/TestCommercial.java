package fr.fms.entities;

public class TestCommercial {
    public static void main(String[] args) {

        City limoges = new City("Limoges", "France", 133000);

        Commercial robert = new Commercial("brico", 5.0, "Dupont",
                "robert", 50, "habitant rue des rosiers à Toulouse", limoges);

        System.out.println(robert);
    }
}
