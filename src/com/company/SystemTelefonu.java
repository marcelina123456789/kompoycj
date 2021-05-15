package com.company;

public enum SystemTelefonu {

    ANDRIOD("Adroid"),
    IOS("Ios"),
    WINDOWS_PHONE("windowas phone");

    private final String name;

    SystemTelefonu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
