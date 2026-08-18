package fr.fms.entities;

public class Commercial extends Person {

    private String company;
    private double percentageCA;

    public Commercial(String company, double percentageCA, String lastName, String firstName, int age, String address, City bornCity) {
        super(lastName, firstName, age, address, bornCity);
    }

    public String getCompany() { return company ; }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPercentageCA() { return percentageCA ; }

    public void setPercentageCA(double percentageCA) {
        this.percentageCA = percentageCA;
    }
}
