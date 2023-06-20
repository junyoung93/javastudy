package extendsEx2;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee(40000);
        HRManager h = new HRManager(80000);


        e.work();
        System.out.println("급여 : " + e.getSalary());
        h.work();
        System.out.println("매니저 급여 : " + h.getSalary());
        h.addEmployee();
    }
}
