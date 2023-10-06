/**
 * Se crea la clase persona
 */
public class Persona {
    /**
     * Atributos
     */

    public String nombre;
    public String apellido;
    public int edad;
    public float altura;

    /**
     * Construcion de la clase
     * @param nombre
     * @param apellido
     * @param edad
     * @param altura
     * Complejidad temporal: O(1) Complejidad Constante
     */

    Persona(String nombre,String apellido, int edad, float altura){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.altura=altura;
    }

    /**
     * Metodo para imprimir el nombre, apellido, edad y altura
     * Complejidad temporal: O(1) Complejidad Constante
     */
    void mostrarDatos(){
        System.out.println(nombre + " su apellido es " + apellido + " su edad es " + edad + " mide " + altura);
    }
}
