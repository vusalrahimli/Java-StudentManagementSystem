package FileUtility;

import java.util.Scanner;

public class MenuUtil {
    
    public static void showMenu() {
        
        Menu.showAllMenu();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter Menu: ");
        int selected_menu = sc.nextInt();
        
        Menu menu = Menu.find(selected_menu);
        menu.process2();
        
    }
    
    public static void processMenu(Menu menu) {
        menu.process2();
    }
    public static void main(String[] args) {
        showMenu();
    }
}
