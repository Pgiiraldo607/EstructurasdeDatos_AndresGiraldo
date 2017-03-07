/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

import EstructuraObjetos.Automovil;
import EstructuraObjetos.Persona;

/**
 *
 * @author utp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Persona juan = new Persona();
        juan.setNombre("Juan Perez");
        System.out.println("Nombre: " + juan.getNombre()+ "\n"
                + "Direcion: " + juan.getDireccion());
        
        Automovil mazda = new Automovil();
        mazda.setModelo("CX5");
        System.out.println("Marca: " + mazda.getMarca()+ "\n"
                + "Modelo: " + mazda.getModelo());
    }
    
}
