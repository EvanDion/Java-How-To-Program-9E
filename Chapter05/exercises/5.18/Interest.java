/*
 *       Filename:  Interest.java
 *
 *    Description:  Exercise 5.18 - Modified Compound-Interest Program
 *
 *        Created:  06/10/15 14:34:43
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com // @Edited by : EvanDion
 *       @Version:  1.1
 *
 * =====================================================================================
 */

// TODO Finish this - Spent too much time on it and couldn't be bothered
//                    figuring it out

public class Interest{
    public static void main(String args[]){
        int amount; 
        int principal = 100000; 
        int rate = 5;
       
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        
        for (int year = 1; year <= 10; year++) 
        {
            String beautify = "";
            amount = (int)((principal * Math.pow(100 + rate, year)) / Math.pow(100, year));
            
            int dollars = amount / 100;     //  All these lines are not needed.
            int cents = amount % 100;       //  They are here to make the final
            if((cents / 10) < 1){           //  output a bit more appealing. 
                if(cents != 0)              //  You can just ignore them completely
                    cents = cents + 10;     //  and redo the final print as follows:
                else                        //  System.out.printf("%4d%17d.%d%n", 
                    beautify = "0";         //  year, amount / 100, amount % 100);
            }                               //  You will save 9 lines of code this way. 
            System.out.printf("%4d%17d.%d%s%n", year, dollars, cents, beautify);
        }
    }
}
