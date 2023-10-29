package TaskWithOrganization;

import java.util.Arrays;

public class Supervisor extends Human {
    private String name;
    private int salary;

    Supervisor(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int salaryEachMonths(int countMonths) {
        return salary * countMonths;
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

    private int countOfSubordinates = 0;
    private Subordinate[] sub = new Subordinate[countOfSubordinates];


    public void addSubordinate(Subordinate subordinate) {
        sub = Arrays.copyOf(sub, sub.length + 1);
        sub[countOfSubordinates] = subordinate;
        countOfSubordinates++;
    }
    public void printSubordinates ()
    {
        if(sub.length == 0)
        {
            System.out.println("У руководителя нет работников");
        }
        else
        {
            String[] names = new String[0];
            for (int i = 0; i < sub.length; i++) {
                names = Arrays.copyOf(names, names.length + 1);
                names[i] = sub[i].getName();
            }
            System.out.println(Arrays.toString(names));
        }
    }
    private int countOfNames = 0;
    private String[] namesOfSubordinates = new String[countOfNames];
    public void addSubordinateName(Subordinate subordinate) {
        namesOfSubordinates = Arrays.copyOf(namesOfSubordinates, namesOfSubordinates.length + 1);
        namesOfSubordinates[countOfNames] = subordinate.getName();
        countOfNames++;
    }
    public void printNames ()
    {
        if(namesOfSubordinates.length == 0)
        {
            System.out.println("У руководителя нет работников");
        }
        else
        {
            for (int i = 0; i < namesOfSubordinates.length; i++) {
                System.out.println(namesOfSubordinates[i]);
            }
        }
    }
}
