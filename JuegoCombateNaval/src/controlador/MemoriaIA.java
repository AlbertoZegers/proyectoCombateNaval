/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class MemoriaIA {
    
    private ArrayList<String> memoria;

    public MemoriaIA() {
        this.memoria=new ArrayList<>();
    }
    public void agregarNumero(int numero) {
        this.memoria.add(String.valueOf(numero));
    }
    //1ra Solucion
//    public int conseguirNumero(int posicion) {
//        int numero = this.memoria.get(posicion);
//        return numero;
//    }
    //2da Solucion
    public boolean validarNumero(int numero) {
        boolean validador = false;
        for (String string : memoria) {
            if (Integer.parseInt(string) == numero) {
                validador = true;
            }
        }
        return validador;
    }
    public void limpiarMemoria() {
        this.memoria.clear();
    }
}
