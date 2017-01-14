package capriotti.anthony.WuFi;

/**
 * Created by anthonycapriotti on 1/13/17.
 */
//Want to make this two messages, one for starting currency one for requested type

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);}

    public String askStaringCurrencyType() {
        System.out.println("Welcome to WuFi, what do you need?");
        System.out.println("Enter your starting currency?");
        String currencyType = scanner.nextLine();
        return currencyType;
    }

    public double askCurrentAmount(){
        System.out.println("Enter your current amount?");
        double currencyType = scanner.nextDouble();
        return currencyType;

    }

}
