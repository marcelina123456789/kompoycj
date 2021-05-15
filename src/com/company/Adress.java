package com.company;

public class Adress {

    private final String miasto;
    private final String ulica;

    public Adress(String miasto, String ulica){
        this.miasto = miasto;
        this.ulica = ulica;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "miasto='" + miasto + '\'' +
                ", ulica='" + ulica + '\'' +
                '}';
    }
}
