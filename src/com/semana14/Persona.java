package com.semana14;

public class Persona {
    private String nombre;
    private String apellido;
    private int identidad;
    private int nacimiento;

    private String genero;
    private String direccion;
    private int telefono;

    public Persona(String nombre, String apellido, int identidad, int nacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.identidad = identidad;
        this.nacimiento = nacimiento;
    }


    void setNombre(String nombre){
        this.nombre = nombre;
    }

    void setApellido(String apellido){
        this.apellido = apellido;
    }

    void setID(int identidad){
        this.identidad = identidad;
    }

    void setAnio(int nacimiento){
        this.nacimiento = nacimiento;
    }


    String getNombre(){
        return this.nombre;
    }

    String getApellido(){
        return this.apellido;
    }

    int getID(){
        return this.identidad;
    }

    int getAnio(){
        return this.nacimiento;
    }

    void imprimir(){
        System.out.print("\nMi nombre es " + getNombre() + " " + getApellido() + ",");
        System.out.print(" con identificacion: " + getID() + ",");
        System.out.print(" nacido en " + getAnio());
    }


    //////////////////////////////////////
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
