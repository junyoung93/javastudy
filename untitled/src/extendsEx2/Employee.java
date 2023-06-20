package extendsEx2;

public class Employee {

    private int Salary;

    public Employee(int Salary){
        this.Salary=Salary;

    }
    public void work(){
        System.out.println("직원으로 열심히 일합시다.");
    }
    public  int getSalary(){
        return Salary;
    }
}
