/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Puntaje {
    
    private String id;
    private String id_usuario;
    private String puntos;
    
    private String sql;
    private PreparedStatement sentencia;
    private ResultSet resultadoQuery;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }

    
    
    public void crear(Puntaje datos) {

        try {
            
            sql = "INSERT INTO public.puntajes(\n" +
"                              id_usuarios, puntos_puntuacion)\n" +
"                       VALUES (?, ?);";
            
            sentencia = Conexion.getConexion().prepareStatement(sql);           
            sentencia.setInt(1, Integer.parseInt(datos.getId_usuario()));
            sentencia.setInt(2, Integer.parseInt(datos.getPuntos()));
            
            System.out.println(sentencia);
            
            resultadoQuery = sentencia.executeQuery();
            resultadoQuery.next();
            sentencia.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());            
        }
    }
    
    public void consultarMejores(){
        
        try {
            
            String mejoresp = "";
            sql = "SELECT username_usuarios, puntos_puntuacion FROM public.puntajes JOIN public.usuarios using(id_usuarios) ORDER BY puntos_puntuacion DESC LIMIT 10;";
            
            sentencia = Conexion.getConexion().prepareStatement(sql);
            
            System.out.println(sentencia);
            
            resultadoQuery = sentencia.executeQuery();
            
            while(resultadoQuery.next()){
                mejoresp += resultadoQuery.getString(1)+ " , "  + resultadoQuery.getString(2) + "\n";
            }
            
            JOptionPane.showMessageDialog(null, mejoresp);
            sentencia.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());            
        }
    }
    public void consultarPuntajeJugadorIndividual(){
        
        try {
            
            String mejoresp = "";
            sql = "SELECT username_usuarios, puntos_puntuacion FROM public.puntajes JOIN public.usuarios using(id_usuarios) ORDER BY puntos_puntuacion DESC LIMIT 10;";
            
            sentencia = Conexion.getConexion().prepareStatement(sql);
            
            System.out.println(sentencia);
            
            resultadoQuery = sentencia.executeQuery();
            
            while(resultadoQuery.next()){
                mejoresp += resultadoQuery.getString(1)+ " , "  + resultadoQuery.getString(2) + "\n";
            }
            
            JOptionPane.showMessageDialog(null, mejoresp);
            sentencia.close();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());            
        }
    }
    
    
}
