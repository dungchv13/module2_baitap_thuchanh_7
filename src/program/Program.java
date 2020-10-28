package program;

import methods.CanBoManage;

public class Program {


    public static void main(String[] args) {
        CanBoManage canBoManage = new CanBoManage();
        Menus menu = new Menus();
        Input input = new Input();
        do{
            System.out.println("-------------MENU-----------");
            System.out.println("1.add CBGV.");
            System.out.println("2.display All CBGV");
            System.out.println("3.get TRUE_SALARY for a CBGV.");
            System.out.println("0.EXIT.");
            int choice = input.inputINT("choice");
            System.out.println("****************");
            switch (choice){
                case 1:
                    menu.menu1(canBoManage);
                    System.out.println("****************");
                    break;
                case 2:
                    menu.menu2(canBoManage);
                    System.out.println("****************");
                    break;
                case 3:
                    menu.menu3(canBoManage);
                    System.out.println("****************");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("chua co chuc nang nay!");
                    System.out.println("****************");

            }
        }while(true);
    }
}
