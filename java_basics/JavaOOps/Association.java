// Association is a relationship between two classes where one class uses the other class.
// It is a "has-a" relationship.

//copilot: disable

package java_basics.JavaOOps;

import java.util.Scanner;

class SmartCard{
    int emp_idn;
    public void MarkAttendance(Employee e){
        emp_idn = e.getEmpId();
        System.out.println("Marking attendance of employee "+emp_idn);
    }
    public int getEmpIdn(Employee e){
        return emp_idn;
    }
}
class Employee{
    int emp_id;
    
    Employee(){
        System.out.println("enter the employee id");
        Scanner sc = new Scanner(System.in);
        this.emp_id = sc.nextInt();
    }

    public int getEmpId(){
        return emp_id;
    }
    public void Login(SmartCard sc){
        int eid = sc.getEmpIdn(this);
        System.out.println("Employee "+eid+" logged in");
    }
}
class Association{
    public static void main(String[] args) throws Exception{
        System.out.println("Program started running");
        System.out.println("-----------------------------------------");

        Employee e = new Employee();
        System.out.println("new employee created");
        SmartCard sc = new SmartCard();

        sc.MarkAttendance(e);
        e.Login(sc);
    }
}