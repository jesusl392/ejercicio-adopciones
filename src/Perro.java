public class Perro {
    private String placa;
    private String nombre;
    private String raza;
    private String size;
    private int edad;
    boolean adoptado = true;

    public Perro(String placa, String nombre, String raza, String size, int edad) {
        this.placa = placa;
        this.nombre = nombre;
        this.raza = raza;
        this.size = size;
        this.edad = edad;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" +
               "placa='" + placa + '\'' +
               ", nombre='" + nombre + '\'' +
               ", raza='" + raza + '\'' +
               ", size='" + size + '\'' +
               ", edad=" + edad +
               '}';
    }

}
