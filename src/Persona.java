public class Persona {
    String name;
    int edad;

    public void setEdad(int edad) {
        if (edad<0) throw new RuntimeException();
        this.edad = edad;
    }

    private Persona(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    public static  Persona crearPersona(String name, int edad){
        if (edad<0) throw new RuntimeException();
        return new Persona(name, edad);
    }
}