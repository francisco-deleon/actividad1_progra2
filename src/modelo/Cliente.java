/*	
 *  Actividad 1 del curso Programación II
 *	
 *  Universidad Mariano Gálvez de Guatemala
 *	
 *  Autor:
 *  Francisco Antonio De León Natareno
*/

package modelo;

public class Cliente extends Persona {
    private String nit;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    @Override
    public void agregar() {
        System.out.println("Nit: " + getNit());
        System.out.println("Nombres: " + this.getNombres());
        System.out.println("Apellidos: " + this.getApellidos());
        System.out.println("Direccion: " + this.getDireccion());
        System.out.println("Telefono: " + this.getTelefono());
        System.out.println("Fecha Nacimiento: " + this.getFecha_nacimiento());
    }
    
}
