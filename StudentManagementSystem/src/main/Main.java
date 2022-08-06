package main;

import FileUtility.MenuUtil;
import bean.Config;

public class Main {

    public static void main(String[] args) {
        Config.initialize(); //fileden oxuyur
        MenuUtil.showMenu();
    }

}
