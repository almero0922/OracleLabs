package hrapp;

import java.util.Scanner;

public class Department {

    private Employee[] emps = new Employee[10];
    private int numberE;
    private String name;
    private int lastIndex = -1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addEmp(Employee anEmp){

        if(lastIndex < emps.length){
            lastIndex++;
            emps[lastIndex] = anEmp;
            
        }
        
    }
    
    public Employee[] getEmps(){
        
        Employee[] actualEmps = new Employee[lastIndex+1];
        for(int i = 0; i < actualEmps.length; i++){
            actualEmps[i] = emps[i];
        }
        return actualEmps;
    }
    
    public int getEmpCount(){
        return lastIndex+1;
    }
    
    public Employee identifyEmp(int empID){
        
        for(Employee emp: emps){
            if(emp.getID() == (empID))
             return emp;   
        }
        return null;
    }

public double getTotalSalary(){
    double totalSalary = 0.0;
    for(int i = 0; i <lastIndex+1; i++){
        totalSalary = totalSalary + emps[i].getSalary();
    } 
    return totalSalary;
}

public double getAveSalary(){
    if(lastIndex > -1){
    return getTotalSalary() / (lastIndex+1);
    }
    return 0.0;
}
}
