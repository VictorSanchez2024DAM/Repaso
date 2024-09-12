public class Persona {

    private String nombre;
    private static int numOjos;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        Persona p = new Persona("Patri");
        Persona p2 = new Persona("Patri");
    }
}
