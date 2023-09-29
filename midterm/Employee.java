package Coding_ll_23.midterm;

public class Employee {
    private int employee_id ;
    private String employee_name;
    private int employee_salary;

    public Employee( int employee_id,String employee_name,int employee_salary){
        this.employee_salary = employee_salary;
        this.employee_id = employee_id;
        this.employee_name = employee_name;
    }




    public int getEmployee_id() {
        return employee_id;
    }
    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }
    public String getEmployee_name() {
        int spaceindex = 0;
        for(int i = 0; i< employee_name.length(); i++) {
           char ca = employee_name.charAt(i);
           if (ca == ' '){
               spaceindex = i;
           } 
       }
       return employee_name.substring(spaceindex)+ " " +employee_name.substring(0, spaceindex);
        
    }
    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }
    public int getEmployee_salary() {
        return employee_salary;
    }
    public void setEmployee_salary(int employee_salary) {
        this.employee_salary = employee_salary;
    }


    
}
