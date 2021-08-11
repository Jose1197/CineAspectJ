package com.cine;

public class User {

	private int key;
    private String nombre;
    private int id;
    private int asiento;
    private String funcion;


    public User(int key, String name, int id, int asiento,String funcion){
        this.key = key;
        this.nombre = name;
        this.id = id;
        this.asiento = asiento;
        this.funcion = funcion;
    }
    public int getKey() {
        return key;
    }
    public void setKey(int key) {
        this.key = key;
    }
    public String getName() {
        return nombre;
    }
    public void setName(String name) {
        this.nombre = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAsiento() {
        return asiento;
    }
    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }
    
    public String getFuncion() {
        return funcion;
    }
    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }


    @Override
    public String toString() {
        return "User [Key="+key+", Nombre=" + nombre + ", ID=" + id + ", Asiento=" + asiento + ", Funcion="+funcion+"]";
    }

}
