package bean;

import FileUtility.FileUtility;
import java.io.Serializable;
import java.util.Scanner;

public class Config implements Serializable {

    private static Config config = null;
    private Student[] students = new Student[0];
    private Teacher[] teachers = new Teacher[0];
    private static boolean logged_in; //false
    private static final String fileName = "file.obj";

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }

    public static boolean isLogged_in() {
        return logged_in;
    }

    public static void setLogged_in(boolean logged_in) {
        Config.logged_in = logged_in;
    }

    public void appendStudent(Student s) {

        Student[] new_students = new Student[students.length + 1];

        for (int i = 0; i < students.length; i++) {
            new_students[i] = students[i];
        }

        new_students[new_students.length - 1] = s;

        students = new_students;
    }

    public void appendTeacher(Teacher t) {

        Teacher[] new_teachers = new Teacher[teachers.length + 1]; //{null, null}
     

        for (int i = 0; i < teachers.length; i++) {
            new_teachers[i] = teachers[i];
            //teachers[0] = {qenime}
        }
        new_teachers[new_teachers.length - 1] = t; //{qenime}

        teachers = new_teachers;
    }

    public static Config instanceOf() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }

    public static void initialize() {
        Object obj = FileUtility.readFileDeserialize(fileName);

        if (obj == null) {
            return;
        }
        if (obj instanceof Config) {
            config = (Config) obj;
        }
    }

    public static void save() {
        FileUtility.writeObjectToFile(config, fileName);
    }
}
