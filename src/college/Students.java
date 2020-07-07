/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

import java.util.ArrayList;

/**
 *
 * @author angelica
 */
public class Students extends People {
    public ArrayList courses;

    public Students (String name, String lastname, int id, String maritalStatus){
        super (name, lastname, id, maritalStatus);
        this.courses = new ArrayList () ;
    }

    public void setEnrollCourse (String course){
      try {
        if(this.courses.contains(course)){
          throw new ArrayIndexOutOfBoundsException("Course is already enrolled.");
        }
        this.courses.add(course);
      }
      catch (Exception exp) {
        System.out.println("Error: "+exp.getMessage());
      }
    }
}
