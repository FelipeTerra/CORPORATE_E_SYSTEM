package Application;

import Entities.Manager;

import java.sql.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o ID: ");
        Integer ID = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Salário: ");
        Double salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Data de admissão (dd/MM/yyyy): ");
        String admissionDate = sc.nextLine();
        System.out.print("Bônus: ");
        Double bonus = sc.nextDouble();

        Manager manager = new Manager(ID,name, cpf, salary, admissionDate, bonus);
        System.out.println();
        System.out.println("============== testando ==============");
        System.out.println("ID: " + manager.getID());
        System.out.println("Name: " + manager.getName());
        System.out.println("CPF: " + manager.getCpf());
        System.out.println("Salário: " + manager.getSalary());
        System.out.println("Data de admissão: " + manager.getAdmissionDate());
        System.out.println("Bônus: " + manager.getBonus());
        System.out.println("Salário adicionado do bonus: " + manager.totalSalary());



        sc.close();
    }
}
