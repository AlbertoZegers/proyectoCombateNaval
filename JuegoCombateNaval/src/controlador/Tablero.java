package controlador;
import modelo.Barco;
import java.util.ArrayList;
public class Tablero {
    private ArrayList<Barco> tablero;
    public Tablero() {
        this.tablero = new ArrayList<>();
    }
    
    public void agregarBarco(Barco barco){
        this.tablero.add(barco);
    }
    
    public void modificarBarco(int index,Barco barco){
        this.tablero.set(index, barco);
    }
    public char conseguirBarco(int posicion) {
        char letra=this.tablero.get(posicion).getTipo();
        return letra;
    }
    public Object consegirObjeto(int posicion) {
        Object objeto = this.tablero.get(posicion);
        return objeto;
    }
    public int indexarObjeto(Object objeto) {
        int posicion = this.tablero.indexOf(objeto);
        return posicion;
    }
    public boolean validarVictoria() {
        boolean validador = true;
        for (Barco barco : tablero) {
            char letra = barco.getTipo();
            if (letra == 'B') {
                validador = false;
            }
        }
        return validador;
    }
}
