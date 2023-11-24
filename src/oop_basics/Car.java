/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_basics;

/**
 *
 * @author PC
 */
public class Car {
     String car_name;
   double car_price;
    
    Car(String car_name,double car_price){
        this.car_name = car_name;
        this.car_price = car_price;
}     
    void CarMode(){
        System.out.println(car_name +"is a race car");
    }
    void CarPrice(){
        System.out.println(car_price+"is grabi ka mahal!");
    }
    
}
