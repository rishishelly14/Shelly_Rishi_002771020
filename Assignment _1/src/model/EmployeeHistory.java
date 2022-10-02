/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author rishi
 */
public class EmployeeHistory {
    
    private ArrayList<Employees> history;
    
    public EmployeeHistory(){
        
        this.history = new ArrayList<Employees>();
        
        
    }

    public ArrayList<Employees> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employees> history) {
        this.history = history;
    }
    
    public Employees addNewEmp(){
        Employees newEmp = new Employees();
        history.add(newEmp);
        return newEmp;
    }
    
    public void deleteEmployee(Employees e){
        history.remove(e);
    }
}
