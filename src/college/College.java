/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

/**
 *
 * @author angelica
 */
public class College {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        People person1= new People ("luis", "perez", 0, "soltero");
        System.out.println ("marital status=" + person1.maritalstatus);
        person1.setMaritalStatus("casado");
        System.out.println ("marital status=" + person1.maritalstatus);
        
        Students student1= new Students ("angel", "arias", 38652, "divorciado");
        student1.setEnrollCourse("matematicas");
        student1.setEnrollCourse("ciencias");
        student1.setEnrollCourse("ciencias");
        System.out.println ("courses=" + student1.courses);
        
        Employees employee1= new Employees ("antonio", "ruiz", 75437909, "unión libre", "Mayo 14 2007", 123);
        System.out.println("office number= "+ employee1.officeNumber);
        employee1.setOfficeNumber(564);
        System.out.println ("office number=" + employee1.officeNumber);
        
        Teachers teacher1= new Teachers ("juan", "mejia", 54789, "casado", "Junio 12 2011", 345,"humanidades");
        System.out.println ("department=" + teacher1.department);
        teacher1.setDepartment("tecnología");
        System.out.println ("department=" + teacher1.department);
        
        ToiletStaff toiletstaff1= new ToiletStaff ("miguel", "lopez", 8532456, "unión libre", "Abril 03 2009", 765, 21);
        System.out.println ("section=" + toiletstaff1.section);
        toiletstaff1.setSection(12);
        System.out.println ("section=" + toiletstaff1.section);
   
               
        // TODO code application logic here
    }
    
}
