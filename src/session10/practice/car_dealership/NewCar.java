package session10.practice.car_dealership;

import java.time.LocalDate;

public class NewCar extends Car {

    private LocalDate expirationDate;

    public NewCar(String mode, int year, double price , LocalDate expirationDate){
        super(mode,year,price);
        this.expirationDate=expirationDate;
    }

    public void printExpirationDate(){
        System.out.println(expirationDate);
    }

    public LocalDate getExpirationDate(){
        return expirationDate;
    }

}
