package program;

import methods.CanBoManage;
import quantities.CBGV;

public class Menus {
    public void menu1(CanBoManage canBoManage){
        Input input = new Input();
        CBGV gv = input.inputCBGV();
        canBoManage.add(gv);
    }
    public void menu2(CanBoManage canBoManage){
        canBoManage.displayAll();
    }
    public void menu3(CanBoManage canBoManage){
        Input input = new Input();
        System.out.println("SLARY:"+canBoManage.calculateSalary(input.inputString("name"),input.inputString("address")));
    }
}
