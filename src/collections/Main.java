package collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Sreelal", 50000);
        Employee e2 = new Employee(2, "Arun", 40000);
        Employee e3 = new Employee(3, "Arjun", 60000);

        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

        List<Employee> sortedList = empList.stream().sorted().toList();

        sortedList.stream().forEach(e -> {
            System.out.println("id :" + e.id + " salary: " + e.salary);
        });
    }
}

class Employee implements  Comparable<Employee>{
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.salary> o.salary){
            return  1;
        }

        else if(this.salary == o.salary){return  0;}
        else return -1;

    }
}

