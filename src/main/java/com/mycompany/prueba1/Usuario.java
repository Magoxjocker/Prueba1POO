/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba1;

/**
 *
 * @author Santo Tomas
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private byte edad;
    
    private boolean esBecado;
    private String nacionalidad;

    public Usuario(String nombre, String apellido, byte edad, boolean esBecado, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.esBecado = esBecado;
        this.nacionalidad = nacionalidad;
    }
    
    public void saludar(){
        System.out.println("Mi nombre es " + nombre + "y soy usuario");
    }
    
    public String saludar2(){
        System.out.println("Mi nombre es " + nombre + "y soy usuario");
    }
}
