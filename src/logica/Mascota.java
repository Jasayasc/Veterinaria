
package logica;

public class Mascota {
    int id;
     String nombre;
    String especie;
    String raza;
    String fechaNacimiento;
    String propietario;
    String direccion;
    String telefono;

    public Mascota(int id,String nombre, String especie, String raza, String fechaNacimiento, String propietario, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.propietario = propietario;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getId(){
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getPropietario() {
        return propietario;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    
    
}
