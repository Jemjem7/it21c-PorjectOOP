/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccount;

/**
 *
 * @author PC
 */
public class Main {
    
     public static void main(String[] args) {

        Bank j = new Bank();
        j.setName("benz tinga");
        j.setAge(19);
        j.setAccNum(111223);
        j.setBalance(1.5, 1);

        System.out.println("WEST BANK!" + "\n" + "Name:" + j.getName() + "\n" + "Age:" + j.getAge() + "\n" + "Account Number:" + j.getaccNum() + "\n" + "Balance:" + j.getBalance());

    }
    
}
