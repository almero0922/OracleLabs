package hrapp;


public class Employee {
    
    private String name;
    private int ID;
    private double salary;
    
    public Employee(String name, int ID, double salary){
        this.setName(name);
        this.setID(ID);
        this.setSalary(salary);
    }
     @Override
     public String toString(){
        return getName()+", " + getID() + ", " + getSalary();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
          
    
}
