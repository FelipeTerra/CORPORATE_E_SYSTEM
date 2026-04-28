package Entities;

import Enumms.EmployeeLevel;

import java.sql.Date;

public class Developer extends Employee{
    private String linguagem;
    private EmployeeLevel workerLevel;

    public Developer(){
        super();
    }

    public Developer(Integer ID, String name, String cpf, Double salary, String admissionDate, String linguagem, EmployeeLevel workerLevel){
        super(ID, name, cpf, salary, admissionDate);
        this.linguagem = linguagem;
        this.workerLevel = workerLevel;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public EmployeeLevel getWorkerLevel() {
        return workerLevel;
    }

    public void setWorkerLevel(EmployeeLevel workerLevel) {
        this.workerLevel = workerLevel;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
