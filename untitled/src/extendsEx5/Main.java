package extendsEx5;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Kortney","Rosalee",4451,"HR Manager");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " (" + employee1.getEmployeeId() + ")");
    }
}
