package com.company;

public enum Pomoc {
    POLICA("997"), STRAZ_POZARNA("998"), KARETKA("999");
    private final String numer;

    Pomoc(String numer) {
        this.numer = numer;
    }

    public String getNumer() {
        return numer;
    }
}
