package acceptAttributes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import gatingConditions.*;

public class Main {
  Map<String, String> map = new HashMap<String, String>();
  static int options;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main obj = new Main();
    System.out.println("Enter 1 to see existing attributes");
    System.out.println("Enter 2 to update or add attributes");
    options= sc.nextInt();
    if (options == 1)
      obj.option1();
    else 
      obj.option2();
    while (true) {
      System.out.println("Enter 1 to see existing attributes");
      System.out.println("Enter 2 to update or add attributes");
      System.out.println("Enter 3 to check user eligibilty for features");
      System.out.println("Enter 0 to quit");
      options=sc.nextInt();
      if (options == 1)
        obj.option1();
      else if(options== 2)
        obj.option2();
      else if(options==3)
        obj.option3();
      else
        break;
    }

  }

  public void option1() {
    if (addToMap.userAttributes.size() == 0) {
      System.out.println("No attributes have been added yet");
      System.out.println("Add attributes from below options:");
      addAttributes.chooseAttribute();
    } else {
      Set<String> keys = (addToMap.userAttributes).keySet();
      for (String attribute : keys) {
        System.out.println(attribute + ": " + (addToMap.userAttributes).get(attribute));
      }
    }
  }

  public void option2() {
    System.out.println("Add attributes from below options:");
    addAttributes.chooseAttribute();
  }

  public void option3() {
    Main obj=new Main();
    AddNewConditions.conditions();
  }

}
