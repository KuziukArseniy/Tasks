package TaskWithOrganization;

public class Subordinate extends Human {
    private String name;
    private int salary;

    Subordinate(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int salaryEachMonths(int countMonths) {
        return salary * countMonths + (salary / 2);
    }


    public String nameAndILoveMyMyshka() {
        return name + "  :)The most important thing is that I love my Myshka";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
