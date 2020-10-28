package program;

import quantities.CBGV;

import java.time.LocalDate;
import java.util.Scanner;

public class Input {
    public CBGV inputCBGV(){
        Scanner scanner = new Scanner(System.in);
        //String name, LocalDate birthDay, String address, double salary, double bonus, double fine
        String name = inputString("name");
        LocalDate birthDay = inputDate("birth day");
        String address = inputString("address");
        double salary = inputDouble("salary");
        double bonus = inputDouble("bonus");
        double fine = inputDouble("fine");

        return new CBGV(name,birthDay,address,salary,bonus,fine);
    }

    public LocalDate inputDate(String str){
        LocalDate date;
        try{
            System.out.println("Enter "+str+":");
            int day = inputINT("day");
            int month = inputINT("month");
            int year = inputINT("year");
            date = LocalDate.of(year,month,day);
        }catch (Exception e){
            System.out.println("your date you input is not exist!");
            date = inputDate(str);
        }
        return date;
    }

    public String inputString(String str){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter "+str+":");
        String result = scanner.nextLine();
        if(result.equals("")){
            System.out.println("you have not enter "+str+"!");
            result = inputString(str);
        }
        return result;
    }
    public double inputDouble(String str){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter "+str+":");
        double result = 0;
        try{
            result = Double.parseDouble(scanner.nextLine());
        }catch (Exception e){
            System.out.println(str+" must be a number!");
            result = inputINT(str);
        }
        return result;
    }

    public int inputINT(String str){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter "+str+":");
        int result = 0;
        try{
            result = Integer.parseInt(scanner.nextLine());
        }catch (Exception e){
            System.out.println(str+" must be a number!");
            result = inputINT(str);
        }
        return result;
    }
}
