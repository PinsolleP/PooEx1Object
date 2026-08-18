package fr.fms.entities;

public class Employee extends Person {
    private String company;
    private int salary;

    public Employee (String company, int salary, String lastName, String firstName, int age, String address, City bornCity ){
        super(lastName, firstName, age, address, bornCity);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() { return company ; }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() { return salary ; }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
