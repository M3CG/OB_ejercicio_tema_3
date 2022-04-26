package ejercicio_1;
import ejercicio_1.Coche;

public class Main {

    public static void main(String[] args) {
        
        //Muestra el resultado de la primera parte del ejercicio
        System.out.println(" El resultado de sumar 3 numeros (4,5,6) usando la funcion suma_3 es: " + suma_3(4, 5, 6));
        
        //Segunda parte del ejercicio:
        Coche coche_1 = new Coche();
        //Agrego puertas a traves de una funcion
        coche_1.agregar_puertas();
        coche_1.agregar_puertas();
        coche_1.agregar_puertas();
        //Muestro la cantidad de puertas del coche_1
        System.out.println(" El coche_1 actualmente tiene " + coche_1.getPuertas() + " puertas.");
    }
    
    //Primera parte del ejercicio:
    private static float suma_3(float a, float b, float c) {
        return (a + b + c);
    }
}
