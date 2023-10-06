

public class Main {
    /**
     *
     * @param args
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public static void main(String[] args) {
    Persona persona1= new Persona("andres", "gamez", 20,180);
    Persona persona2= new Persona("juan", "perez", 15,170);
    Persona persona3= new Persona("omar", "gamez", 45,183);

    persona1.mostrarDatos();
    persona2.mostrarDatos();
    persona3.mostrarDatos();


    }
}