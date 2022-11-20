/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Jugador;
import java.sql.*; // TODO SQL
import bd.Conexion; // comunicación con la BD
/**
 *
 * @author User
 */
public class RegistroJugadores {
    public boolean agregarJugador(Jugador jug){
        try {
            Connection conexion=Conexion.getConexion();
            String query="INSERT INTO Jugador(id,"
                    + "nombre, alias,"
                    + "victorias, derrotas, partidas "
                    + ") VALUES(?,?,?,?,?,?)";
            PreparedStatement ins = 
                    conexion.prepareStatement(query);
            ins.setString(1, jug.getId());
            ins.setString(2, jug.getNombre());
            ins.setString(3, jug.getAlias());
            ins.setInt(4, jug.getCantidadVictorias());
            ins.setInt(5, jug.getCantidadDerrotas());
            ins.setInt(6, jug.getCantidadJuegos());
            if(ins.executeUpdate()>0){
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error al agregar "
                +e.getMessage());
        }
        return false;
    }  
    
    public boolean eliminar(String id){
        try {
            Connection conexion=Conexion.getConexion();
            String query="DELETE FROM JUGADOR WHERE ID=?";
            PreparedStatement del=conexion.prepareStatement(query);
            del.setString(1, id);
            
            if(del.executeUpdate()>0){
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar "+ e.getMessage());
        }
        return false;
    }    
    public boolean eliminarTodo(){
        try {
            Connection conexion=Conexion.getConexion();
            String query="DELETE FROM jugador";
            PreparedStatement del=conexion.prepareStatement(query);
            
            if(del.executeUpdate()>0){
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar "+ e.getMessage());
        }
        return false;
    }
    public boolean validarId(String id){
        try {
            Connection conexion=Conexion.getConexion();
            String query="SELECT * FROM JUGADOR WHERE ID=?";
            PreparedStatement bus= 
                    conexion.prepareStatement(query);
            bus.setString(1, id);
            // ResultSet es una subtabla con los registros que 
            // cumplieron la query
            ResultSet rs = bus.executeQuery();
            // next retorna true si hay registro para leer dento
            // del ResultSet, false en caso contrario
            if(rs.next()){
                return true;
            }            
        } catch (Exception e) {
            System.out.println("Error al validar "+e.getMessage());
        }
        return  false;
    }
    
    public Jugador buscarPorId(String id){
        Jugador jug = null;
        try {
            Connection conexion=Conexion.getConexion();
            String query="SELECT * FROM JUGADOR "
                    + "WHERE ID=?";
            PreparedStatement bus= 
                    conexion.prepareStatement(query);
            bus.setString(1, id);
            ResultSet rs = bus.executeQuery();
            if(rs.next()){
                jug = new Jugador();
                jug.setId(rs.getString("id"));
                jug.setNombre(rs.getString("nombre"));
                jug.setAlias(rs.getString("alias"));
                jug.setCantidadVictorias(rs.getInt("victorias"));
                jug.setCantidadDerrotas(rs.getInt("derrotas"));
                jug.setCantidadJuegos(rs.getInt("partidas"));
            }            
        } catch (Exception e) {
            System.out.println("Error al buscar "
                +e.getMessage());
        }        
        return jug;
    }
    
    public boolean modificarJugadorV(Jugador jug){
        try {
            Connection conexion= Conexion.getConexion();
            String query="UPDATE JUGADOR SET victorias=?, derrotas=?, partidas=? WHERE id=?";
            PreparedStatement mod=
                    conexion.prepareStatement(query);
            mod.setInt(1, jug.getCantidadVictorias()+1);
            mod.setInt(2, jug.getCantidadDerrotas());
            mod.setInt(3, jug.getCantidadJuegos()+1);
            mod.setString(4, jug.getId());
            if(mod.executeUpdate()>0){
                return true;
            }            
        } catch (Exception e) {
            System.out.println("Error al modificar "
                    + e.getMessage());
        }
        return false;
    }
    public boolean modificarJugadorD(Jugador jug){
        try {
            Connection conexion= Conexion.getConexion();
            String query="UPDATE JUGADOR SET victorias=?,"
                    + "derrotas=?, partidas=?,"
                    + " WHERE id=?";
            PreparedStatement mod=
                    conexion.prepareStatement(query);
            mod.setInt(1, jug.getCantidadVictorias());
            mod.setInt(2, jug.getCantidadDerrotas()+1);
            mod.setInt(3, jug.getCantidadJuegos()+1);
            mod.setString(4, jug.getId());
            if(mod.executeUpdate()>0){
                return true;
            }            
        } catch (Exception e) {
            System.out.println("Error al modificar "
                    + e.getMessage());
        }
        return false;
    }
    public ArrayList<Jugador> mostrarHistorico(){
        ArrayList<Jugador> lista = new ArrayList<>();
        try {
            Connection conexion =Conexion.getConexion();
            String query="SELECT * FROM jugador";
            PreparedStatement bus=conexion.prepareStatement(query);
            // Ejecutamos la query, obtenemos un ResultSet
            ResultSet rs = bus.executeQuery();
            // Mientras existen registros por recorrer next()
            while (rs.next()){
                Jugador jug = new Jugador();
                jug.setId(rs.getString("id"));
                jug.setNombre(rs.getString("nombre"));
                jug.setAlias(rs.getString("alias"));
                jug.setCantidadVictorias(rs.getInt("victorias"));
                jug.setCantidadDerrotas(rs.getInt("derrotas"));
                jug.setCantidadJuegos(rs.getInt("partidas"));
                lista.add(jug);                        
            }            
        } catch (Exception e) {
            System.out.println("Error al buscar "+ e.getMessage());
        }
        return lista;
    }
}
