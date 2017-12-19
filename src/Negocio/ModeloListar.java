/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import accesoBD.acceso;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author simon
 */
public class ModeloListar {
    private ArrayList<Personal> lista;
    private Personal persona;
    public ArrayList<Personal> Listar(){
        
        try {
            String sql="select id_personal,rut,dv,fechaIngreso,direccion,fechaCumple,nombre,apellido from personal";
            PreparedStatement preparedStatement =acceso.obtenerInstancia().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery(); 
            lista = new ArrayList();
            while (resultSet.next()){
                persona = new Personal();
                persona.setId(resultSet.getInt("id_personal"));
                persona.setRut(resultSet.getInt("rut"));
                persona.setDv(resultSet.getString("dv"));
                persona.setFechaIngreso(resultSet.getString("fechaIngreso"));
                persona.setDireccion(resultSet.getString("direccion"));
                persona.setFechaCumple(resultSet.getString("fechaCumple"));
                persona.setNombre(resultSet.getString("nombre"));
                persona.setApellido(resultSet.getString("apellido"));
                lista.add(persona);
            }
            return lista;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(ModeloListar.class.getName()).log(Level.SEVERE, null, ex);
                return null;
        }
        
    }
}
