/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Jugador {
    private String id;
    private String nombre;
    private String alias;
    private int cantidadVictorias;
    private int cantidadDerrotas;
    private int cantidadJuegos;

    public Jugador() {
        this.id="0";
        this.nombre="Ninguno";
        this.alias="Ninguno";
        this.cantidadVictorias=0;
        this.cantidadDerrotas=0;
        this.cantidadJuegos=0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getCantidadVictorias() {
        return cantidadVictorias;
    }

    public void setCantidadVictorias(int cantidadVictorias) {
        this.cantidadVictorias = cantidadVictorias;
    }

    public int getCantidadDerrotas() {
        return cantidadDerrotas;
    }

    public void setCantidadDerrotas(int cantidadDerrotas) {
        this.cantidadDerrotas = cantidadDerrotas;
    }

    public int getCantidadJuegos() {
        return cantidadJuegos;
    }

    public void setCantidadJuegos(int cantidadJuegos) {
        this.cantidadJuegos = cantidadJuegos;
    }
    
}
