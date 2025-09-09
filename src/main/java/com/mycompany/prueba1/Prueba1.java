/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba1;

/**
 *
 * @author Santo Tomas
 */
public class Prueba1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        String mensaje = "Este es un mensaje";
        System.out.println(mensaje);
        Usuario user1 = new Usuario ("Benjamin","Mora",(byte)21, true,"Ruso");
        Usuario user2 = new Usuario ("Juan","Mora",(byte)21, true,"Ruso");
        Usuario user3 = new Usuario ("Ricardo","Mora",(byte)21, true,"Ruso");
        Usuario user4 = new Usuario ("Kennen","Mora",(byte)21, true,"Ruso");
        Usuario user5 = new Usuario ("Negro","Mora",(byte)21, true,"Ruso");
    
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        user2.setNombre("Jork");
        System.out.println(user2.toString());
    }
}
