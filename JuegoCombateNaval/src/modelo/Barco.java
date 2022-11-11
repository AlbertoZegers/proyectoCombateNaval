package modelo;

public class Barco {
    private String nombre;
    private char tipo;

    public Barco() {
        this.nombre="agua";
        this.tipo='A';
    }

    public Barco(String nombre, char tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    
    
}


