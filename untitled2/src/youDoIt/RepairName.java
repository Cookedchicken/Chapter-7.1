package youDoIt;

import java.util.Scanner;

public class RepairName {

    public static void main(String[]args){
        String name;
        String saveOrgianlname;
        int stringLength;
        char c;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name >>>");
        name = input.nextLine();

        for(int i = 0; i < name.length(); i++)
        {
         c = name.charAt(i);
         if(i==0)
         {
          c = Character.toUpperCase(c);
          name = c + name.substring(1, stringLength);
         }
         else
             if(name.charAt(i) == ' ')
             {
                ++i;
                c = name.charAt(i);
                c = Character.toUpperCase(c);
                name = name.substring(0, i) + c +
                        name.substring(i + 1, stringLength);
             }
        }
    }
}
