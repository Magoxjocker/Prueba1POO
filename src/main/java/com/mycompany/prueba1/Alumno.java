/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba1;

/**
 *
 * @author Santo Tomas
 */
public class Alumno extends Usuario{
   private double nota1;
   private double nota2;
   private double nota3;

    public Alumno(double nota1, double nota2, double nota3, String nombre, String apellido, byte edad, boolean esBecado, String nacionalidad) {
        super(nombre, apellido, edad, esBecado, nacionalidad);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    


    }
   
   
}
