/*
 *Fecha: 22/02/2017
 *Descripcion: Clase Persona, primera estructura de datos,
               una clase es una plantilla de donde puedo
               instanciar objetos de tipo persoina.
               Una instancia (objeto) es una variable o un lugar en la
               memoria dle computador y almacena los atributos
               y metodos que tiene el objeto.

 * Autor: ANDRES FELIPE GIRASLDO SANCHEZ - 1093224368
 */

//Definimos el paquete donde está la clase.
package EstructuraObjetos;

//La Fima de la clase
public class Persona {
   
    private String nombre;
    private int cedula;
    private String direccion = "Calle 99 # 23-10";
    private String telefono;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
