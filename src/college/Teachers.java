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
public class Teachers extends Employees {
    public String department;
    
    public Teachers (String name, String lastname, int id, String maritalStatus, String startingDate, int officeNumber, String department){
            super (name, lastname, id, maritalStatus, startingDate, officeNumber);
            this.department = department;
    }
    
    public void setDepartment (String department) {
        this.department= department;
    }
}
