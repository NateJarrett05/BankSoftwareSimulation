import java.util.*;
public class RunSoftware extends Main{
  String answer;
  int choice;

  public void runSoftware(){
    ChangeBal cb = new ChangeBal();
    NewAccount na = new NewAccount();

    Scanner uI = new Scanner(System.in);
    while(true){
      System.out.println("Would you like to access your account or create a new account? \n1. Access your account \n2. New Account");
      choice = Integer.parseInt(uI.nextLine());
      if(choice == 1){
        System.out.println("Please enter the name on your account");
        answer = uI.nextLine();

        System.out.println("Please enter the pin for your account");
        choice = Integer.parseInt(uI.nextLine());

        int account = findAccount(answer, choice);

        if(account != -1){
          while(true){
            cb.accessAccount(account);

            System.out.println("Anything else? ");
            answer = uI.nextLine();

            if(answer.equalsIgnoreCase("no")){
              break;
            }
          }
        }
        else{
          System.out.println("Anything else? ");
          answer = uI.nextLine();

          if(answer.equalsIgnoreCase("no")){
            break;
          }
        }
      }
      else if(choice == 2){
        na.newAccount();
        System.out.println(accountList);
      }
    }
  }
}