package fr.fms.entities;
/**
 * Représente un commercial, c'est-à-dire une personne travaillant
 * pour une entreprise et dont la rémunération dépend d'un pourcentage
 * du chiffre d'affaires.
 *
 * <p>La classe hérite de {@link Person} et possède des informations
 * supplémentaires concernant l'entreprise et le pourcentage de
 * chiffre d'affaires.</p>
 *
 */
public class Commercial extends Person {

    //Attributs
    private String company;
    private double percentageCA;
    private double CA = 50000.0;

    public Commercial(String company, double percentageCA, String lastName, String firstName, int age, String address, City bornCity) {
        /**
         * Construit un commercial avec ses informations personnelles,
         * son entreprise et son pourcentage de chiffre d'affaires.
         *
         * @param company nom de l'entreprise
         * @param percentageCA pourcentage du chiffre d'affaires
         * @param lastName nom de famille
         * @param firstName prénom
         * @param age âge
         * @param address adresse
         * @param bornCity ville de naissance
         */
        super(lastName, firstName, age, address, bornCity);
        this.company = company;
        this.percentageCA = percentageCA;
    }

    //Accesseurs
    public String getCompany() { return company ; }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPercentageCA() { return percentageCA ; }

    public void setPercentageCA(double percentageCA) {
        /**
         * Modifie le pourcentage du chiffre d'affaires.
         *
         * @param percentageCA nouveau pourcentage du chiffre d'affaires
         * @throws RuntimeException si le pourcentage est négatif
         */
        if (percentageCA < 0) {
            throw new RuntimeException("La population ne peut pas être négative!"); }

        this.percentageCA = percentageCA;
    }

    public String toString() {
        /**
         * Retourne une représentation textuelle du commercial.
         *
         * @return les informations du commercial, de son entreprise
         *         et de son pourcentage de chiffre d'affaires
         */
        return  super.toString() + " , Entreprise : "
                + getCompany() + " , % CA : "
                + getPercentageCA();
    }

    /**
     * Calcule la rémunération du commercial à partir de son
     * pourcentage du chiffre d'affaires.
     *
     * @return la rémunération calculée
     */
    @Override
    public double remuneration() {
        return CA * (percentageCA / 100);
    }
}
