import java.util.*;
public class NewAccount extends Main {
  public void newAccount(){
    Scanner input = new Scanner(System.in);
    System.out.println("What would you like to be the name of the account? ");
    String accountName = input.nextLine();
    while(true){
      System.out.println("What would you like to be the 4 digit pin of the account? ");
      int accountPin = Integer.parseInt(input.nextLine());
      if(accountPin > 9999){
        System.out.println("Too large of a pin, it must be 4 digit");
      }
      else if(accountPin < 1000){
        System.out.println("Too small of a pin, it must be 4 digit");
      }
      else{
        addAccount(accountName, accountPin);
        System.out.println(accountList);
        break;
      }
    }
  }
}