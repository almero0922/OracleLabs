package hrapp;

import java.util.Scanner;

public class HRApp {

    public static void main(String[] args) {
        int idS;
        String name;
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Welcome To Human Resource App");
        System.out.println("Enter the department name: ");
        name = consola.nextLine();
        
        Department dept1 = new Department();
        dept1.setName(name);
        System.out.println("Department name: " + dept1.getName());
        
        Employee emp1 = new Employee("Alberto", 1001, 8000);
        Employee emp2 = new Employee("Susana", 1002, 8000);
        Employee emp3 = new Employee("Albert", 1003, 8000);
        
        dept1.addEmp(emp1);
        dept1.addEmp(emp2);
        dept1.addEmp(emp3);
        
        Employee[] emps = dept1.getEmps();
        
        int i = 0;
        for(Employee emp: emps){
            i++;
            System.out.println("Employee " + i +(": ")  + emp);
        }
        
        System.out.println("Total salary: " + dept1.getTotalSalary());
        System.out.println("Average salary: " + dept1.getAveSalary());
        
        System.out.println("Employee ID: ");
        idS = consola.nextInt();
        
        System.out.println("Employee: " + dept1.identifyEmp(idS));
        
        
            
        

    }
    
}
