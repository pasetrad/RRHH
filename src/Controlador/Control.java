/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Negocio.ModeloAgregar;
import Negocio.ModeloBuscar;
import Negocio.ModeloListar;
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
    private ModeloAgregar agrega;
    private ModeloListar lista;
    
    public int agregar(int rut, String dv, String fechaIngreso,String direccion, String fechaCumple,String nombre,String apellido){
        agrega = new ModeloAgregar();
        return agrega.Ingresar(rut, dv, fechaIngreso, direccion, fechaCumple, nombre, apellido);
    }
    public ArrayList<Personal> listar(){
        lista = new ModeloListar();
        return lista.Listar();
    }
}
