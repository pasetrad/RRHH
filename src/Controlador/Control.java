/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Negocio.ModeloBuscar;
import Negocio.Personal;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author simon
 */
public class Control {
private ArrayList<Personal> nuevoPersonal;
private Personal persona;
    public boolean borrarPersonal(int rut) {
        Personal nuevoPersonal = new Personal();
        boolean flag  = false;
        return flag;
    }
    
    public ResultSet buscarPersonal(int rut) {
        persona = new Personal();
        ModeloBuscar buscarModelo = new ModeloBuscar();     
        nuevoPersonal = buscarModelo.buscarPersonal(rut);
        
        return null;
    }
        
    public boolean modificarPersonal(int rut) {
        boolean flag  = false;
        return flag;
    }
    
}
