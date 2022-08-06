package service.menu;

import bean.Config;
import bean.Teacher;
import java.util.Scanner;
import service.menu.update.*;

public class MenuAddTeacherService implements MenuAddTeacherServiceUpdate {

    @Override
    public void process1() {
        System.out.println("*** YOU ARE WELCOME TO ADD TEACHER MENU ***");

        Scanner sc = new Scanner(System.in);

        System.out.print("\nPlease enter teacher name: ");
        String t_name = sc.nextLine();

        System.out.print("\nPlease enter teacher surname: ");
        String t_surname = sc.nextLine();

        Teacher t = new Teacher();

        t.setName(t_name);
        t.setSurname(t_surname);

        Config.instanceOf().appendTeacher(t);

        System.out.println("\nTeacher " + t.getName()+ " " + t.getSurname()+ " is succesfully added.\n");
        
        Config.save();
    }

}
