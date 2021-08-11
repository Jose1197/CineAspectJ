package com.cine;

import java.util.ArrayList;
import java.util.Scanner;

public class Cine {
	
	static final int EXIT = 3;
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Integer> asien = new ArrayList<Integer>();
    static ArrayList<String> movie = new ArrayList<String>();
    private static Scanner input = new Scanner(System.in);
    static String nombre1;
    static int id1;
    static int asiento1;
    static String funcion1;
    public static void initCine(){
        users.add(new User(1,"Usuario1",924242424,22,"Lentos y Felices"));
        users.add(new User(2,"Usuario2",1708554865,23,"Los Vengadores"));
        asien.add(1);
        asien.add(2);
        asien.add(3);
        asien.add(4);
        asien.add(5);
        asien.add(6);
        asien.add(7);
        asien.add(8);
        asien.add(9);
        asien.add(10);
        movie.add("Los Vengadores");
        movie.add("Aro");
        movie.add("Masacre Politecnica");
        movie.add("Black Widow");
        movie.add("Suicide Squad");
    }

    public static void main(String[] args) {
        int opcion = 0;
        initCine();
        while(opcion != EXIT){
            opcion = menu();
        };

    }
    public static int menu(){
        System.out.println("Cine AspectJ");
        System.out.println("------------------------------------");
        System.out.println("1 - Crear Reserva");
        System.out.println("2 - Ver Reservas");
        System.out.println("3 - Salir");
        System.out.println("------------------------------------");
        int option = Integer.valueOf(readConsole("Opcion: "));
        switch (option) {
        case 1:
            System.out.println("Crear Reserva");
            System.out.println("------------------------------------");
            createUser();
        break;
        case 2:
            System.out.println("Ver Reservas");
            viewUsers();
        break;
        case EXIT:
        break;
        default:
            System.out.println("Opcion incorrecta");
            break;
        }
        return option;
    }

    public static  String readConsole(String mensaje){
        System.out.println(mensaje);  
        String inputText;
        inputText = input.nextLine();           
        return inputText;
    }

    public static void createUser(){
        String nombre = readConsole("Nombre :");
        nombre1 = nombre;
        int id = Integer.valueOf(readConsole("Id: "));
        id1 = id;
        System.out.println("Asientos Disponibles: ");
        for (Integer name:asien) 
        {
        	System.out.println("Asiento Disponible en fila A: "+ name);
        }
        int asiento = Integer.valueOf(readConsole("Escoja un asiento: "));
        if (asien.contains(asiento)) {
        	asien.remove(asiento-1);
        	asiento1 = asiento;
        }
        else {
        	System.out.println("El asiento no esta disponible, escoja otro asiento");
        	createUser();
        }
        System.out.println("Funciones Disponibles: "+ movie);
        String funcion = readConsole("Funcion: ");
        if (movie.contains(funcion)) {
        	funcion1 = funcion;
        	users.add(new User(users.size()+1,nombre,id,asiento,funcion)); 	
        }
        else {
        	 System.out.println("No existe tal pelicula");
        	 createUser();
        }
        
        
    }

    
    public static void viewUsers(){
        System.out.println("------------------------------------");
        for(User u:users){  
            System.out.println(u);
        }
        System.out.println("------------------------------------");
    }
    
}
