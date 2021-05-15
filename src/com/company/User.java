package com.company;

public class User {
    private final String imie;
    private final String nazwisko;
    private final Adress adress;
    private final Telefon telefon;


    public User (String imie, String nazwisko, Adress adress, Telefon telefon){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adress = adress;
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "User{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", adress=" + adress +
                ", telefon=" + telefon +
                '}';
    }
}
