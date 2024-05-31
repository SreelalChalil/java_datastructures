package oops;

import java.util.*;
import java.util.stream.Collectors;

public class SchoolManagement {

    public static void main(String args[]){

        List<Student> studentList = new ArrayList<>();
        List<Teacher> teacherList = new ArrayList<>();

        int ch =0;
        int stdCh =0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("\n*******************************");
            System.out.println("SCHOOL MANAGEMENT APPLICATION");
            System.out.println("*******************************");
            System.out.println("\n CHOOSE THE OPTION BELOW");
            System.out.println("1. Student Management 2. Teacher Management 0. Exit From App \n");
            System.out.print("Enter your choice: ");
            ch = scanner.nextInt();

            switch (ch){
                case 0: System.exit(0);
                        break;
                case  1 :
                    System.out.println("Student Management");
                    printStudentMenu();
                    stdCh = scanner.nextInt();
                    switch (stdCh){
                        case  1:
                            studentList.add(addStudent());
                            break;
                        case 2:
                            int id = scanner.nextInt();
                            Optional<Student> s = studentList.stream().filter(e -> e.getId() == id).findFirst();
                            studentList.remove(s.get());
                            break;
                        case 3:
                            studentList.forEach( i-> {
                                System.out.println("\n Student Details \n ***** \n ID: "+ i.getId() + " Name:  "+ i.getFirstName() +" "+ i.getLastName() );
                            });
                            break;
                        case 4:
                            id = scanner.nextInt();
                            Optional<Student> s1 = studentList.stream().filter(e -> e.getId() == id).findFirst();
                            if(s1.isPresent()){
                                Student stud = s1.get();
                                System.out.println("Name :" + stud.getFirstName()+ " " + stud.getLastName());
                            }


                    }
                    break;
                case  2:
                    System.out.println("Teacher Management");
                    break;
                default:
                    System.out.println("Invalid Option!");
            }

        }while (ch>0);





    }

    public static void printStudentMenu(){
        System.out.println("\n 1. Add Student 2. Remove Student 3. List All Student 4. View Student Details 5. Update Student Details");
        System.out.print("Enter your choice: ");
    }

    public static Student addStudent(){
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Enter Student ID: ");
        student.setId(scanner.nextInt());
        System.out.print("Enter First Name: ");
        student.setFirstName(scanner.nextLine());
        System.out.print("Enter Last Name: ");
        student.setLastName(scanner.nextLine());
        System.out.print("Enter Age: ");
        student.setAge(scanner.nextInt());
        System.out.print("Enter Gender: ");
        student.setGender(scanner.nextLine());
        return student;
    }

    public static void removeStudent(int id){

    }
}
