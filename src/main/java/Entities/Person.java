package Entities;

public class Person {
    private Integer ID;
    private String name;
    private String cpf;

    public Person(){}

    public Person(Integer ID, String name, String cpf){
        this.ID = ID;
        this.name = name;
        this.cpf = cpf;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
