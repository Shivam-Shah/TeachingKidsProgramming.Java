package org.teachingkidsprogramming.recipes.finalExam;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ExamTriangleShellFour
{
  private static int length;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int shellSize = MessageBox.askForNumericalInput("give me a random number");
    if (shellSize <= 210)
      ;
    {
      MessageBox.askForTextInput("the shell size is to small and you need to enter an updated size of the shell.");
    }
    for (int i = 1; i <= shellSize; i++)
    {
    }
    Tortoise.setPenColor(Colors.Purples.Purple);
    int largelength = 230;
    largelength = shellSize / 100;
    shellSize = largelength + length;
    if (largelength <= 0)
    {
      MessageBox
          .askForNumericalInput("set the value of the length and add 7 otherwise call the drawTriangle methord");
    }
    //      Set the value of the length to the length plus 7
    //         Otherwise, Call the drawTriangle method (recipe below)      
    //          Set the value of the number of rotations to 12
    //          Turn the tortoise 360 times the number of rotations, then divide that by the size of the shell
    Tortoise.turn(360 / shellSize);
    //    Repeat 
    //------------- Recipe for drawTriangle
    //      Do the following 3 times 
    for (int i = 1; i <= 3; i++);
    {
    }
    //          Move the tortoise the current length
    Tortoise.move(210);
    //          Turn the tortoise 1/3 of 360 degrees
    Tortoise.turn(360 / 3);
    //    Repeat 
    //------------- End of drawTriangle recipe
  }
}
