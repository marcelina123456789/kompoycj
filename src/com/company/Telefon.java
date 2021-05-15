package com.company;

public class Telefon {
    private final String markaTelefonu;
    private final SystemTelefonu systemTelefonu;
    private final String numer;

    public Telefon(String markaTelefonu, SystemTelefonu systemTelefonu, String numer){
        this.markaTelefonu = markaTelefonu;
        this.systemTelefonu = systemTelefonu;
        this.numer = numer;
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "markaTelefonu='" + markaTelefonu + '\'' +
                ", systemTelefonu='" + systemTelefonu + '\'' +
                ", numer='" + numer + '\'' +
                '}';
    }
}
