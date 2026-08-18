package fr.fms.entities;

public class Capital extends City{
    private String monument;

    public Capital(String monument, String name, String country, int population){
        super(name, country,population);
        this.monument = monument;
    }
}
