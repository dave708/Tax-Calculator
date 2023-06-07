/* Assignment 1
Author: David Mc Sweeney
ID Number:L00177755
Date: 23/01/2023 */

import java.util.*;
public class Assignment1
{
   public static void main(String args[])
   {
      Scanner keyboardIn = new Scanner(System.in);
      int category; //declare variable for category
      double tax, income = 0; //declare variables for tax and income + initialise them to 0
      double amount; //declare variable for amount
      double pay; //declare variable for pay
      double deductible; //declare variable for deductible 
      do
       {
         
         System.out.println("ATU Tax Calculator:");
         System.out.println("1. Student Employee");
         System.out.println("2. Single Employee");
         System.out.println("3. Married Employee");
         System.out.println("0. Exit Calculator"); 
         // prompt user to enter tax category   
         System.out.print("Please enter your tax category: ");      
         category =  keyboardIn.nextInt();
         
         switch(category)
         {
            case 1: //allow user to enter annual income and to display all relevant tax calculations for student category
            System.out.println("Please enter your annual income: ");
            amount = keyboardIn.nextDouble();
            tax = amount * 0.1; //works out tax for user based on chosen category
            System.out.println("Category 1 - Student part time ");
            System.out.println("Annual Income: " +amount);
            System.out.println("Taxable income: " +amount);
            System.out.println("Total tax payable: " +tax);
            pay = amount - tax;//works out take home pay for user
            System.out.println("Take home pay: " +pay);
            System.out.println("You paid tax at a rate of 10% ");
            break;
            
            case 2: //allow user to enter annual income and to display all relevant tax calculations for single category
            System.out.println("Please enter your annual income: ");
            amount = keyboardIn.nextDouble();
            System.out.println("Category 2 - Single employee ");
            System.out.println("Annual Income: " +amount);
            if (amount < 10000) //tells calculator not to tax amount if less than 10000
            {
               tax = 0; //tells program that there is no tax for amount under 10000 in single category
               System.out.println("Income is less than 10000 so no tax payable ");
               }
               else //if amount is above 10000 then will calculate tax on the difference
               {
                  deductible = amount - 10000; // allows calculator to work out what part of the amount needs to be taxed
                  System.out.println("Taxable income: " +deductible);
                  tax = (amount - 10000) * 0.2; // works out tax for user based on single category

                  System.out.println("Total tax payable: " +tax);
                  pay = amount - tax; //works out users take home pay
                  System.out.println("Take home pay: " +pay);
                  System.out.println("You paid tax at a rate of 20% ");
               }
                  break;
                  
                  case 3: //allow user to enter annual income and to display all relevant tax calculations for married full time category
                  System.out.println("Please enter your annual income: ");
                  amount = keyboardIn.nextDouble();
                  System.out.println("Category 3 - Married full-time ");
                  Scanner YesNO = new Scanner(System.in);
                  //allows user to input either yes or no 
                  System.out.println("Does your spouse also work? [yes or no]: ");
                  String yesno = YesNO.next();
                  if (yesno.equals("yes")) //if user inputs yes then Married with two incomes and all relevant calculations + inputs will be displayed
                  {
                     System.out.println("Married with two incomes ");
                     System.out.println("Annual Income: " +amount);
                     if (amount < 20000)
                     {
                     tax = 0; //tells program that there is no tax for amount under 20000 in married full time category (two incomes)
                     System.out.println("Income is less than 20000 so no tax payable ");
                     }
                       else
                       { 
                     deductible = amount - 20000; //allows calculator to work out what part of the amount needs to be taxed
                     System.out.println("Taxable income: " +deductible);
                     tax = deductible *0.25; //works out tax for user based on married full time category (two incomes)
                     System.out.println("Total tax payable: " +tax);
                     pay = amount - tax; //works out users take home pay for chosen category
                     System.out.println("Take home pay: " +pay);
                     System.out.println("You paid tax at a rate of 25%" );
                     }
                  }
                     else if (yesno.equals("no")) //if user inputs no then Married with one income and all relevant calculations + inputs will be displayed
                  {
                     System.out.println("Married with one income ");
                     System.out.println("Annual Income: " +amount);
                     if (amount < 30000)
                     {
                     tax = 0; //tells program that there is no tax for amount under 30000 in married full time category (one income)
                     System.out.println("Income is less than 30000 so no tax payable ");
                     }
                      else
                      {
                        deductible = amount - 30000; //allows calculator to work out what part of the amount needs to be taxed
                        System.out.println("Taxable income: " +deductible);
                        tax = deductible *0.25; //works out tax for user based on married full time category (one income)
                        System.out.println("Total tax payable: " +tax);
                        pay = amount - tax; //works out users take home pay for chosen category
                        System.out.println("Take home pay: " +pay);
                        System.out.println("You paid tax at a rate of 25%" );
                      }
                    }
                        break;
                     
                        case 0: //allows user to exit the program
                        System.out.println("Exiting tax calculator ");
                        break;
                        
                        default: //displays message if user picks an unlisted category
                        System.out.println("Invalid category chosen, please choose options 1 - 3");


             } //close switch

           }while(category != 0); //program will return to menu after each operation is complete until 0 is inputted
         } // close main
       } //close class
         
            
            
         