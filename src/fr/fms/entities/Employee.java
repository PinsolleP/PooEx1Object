package fr.fms.entities;
/**
 * Représente un employé travaillant pour une entreprise avec un salaire.
 *
 * <p>La classe hérite de {@link Person} et ajoute les informations
 * relatives à l'entreprise et au salaire de l'employé.</p>
 *
 */
public class Employee extends Person {
    //Attributs
    private String company;
    private double salary;

    public Employee (String company, double salary, String lastName, String firstName, int age, String address, City bornCity ){
        /**
         * Construit un employé avec ses informations personnelles,
         * son entreprise et son salaire.
         *
         * @param company nom de l'entreprise
         * @param salary salaire de l'employé
         * @param lastName nom de famille
         * @param firstName prénom
         * @param age âge
         * @param address adresse
         * @param bornCity ville de naissance
         */
        super(lastName, firstName, age, address, bornCity);
        this.company = company;
        this.salary = salary;
    }

    //Accesseurs
    public String getCompany() { return company ; }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() { return salary ; }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        /**
         * Retourne une représentation textuelle de l'employé.
         *
         * @return les informations de la personne, de son entreprise
         *         et de son salaire
         */
        return  super.toString() + " , Entreprise : "
                + getCompany() + " , salaire : "
                + getSalary();
    }

    /**
     * Calcule la rémunération de l'employé après déduction
     * de 20 % de charges.
     *
     * @return le salaire après déduction des charges
     */
    @Override
    public double remuneration(){
        return salary * 0.8;
    }

}
