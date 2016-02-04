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
    
    public void hireEmployee(String fn, String ln, String ssn){
        Employee emp = new Employee();
        emp.setFirstName(fn);
        emp.setLastName(ln);
        emp.setSsn(ssn);
        emp.beginOrientation("B12");
        employee = emp;
    }

    public Employee getEmployee() {
        return employee;
    }
    
    public String getEmpStatus(){
        return employee.getStatus();
    }
    

}
