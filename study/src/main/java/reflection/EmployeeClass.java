package reflection;

/**
 * EmployeeClass
 * Create by  chenqiang  on   2017/12/26 11:37
 */
public class EmployeeClass {

    public static void main(String[] args) {
        Employee employee = new Employee("Jeff");
        Employee manager = new Manager("Boss");

        System.out.println(employee.getClass().getName() + " " + employee.getName());
        System.out.println(manager.getClass().getName() + " " + manager.getName());
    }
}

class Employee {
    private String name;

    Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Manager extends Employee {
    Manager(String name) {
        super(name);
    }
}