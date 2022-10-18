import java.util.*;
public class ChangePin extends Main {
  public void changePin(int index){
    Scanner input = new Scanner(System.in);
    System.out.println("What would you like to change your pin to? ");
    int response = Integer.parseInt(input.nextLine());

    System.out.println("Your new pin will be " + response + ". Is that correct?");
    String cheese = input.nextLine();

    if(cheese.equalsIgnoreCase("yes")){
      System.out.println("Your pin is now set to " + response);
      editPin(response, index);
    }
    else{
      System.out.println("Your pin will not be changed");
    }
  }
}