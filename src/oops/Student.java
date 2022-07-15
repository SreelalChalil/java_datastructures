package oops;

import java.util.HashMap;
import java.util.Map;

public class Student extends Person{

    private int standard;
    private Map<String,Integer> subMarks = new HashMap<>();

    Student(){
        super();
    }
    Student(int standard, Map<String, Integer> subMarks){
        this.standard = standard;
        this.subMarks = subMarks;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public Map<String, Integer> getSubMarks() {
        return subMarks;
    }

    public void setSubMarks(Map<String, Integer> subMarks) {
        this.subMarks = subMarks;
    }


    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;

        if(obj == null || obj.getClass()!= this.getClass())
            return false;

        Student student = (Student) obj;

        return (student.getFirstName() == this.getFirstName() && student.getLastName() == this.getLastName());
    }

    @Override
    public int hashCode() {
        return this.getId();
    }
}
