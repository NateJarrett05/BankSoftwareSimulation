import java.util.*;
public class Main {
  List<String> accountList;
  private List<Double> checkingValues;
  private List<Double> savingsValues;
  private List<Integer> accountPins;
  String[] accountTypes = {"Savings Account", "Checking Account"};
  double checkingBalance;
  double savingsBalance;

  public Main(){
    accountList = new ArrayList<String>(List.of("Nate Jarrett", "Grant Palmer", "Mr Jaffe", "Jacob Mandel"));
    checkingValues = new ArrayList<Double>(List.of(10.12, 800.52, 1.2, 20.0));
    savingsValues = new ArrayList<Double>(List.of(123.2, 2312.5, 9.1, 10.6));
    accountPins = new ArrayList<Integer>(List.of(1234, 4321, 3214, 1818));
  }

  public int findAccount(String accountName, int pin){
    System.out.println(accountList);
    int index = accountList.indexOf(accountName);
    if(index > -1){
      if(pin == accountPins.get(index)){
        return index;
      }
      else{
        System.out.println("Invalid Pin");
        return -1;
      }
    }
    System.out.println("No account found");
    return -1;
  }

  public void editPin(int newPin, int index){
    accountPins.set(index, newPin);
  }

  public void addAccount(String accountName, int accountPin){
    accountPins.add(accountPin);
    accountList.add(accountName);
    savingsValues.add(0.0);
    checkingValues.add(0.0);
  }


  public double[] getValue(int index){
    checkingBalance = checkingValues.get(index);
    savingsBalance = savingsValues.get(index);
    double[] bal = {checkingBalance, savingsBalance};
    return bal;
  }

  public void changeValue(double[] balance, int index){
    checkingValues.set(index, balance[0]);
    savingsValues.set(index, balance[1]);
  }
  
  public static void main(String[] args) {
    RunSoftware s = new RunSoftware();
    s.runSoftware();
  }
}