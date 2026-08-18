package fr.fms.entities;

public class Capital extends City {
    private String monument;

    public Capital(String monument, String name, String country, int population) {
        super(name, country, population);
        this.monument = monument;
    }

    public String getMonument() { return monument ; }

    public void setMonument(String monument) {
        this.monument = monument;
    }

    public String toString() {
        return  getName() + " , " +
                getCountry() + " , " +
                getMonument();
    }
}


