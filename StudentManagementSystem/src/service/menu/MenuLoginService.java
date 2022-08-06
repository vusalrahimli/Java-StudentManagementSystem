package service.menu;

import bean.Config;
import java.util.Scanner;
import service.menu.update.MenuLoginServiceUpdate;

public class MenuLoginService implements MenuLoginServiceUpdate {

    @Override
    public void process1() {
        System.out.println("*** Welcome to Login Menu ***\n"
                + "*** Please enter your personal information ***");

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter your username: ");
        String username = sc.nextLine();

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        if (password.equals("11111") && username.equals("user")) {
        } else {
            throw new IllegalArgumentException("Username or password are invalid!");
        }

        Config.setLogged_in(true);

    }

}
