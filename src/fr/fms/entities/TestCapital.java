package fr.fms.entities;

public class TestCapital {

    public static void main(String[] args){

        Capital paris = new Capital("Tour Eiffel", "Paris", "France", 2000000);
        Capital londres = new Capital("Bigben", "Londres", "GB", 9400000);

        System.out.println(paris);
        System.out.println(londres);
    }
}
