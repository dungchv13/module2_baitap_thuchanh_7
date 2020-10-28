package methods;

import quantities.CBGV;
import quantities.CanBo;

import java.io.IOException;
import java.util.ArrayList;

public class CanBoManage {
    ArrayList<CBGV> cbGvList = new ArrayList<>();

    public void add(CBGV cbgv){

        try {

                cbGvList = FileManage.readFile();

        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        }

        cbGvList.add(cbgv);

        try {
            FileManage.writeFile(cbGvList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayAll(){
        try {
            if(FileManage.readFile() != null) {
                cbGvList = FileManage.readFile();
            }else {
                System.out.println("ko co CanBo nao trong bo nho!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (CBGV c: cbGvList) {
            System.out.println(c.toString());
        }
    }

    public double calculateSalary(String name,String address){
        try {
            if(FileManage.readFile() != null) {
                cbGvList = FileManage.readFile();
            }else {
                System.out.println("ko co CanBo nao trong bo nho!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (CBGV gv:cbGvList) {
            if(gv.getName().equals(name) && gv.getAddress().equals(address)){
                return (gv.getSalary()+gv.getBonus()-gv.getFine());
            }
        }
        return -1;
    }
}
