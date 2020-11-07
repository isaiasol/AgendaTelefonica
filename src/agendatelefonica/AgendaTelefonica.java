/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatelefonica;

import java.util.Scanner;

/**
 *
 * @author OrtizL
 */
public class AgendaTelefonica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        String apellidoP;
        String apellidoM;
        String NumTelefono;
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Escribe tu nombre: ");
        nombre=teclado.nextLine();
        
        System.out.println("Escribe tu apellido paterno: ");
        apellidoP=teclado.nextLine();
        
        System.out.println("Escribe tu apellido materno: ");
        apellidoM=teclado.nextLine();
        
        System.out.println("Escribe tu número telefónico: ");
        NumTelefono=teclado.nextLine();
        
        System.out.println("El contacto " + nombre + apellidoP + apellidoM + NumTelefono + "ha quedado registrado");
        // TODO code application logic here
    }
    
}
