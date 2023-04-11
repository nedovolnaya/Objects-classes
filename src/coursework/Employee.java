package coursework;

public class Employee {
    String name;
    int department;
    int salary;
    int id;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }


    public String getName() {
        return this.name = name;
    }

    public int getDepartment() {
        return this.department = department;
    }

    public int getSalary() {
        return this.salary = salary;
    }

    public int getId() {
        return this.id = id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
