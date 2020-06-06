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
public class ToiletStaff extends Employees{
    int section;
    
    public ToiletStaff (String name, String lastname, int id, String maritalStatus, String startingDate, int officeNumber, int section){
            super (name, lastname, id, maritalStatus, startingDate, officeNumber);
            this.section= section;
    }
    
    public void setSection (int section){
        this.section=section;
        }
    
}
