/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;

/**
 *
 * @author Usuario
 */
public class Usuario {
    
    private String id;
    private String username;
    private String password;
    
    private String sql;
    private String sql2;
    private PreparedStatement sentencia;
    private ResultSet resultadoQuery;
    private ResultSetMetaData _mtd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * Este metodo crea un registro y devuelve un entero que es el id que se le 
     * asigno en la base de datos al registro
     * @param datos
     * @return el id de el registro insertado
     */
    public int crear(HashMap datos) {

        try {            
            sql = "INSERT INTO public.usuarios(\n" +
"                              username_usuarios)\n" +
"                       VALUES (?) RETURNING id_usuarios;";
            
            sentencia = Conexion.getConexion().prepareStatement(sql);           
            sentencia.setString(1, datos.get("usuario").toString());          
            
            System.out.println(sentencia);     
            
            resultadoQuery = sentencia.executeQuery();
            resultadoQuery.next();      
            Integer idTemporal = resultadoQuery.getInt(1);
            sentencia.close();
            return idTemporal;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());            
        }finally{
            
        }
        
        return -1;
    }
    
    /**
     * Este metodo establece el id del usuario sea un nuevo usuario o uno ya registrado
     * devuelve un HasMap con los datos del usuario
     * @param datos
     * @return datos del usuario en un hashmap si todo esta correcto, sino retorna null
     */
    public HashMap ingresarAlSistema(HashMap datos) {
        
        sql = "SELECT * FROM public.usuarios WHERE username_usuarios = ?;";
        
        try{
            
            sentencia = Conexion.getConexion().prepareStatement(sql);           
            sentencia.setString(1, datos.get("usuario").toString());           
            
            System.out.println(sentencia);     
            
            resultadoQuery = sentencia.executeQuery();
            
            if(resultadoQuery.next()){                
                datos.put("id", resultadoQuery.getInt(1)); 
                System.out.println(resultadoQuery.getInt(1)+"con RS");                                             
            }
            else {
               datos.put("id", crear(datos));
            };            
            sentencia.close();
            return datos;
        }catch(SQLException ex){
            System.out.println(ex.getMessage()); 
        }
        
        return null;
    }
    
}
