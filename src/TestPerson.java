public class TestPerson {
    public static void main(String[] args){
        Person manu = new Person("Macron", "Emmanuel", 43, "Elysee à Paris", new City("Amiens","France", 0));
        Person nico = new Person("Sarkozy", "Nicolas", 66, "habitant Paris", new City("Paris", "France", 2000000));
        Person boris = new Person("Johnson", "Boris", 56, "habitant Downing street à London", new City("New York", "Etats_unis", 0));
        Person gege = new Person("Depardieu", "Gerard", 72, "habitant Moscou", new City("Châteauroux", "France",0));
        Person lenny = new Person("Kravitz", "lenny", 56, "habitant Hotel particulier à Paris", new City("New York", "Etats_unis", 0));
        Person jennifer = new Person("Lawrence", "jennifer", 30, "habitant Louisville aux USA", new City("Indian Hills", "Etats_unis", 0));

        System.out.println(manu);
        System.out.println(nico);
        System.out.println(boris);
    }
}
