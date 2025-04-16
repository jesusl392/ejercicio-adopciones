public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    int adopciones;

    public Persona(String nombre, String apellido, int edad, String documento, int adopciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.adopciones = adopciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getAdopciones() {
        return adopciones;
    }

    public void setAdopciones(int adopciones) {
        this.adopciones = adopciones;
    }


    public void adoptarPerro(){

    }

    @Override
    public String toString() {
        return "Persona{" +
               "nombre='" + nombre + '\'' +
               ", apellido='" + apellido + '\'' +
               ", edad=" + edad +
               ", documento='" + documento + '\'' +
               ", adopciones=" + adopciones +
               '}';
    }
}
