package fr.fms.entities;

public class Commercial extends Person {

    private String company;
    private double percentageCA;
    private double CA = 50000.0;

    public Commercial(String company, double percentageCA, String lastName, String firstName, int age, String address, City bornCity) {
        super(lastName, firstName, age, address, bornCity);
        this.company = company;
        this.percentageCA = percentageCA;
    }

    public String getCompany() { return company ; }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPercentageCA() { return percentageCA ; }

    public void setPercentageCA(double percentageCA) {
        if (percentageCA < 0) {
            throw new RuntimeException("La population ne peut pas être négative!"); }

        this.percentageCA = percentageCA;
    }

    public String toString() {
        return  super.toString() + " , Entreprise : "
                + getCompany() + " , % CA : "
                + getPercentageCA();
    }

    @Override
    public double remuneration() {
        return CA * (percentageCA / 100);
    }
}
