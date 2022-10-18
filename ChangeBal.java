import java.util.*;
public class ChangeBal extends Main{
  String response;
  double change; 
  int account;
  
  public void accessAccount(int index){
    ChangePin cp = new ChangePin();
    Scanner input = new Scanner(System.in);
    
    System.out.println("Would you like to visit your checking, savings account, see your balance, or change your pin?");
    response = input.nextLine();

    if(response.equalsIgnoreCase("checking")){
      depositWithdrawl(0, index);
    }
    else if(response.equalsIgnoreCase("savings")){
      depositWithdrawl(1, index);
    }
    else if(response.equalsIgnoreCase("balance")){
      printBal(index);
    }
    else if(response.equalsIgnoreCase("pin")){
      cp.changePin(index);
    }
  }

  public void depositWithdrawl(int account, int index){
    printBal(index);
    double[] balance = getValue(index);

    Scanner input = new Scanner(System.in);
    System.out.println("Would you like to deposit or withdrawl");
    response = input.nextLine();

    //Deposit
    if(response.equalsIgnoreCase("deposit")){
      System.out.println("How much would you like to deposit? ");
      change = input.nextDouble();
      if(change > -1){
        balance[account] += change;
        changeValue(balance, index);

        System.out.println("New Balance: ");
        printBal(index);

      }
      else{
        System.out.println("QUALITY INSURANCE");
      }
    }

    //Withdrawl
    else if(response.equalsIgnoreCase("withdrawl")){
      System.out.println("How much would you like to deposit? ");
      change = input.nextDouble();
      if(change < balance[account]){
        balance[account] -= change;
        changeValue(balance, index);

        System.out.println("New Balance: ");
        printBal(index);
      }
      else{
        System.out.println("QUALITY INSURANCE");
      }
    }
  }

  public void printBal(int index){
    System.out.println("Checking Account: Savings Account: ");
    System.out.println(Arrays.toString(getValue(index)));
  }
}