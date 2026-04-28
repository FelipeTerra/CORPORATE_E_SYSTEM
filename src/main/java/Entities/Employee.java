package Entities;

import java.sql.Date;

public class Employee extends Person {
    private Double salary;
    private String admissionDate;

    public Employee(){
        super();
    }

    public Employee(Integer ID, String name, String cpf, Double salary, String admissionDate){
        super (ID, name, cpf);
        this.salary = salary;
        this.admissionDate = admissionDate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
