package session7.practice;

import java.sql.Timestamp;

public class TimeStampPractice {

    public static void main(String[] args) {
        Timestamp currentTimeStamp = new Timestamp(System.currentTimeMillis());  //obiect tipul timestamp
        System.out.println("Current timestamp: " + currentTimeStamp);

        Timestamp timestamp1= Timestamp.valueOf("2023-09-20:30.214");
        Timestamp timestamp2= Timestamp.valueOf("2023-09-21:30.214");

        long differenceInSeconds= (timestamp2.getTime() - timestamp1.getTime()) / 100;
        System.out.println("Difference in seconds: " + differenceInSeconds);
    }
}
