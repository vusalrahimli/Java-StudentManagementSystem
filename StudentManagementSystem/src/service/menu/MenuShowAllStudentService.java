package service.menu;

import bean.Config;
import bean.Student;
import service.menu.update.*;

public class MenuShowAllStudentService implements MenuShowAllStudentUpdate {

    @Override
    public void process1() {
        Student[] students = Config.instanceOf().getStudents();

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        
    }

}
