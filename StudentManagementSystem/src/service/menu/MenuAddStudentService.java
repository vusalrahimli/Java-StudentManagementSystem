package service.menu;

import bean.Config;
import bean.Student;
import java.util.Scanner;
import service.menu.update.*;

public class MenuAddStudentService implements MenuAddStudentServiceUpdate {

    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void process1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter student name: ");
        String name = sc.nextLine();

        System.out.print("\nEnter student surname: ");
        String surname = sc.nextLine();
        
        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);

        Config.instanceOf().appendStudent(s);
        
        System.out.println("\nStudent "+s.getName()+" "+s.getSurname()+" is succesully added.");
        
        Config.save();
    }

}
