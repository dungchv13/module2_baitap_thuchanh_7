package quantities;

import java.io.Serializable;
import java.time.LocalDate;

public class CBGV extends CanBo {
    private double salary;
    private double bonus;
    private double fine;

    public CBGV() {
        super();
    }

    public CBGV(String name, LocalDate birthDay, String address, double salary, double bonus, double fine) {
        super(name, birthDay, address);
        this.salary = salary;
        this.bonus = bonus;
        this.fine = fine;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public LocalDate getBirthDay() {
        return super.getBirthDay();
    }

    @Override
    public void setBirthDay(LocalDate birthDay) {
        super.setBirthDay(birthDay);
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    @Override
    public String toString() {
        return "CBGV{" +
                "name='" + this.getName() + '\'' +
                ", birthDay=" + this.getBirthDay() +
                ", address='" + this.getAddress() + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", fine=" + fine +
                "} ";
    }
}
