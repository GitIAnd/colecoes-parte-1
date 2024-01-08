package br.com.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListNomes {

    public static void main(String args[]){
        listaNomes();
    }

    private static void listaNomes() {

        List<String> lista = new ArrayList<String>();

        lista.add("Maria");
        lista.add("André");
        lista.add("Luísa");
        lista.add("Mateus");

        System.out.println("********** Lista não ordenada **********");
        System.out.println(lista);

        Collections.sort(lista);
        System.out.println("********** Lista ordenada **********");
        System.out.println(lista);
    }
}
