package extendsEx2;

public class HRManager extends Employee{
    public HRManager(int Salary){
        super(Salary);
    }
    public void work(){
        System.out.println("매니저");
    }
    public void addEmployee(){
        System.out.println("새로운직원추가");
    }
}
