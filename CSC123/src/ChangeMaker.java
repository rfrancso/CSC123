//Francsico Rodriguez (frodriguez127@toromail.csudh.edu)

import java.util.Scanner;

class MoneyCal2 {
    
    public static void main(String[] args){

    int amount;
    int total;
    int quarters;
    int dime;
    int nickels;
    int pennies;
    int dollars;
    int cents;
    Scanner k=new Scanner(System.in);

    System.out.println("Please enter your amount in dollars: ");
        dollars=k.nextInt(); 

    System.out.print("Please enter your amount in cents: ");
        cents=k.nextInt();

    total=dollars*100+cents;
    quarters=total/25;
    total=total%25;
    dime=total/10;
    total=total%10;
    nickels=total/5;
    total=total%5;
    pennies=total;

    System.out.println(dollars+" dollars and "+cents+" cents are:");
    System.out.println(quarters+" quarters, "+dime+" dimes, "+ nickels+" nickels and "+pennies+" pennies");











    }
}