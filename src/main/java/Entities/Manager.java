package Entities;

import java.sql.Date;

public class Manager extends Employee{
    private Double bonus;

    public Manager(){
        super();
    }

    public Manager(Integer ID, String name, String cpf, Double salary, String admissionDate, Double bonus){
        super(ID, name, cpf, salary, admissionDate);
        this.bonus = bonus;
    }

    public Double getBonus() {
        return bonus;
    }

    public Double totalSalary() {
        return super.getSalary() * bonus/100 + super.getSalary();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
