package extendsEx5;

public class Employee extends Person{
    private int employeeId;
    private String jobTitle;

    // 추가로 this로 더 받네!!
    public Employee(String firstName, String lastName, int employeeId, String jobTitle){
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;

    }

    public int getEmployeeId(){
        return employeeId;
    }

    // super.getLastName() 는 부모꺼 불러오기
    public String getLastName(){
        return super.getLastName() + ", " + jobTitle;
    }
}
