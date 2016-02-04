/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Juan
 */
public class HiringManager {
    
    private Employee employee;
    
    public void hireEmployee(){
        employee.setEmpInfo("Tom", "Red", "000-00-0000", "A12");
        employee.beginOrientation();
    }

    public Employee getEmployee() {
        return employee;
    }
    
    public String getEmpStatus(){
        return employee.getStatus();
    }
    

}
