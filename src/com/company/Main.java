package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Adress adress = new Adress("Chełm", "kwiatowa");
        Telefon telefon = new Telefon("iphone", SystemTelefonu.WINDOWS_PHONE, "123456789");
        User user = new User("Jan","kowalski", adress, telefon );
        User user1 = new User("Jan","kowalski", adress, telefon );

        List<User> lista = new ArrayList<>();
        lista.add(user);
        lista.add(user1);
        System.out.println(lista);

        System.out.println(SystemTelefonu.WINDOWS_PHONE.getName());
        System.out.println(Pomoc.POLICA.getNumer());
    }
}
