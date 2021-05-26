
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        
        int giftValue = Integer.valueOf(scan.nextLine());
        
        if(giftValue < 5000) {
            System.out.println("No tax!");
        } else if(giftValue >= 5000 && giftValue < 25000) {
            System.out.println("Tax: "+((giftValue-5000)*0.08+100));
        } else if(giftValue >= 25000 && giftValue < 55000) {
            System.out.println("Tax: "+((giftValue-25000)*0.1+1700));
        } else if(giftValue >= 55000 && giftValue < 200000) {
            System.out.println("Tax: "+((giftValue-55000)*0.12+4700));
        } else if(giftValue >= 200000 && giftValue < 1000000) {
            System.out.println("Tax: "+((giftValue-200000)*0.15+22100));
        } else {
            System.out.println("Tax: "+((giftValue-1000000)*0.17+142100));
        }
        
        

    }
}
