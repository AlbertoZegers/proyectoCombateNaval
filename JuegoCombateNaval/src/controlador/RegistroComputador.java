/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.*; // TODO SQL
import bd.Conexion; // comunicación con la BD
import modelo.Computador;
import java.util.ArrayList;

public class RegistroComputador {
    public boolean agregarResultado(Computador com){
        try {
            Connection conexion=Conexion.getConexion();
            String query="INSERT INTO Computador(estado"              
                    + ") VALUES(?)";
            PreparedStatement ins = 
                    conexion.prepareStatement(query);
            ins.setString(1, com.getEstado());
            if(ins.executeUpdate()>0){
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error al agregar "
                +e.getMessage());
        }
        return false;
    }  
    
    public boolean eliminar(){
        try {
            Connection conexion=Conexion.getConexion();
            String query="DELETE FROM COMPUTADOR";
            PreparedStatement del=conexion.prepareStatement(query);
            
            if(del.executeUpdate()>0){
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar "+ e.getMessage());
        }
        return false;
    }    
    
    public ArrayList<Computador> mostrarHistorico(){
        ArrayList<Computador> lista = new ArrayList<>();
        try {
            Connection conexion =Conexion.getConexion();
            String query="SELECT * FROM COMPUTADOR";
            PreparedStatement bus=conexion.prepareStatement(query);
            // Ejecutamos la query, obtenemos un ResultSet
            ResultSet rs = bus.executeQuery();
            // Mientras existen registros por recorrer next()
            while (rs.next()){
                Computador com = new Computador();
                com.setPartida(rs.getInt("partida"));
                com.setEstado(rs.getString("estado"));
                lista.add(com);                        
            }            
        } catch (Exception e) {
            System.out.println("Error al buscar "+ e.getMessage());
        }
        return lista;
    }
}
