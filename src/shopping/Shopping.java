/*
 * William Zwart
 * 5/10/18
 * This will allow you to "shop" online.
 */

package shopping;
import java.util.Scanner;
/**
 *
 * @author wizwa9381
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        //variables
        double usb = 19.99;
        double keyboard = 49.99;
        double mouse = 25.99;
        double tax = 0.13;
        double usbAmount,keyboardAmount,mouseAmount,taxAmount,totalAmount,usbTotal,keyboardTotal,mouseTotal;
        int taxTotal;
        //Amount of what you want to buy
        System.out.print("Enter the amount of USB's you wish to buy. ");
        usbAmount = keyedInput.nextDouble();
        System.out.print("Enter the amount of keyboards you wish to buy. ");
        keyboardAmount = keyedInput.nextDouble();
        System.out.print("Enter the amount of computer mice you wish to buy. ");
        mouseAmount = keyedInput.nextDouble();
        usbTotal = usb * usbAmount;
        keyboardTotal = keyboard * keyboardAmount;
        mouseTotal = mouse * mouseAmount;
        taxAmount = (usbTotal + keyboardTotal + mouseTotal) * tax;
        taxAmount = taxAmount * 100;
        taxTotal = (int)taxAmount;
        taxAmount = taxTotal;
        taxAmount = taxAmount/100;
        totalAmount = usbTotal + keyboardTotal + mouseTotal + taxAmount;
        System.out.println("$" + usbTotal + " is your total USB cost.");
        System.out.println("$" + keyboardTotal + " is your total keyboard cost.");
        System.out.println("$" + mouseTotal + " is your total mouse cost.");
        System.out.println("$" + taxAmount + " is your total tax cost.");
        System.out.println("$" + totalAmount + " is your grand total.");
        keyedInput.close();
    }
    
}