/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutor;

import mx.edu.uttt.busines.EstudianteBO;
import mx.edu.uttt.transfer.EstudianteVO;

/**
 *
 * @author Ricardo Hiram
 */
public class TransferObjectPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EstudianteBO studentBusinessObject = new EstudianteBO();
        
        for(EstudianteVO student : studentBusinessObject.getAllStudents()){
            System.out.println("Estudiante:[Matricula: "+student.getNoMatricula()+", Nombre:"+student.getNombre()+"]");
            
        }
        EstudianteVO student = studentBusinessObject.getAllStudents().get(0);
        student.setNombre("Armando");
        studentBusinessObject.updateStudent(student);
        student  = studentBusinessObject.getStudent(0);
        System.out.println("Estudiante: [Numero de matricula:"+student.getNoMatricula()+", nombre"+ student.getNombre()+"]");
    }
    
}
