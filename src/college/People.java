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
public class People {
   public String name;
   public String lastname;
   int id;
   public String maritalstatus;
   
   public People (String name, String lastname, int id, String maritalStatus){
        this.name=name;
        this.lastname=lastname;
        this.id=id;
        this.maritalstatus=maritalStatus;
    }
   
    public void setMaritalStatus (String maritalStatus) {
        this.maritalstatus=maritalStatus;
   }
    
      
    }

