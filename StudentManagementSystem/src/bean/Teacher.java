package bean;

public class Teacher extends Person {

    private String school_name;
    private String salary;

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getSalary() {
        return salary;
    }
    
    @BoshOlmasin
    public void setSalary(String salary) {
        this.salary = salary;
    }

}
