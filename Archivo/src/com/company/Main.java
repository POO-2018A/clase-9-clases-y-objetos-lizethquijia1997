
//EJERCICIO 1

package com.company;

public class Main {

    private String nombre;
    private String tipo;
    private String fechadeCreacion;
    private String contenido;

   //Setters
    public Main(String nombre ,String fechadeCreacion) {
        this.nombre = nombre;
        this.fechadeCreacion= fechadeCreacion;
    }

    public Main(String nombre,String fechadeCreacion,String tipo ) {
        this.nombre = nombre;
        this.fechadeCreacion= fechadeCreacion;
        this.tipo=tipo;
    }
    public Main(String nombre,String fechadeCreacion,String tipo, String contenido ) {
        this.nombre = nombre;
        this.fechadeCreacion= fechadeCreacion;
        this.tipo=tipo;
        this.contenido=contenido;
    }


    // Getters

    public String getNombre(){
        return this.nombre;
    }
    public String getTipo(){
        return this.tipo;
    }
    public String getFechadeCreacion(){
        return this.fechadeCreacion;
    }
    public String getContenido(){
        return this.contenido;
    }



    public static void main(String[] args) {

        Main computador1= new Main("Deber en Word","31/03/2017");
        Main computador2= new Main("PDF","18/12/2017","documento portátil");
        Main computador3= new Main("Power Point","01/02/2018","Presentación","Deber");

// imrpimir en pantalla
        System.out.println("\tArchivo del computador 1");
        System.out.println("Nombre:"+ computador1.getNombre());
        System.out.println("Fecha de Creación:"+ computador1.getFechadeCreacion());

        System.out.println("\n\tArchivo del computador 2");
        System.out.println("Nombre:"+ computador2.getNombre());
        System.out.println("Fecha de Creación:"+ computador2.getFechadeCreacion());
        System.out.println("Tipo:"+ computador2.getTipo());

        System.out.println("\n\tArchivo del computador 3");
        System.out.println("Nombre:"+ computador3.getNombre());
        System.out.println("Fecha de Creación:"+ computador3.getFechadeCreacion());
        System.out.println("Tipo:"+ computador3.getTipo());
        System.out.println("Contenido:"+ computador3.getContenido());


    }
}
