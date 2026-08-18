package fr.fms.entities;
/**
 * Représente une personne avec son identité, son âge, son adresse
 * et sa ville de naissance.
 *
 * Cette classe est abstraite et sert de classe mère à des classes
 * spécialisées telles que Employee et Commercial.
 *
 */
public abstract class Person {
    //attributs
    public String lastName;
    public String firstName;
    public int age;
    public String address;
    public City bornCity;

    public Person(String lastName, String firstName, int age, String address, City bornCity) {
        /**
         * Construit une personne avec l'ensemble de ses informations.
         *
         * @param lastName nom de famille
         * @param firstName prénom
         * @param age âge
         * @param address adresse
         * @param bornCity ville de naissance
         */
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.bornCity = bornCity;
    }
    public Person(String lastName, String firstName, int age ) {
        /**
         * Construit une personne avec son nom, son prénom et son âge.
         * L'adresse est initialisée à "unknown".
         *
         * @param lastName nom de famille
         * @param firstName prénom
         * @param age âge
         */
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = "unknown";
    }
    public Person(String lastName, String firstName) {
        /**
         * Construit une personne avec son nom et son prénom.
         * L'âge est initialisé à 0 et l'adresse à "unknown".
         *
         * @param lastName nom de famille
         * @param firstName prénom
         */
        this.age = 0;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = "unknown";
    }
    //accesseurs

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public City getBornCity() {
        return bornCity;
    }

    public void setBornCity(City bornCity) {
        this.bornCity = bornCity;
    }

    public String toString() {
        /**
         * Retourne une représentation textuelle de la personne.
         *
         * @return les informations principales de la personne
         */
        return  getLastName() + " , " +
                getFirstName() + " , " +
                getAge() + " , " +
                getAddress() + " , " +
                getBornCity();
        }
    /**
     * Calcule la rémunération de la personne.
     *
     * Cette méthode doit être implémentée par les classes filles,
     * car le calcul dépend du type de personne.
     *
     * @return la rémunération calculée
     */
    public abstract double remuneration();

    }
