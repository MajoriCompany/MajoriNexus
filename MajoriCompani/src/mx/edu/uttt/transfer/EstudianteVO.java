/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.transfer;

/**
 *
 * @author Ricardo Hiram
 */
public class EstudianteVO {
    private String nombre;
    
    private int noMatricula;
    
    public  EstudianteVO(String nombre, int noMatricula) {
    this.nombre  = nombre;
    this.noMatricula = noMatricula;
}

    public String getNombre() {
        return nombre;
    }

    public int getNoMatricula() {
        return noMatricula;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
}
