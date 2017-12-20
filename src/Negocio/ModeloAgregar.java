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
public class ModeloAgregar {
    private int x;
    public int Ingresar(int rut, String dv, String fechaIngreso,String direccion, String fechaCumple,String nombre,String apellido){
        
        try {
            String sql = "insert into personal (id_personal,rut,dv,fechaIngreso,direccion,fechaCumple,nombre,apellido)\n" +
"values (cod_personal.nextval,?,?,to_timestamp(?,'YYYY-MM-DD HH24:MI:SS'),?,to_timestamp(?,'YYYY-MM-DD HH24:MI:SS'),?,?)";
            PreparedStatement preparedStatement = acceso.obtenerInstancia().prepareStatement(sql);
            preparedStatement.setInt(1,rut);
            preparedStatement.setString(2,dv);
            //fecha con dia, mes, año
            preparedStatement.setString(3,fechaIngreso);
            preparedStatement.setString(4,direccion);
            //fecha con dia, mes, año
            preparedStatement.setString(5,fechaCumple);
            preparedStatement.setString(6,nombre);
            preparedStatement.setString(7,apellido);
            preparedStatement.execute();
            String sq2 = "select seq_id_trans.currval as valor from dual";
            preparedStatement = acceso.obtenerInstancia().prepareStatement(sq2);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
            x = resultSet.getInt("valor");
            }
            return x;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloAgregar.class.getName()).log(Level.SEVERE, null, ex);
            return x;
        }
    }
    
}
