/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.busines;

import mx.edu.uttt.transfer.EstudianteVO;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Ricardo Hiram
 */
public class EstudianteBO {
    
    List<EstudianteVO> students;
    
    public EstudianteBO(){
        
        students = new ArrayList<EstudianteVO>();
        EstudianteVO student1 = new EstudianteVO("Fernanda",0);
        EstudianteVO student2 = new EstudianteVO("Fernando",1);
        students.add(student1);
        students.add(student1);
    }
    public void deleteStudent(EstudianteVO student){
        students.remove(student.getNoMatricula());
        System.out.println("Estudiante:No. de Matricula"+ student.getNoMatricula()+",eliminar de la base de datos");
    }
    
    public List<EstudianteVO> getAllStudents(){
        return students;
    }
    public EstudianteVO getStudent(int NoMatricula){
        return students.get(NoMatricula);
    }
    public void updateStudent(EstudianteVO student){
        students.get(student.getNoMatricula()).setNombre(student.getNombre());
        System.out.println("estudiante: no.de matricula"+student.getNoMatricula()+", Actualizar en la base de datos");
    }
    
}
