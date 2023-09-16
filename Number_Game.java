/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package internship;

import java.util.Random;
import javax.swing.JOptionPane;

public class Number_Game
{
      public static void main(String[] args)
    {
         Random random = new Random();
         int random_num = random.nextInt(101);
         int attempts = 3;
         String userInputString;
         int userGuess;
         boolean play=false;
         
         while(attempts != 0)
        {            
          userInputString =JOptionPane.showInputDialog("Guess the Number between 1 to 100:");
          userGuess = Integer.parseInt(userInputString);
          
          if(userGuess == random_num)
          {
              JOptionPane.showMessageDialog(null,"Congratulations! You Win The Game");
              break;
          }
          else if(userGuess > random_num)
          {
              JOptionPane.showMessageDialog(null, "You guess too High..! Guess again");
          }
          else
          {
              JOptionPane.showMessageDialog(null, "You guess too Low..! Guess again");
          }
           JOptionPane.showMessageDialog(null, "You have only " +(attempts-1)+ " attempt..");
           attempts--;
        }
          System.exit(0);
    }       
}
