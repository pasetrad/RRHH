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
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author pase
 */
public class ModeloBuscar {
    private ArrayList<Personal> lista;
    private Personal persona;
    
    public ArrayList buscarPersonal(Integer rut) {
        String sentencia="SELECT (ID, RUT, DV, FECHAINGRESO, DIRECCION, FECHACUMPLE, NOMBRE, APELLIDO) FROM PERSONAL WHERE RUT= (?)";
            persona = new Personal();
            lista = new ArrayList();
            try {
                PreparedStatement ps = acceso.obtenerInstancia().prepareStatement(sentencia);
                ResultSet rs=ps.executeQuery(sentencia);
                while (rs.next()){
                    persona.setRut(rs.getInt("RUT"));
                    persona.setDv(rs.getString("DV"));
                    persona.setFechaIngreso(rs.getString("FECHAINGRESO"));
                    persona.setDireccion(rs.getString("DIRECCION"));
                    persona.setFechaCumple(rs.getString("FECHA CUMPLE"));
                    persona.setNombre(rs.getString("NOMBRE"));
                    persona.setApellido(rs.getString("APELLIDO"));
                    ;
                    
                    System.out.println("Buscando registro...");
                        }
            }catch (SQLException e){
                 System.out.println("Se produjo un error en la búsqueda");
            }
        return lista;
        
    }
    
}
