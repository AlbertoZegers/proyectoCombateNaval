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
}
