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
public class Employees extends People {
    public String startingDate;
    int officeNumber;
    
    public Employees (String name, String lastname, int id, String maritalStatus, String startingDate, int officeNumber){
            super (name, lastname, id, maritalStatus);
            this.startingDate = startingDate;
            this.officeNumber = officeNumber;
    }
    
    public void setOfficeNumber (int officeNumber) {
        this.officeNumber= officeNumber;
    }
    
}
