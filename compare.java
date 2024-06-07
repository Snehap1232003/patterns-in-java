import java.io.*;
import java.util.*;




class compare{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if(1<=num && num <= 100){
            if(num % 2 != 0){
                System.out.println("Weird");
            }else{
                if(2 <= num && num <= 5){
                    System.out.println(" Not Weird");
                } else if(6 <= num && num <= 20){
                    System.out.println("Weird");
                } else{
                    System.out.println("Not Weird");
                }
            }
        } else{
            System.out.println("out off range!!");
        }
    }
}


