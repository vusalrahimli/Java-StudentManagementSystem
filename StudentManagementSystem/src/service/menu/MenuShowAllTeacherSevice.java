package service.menu;

import bean.Config;
import bean.Teacher;
import service.menu.update.MenuService;

public class MenuShowAllTeacherSevice implements MenuService {

    @Override
    public void process1() {
        Teacher[] t = Config.instanceOf().getTeachers();

        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }

    }

}
