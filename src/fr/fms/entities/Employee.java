package fr.fms.entities;

public class Employee extends Person {
    private String company;
    private double salary;

    public Employee (String company, double salary, String lastName, String firstName, int age, String address, City bornCity ){
        super(lastName, firstName, age, address, bornCity);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() { return company ; }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() { return salary ; }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return  super.toString() + " , Entreprise : "
                + getCompany() + " , salaire : "
                + getSalary();
    }

    @Override
    public double remuneration(){
        return salary * 0.8;
    }

}
