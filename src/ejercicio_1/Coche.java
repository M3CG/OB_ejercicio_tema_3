package ejercicio_1;

//Segunda parte del ejercicio: creacion de clase Coche y sus metodos
public class Coche {
    
    private int puertas;

    public Coche() {
    }

    public Coche(int puertas) {
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }
    
    public void agregar_puertas(){
        puertas++;
    }
    
}
