package gatingConditions;

import java.util.ArrayList;
import acceptAttributes.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import operators.*;
import calculations.*;

public class AddNewConditions {
  static Scanner sc = new Scanner(System.in);
  static String feature;
  //static List<String> conditionList = new ArrayList<String>();
  static Map<String, String> featureAndCondition = new HashMap<String,String>();
  static StringBuilder newCondition = new StringBuilder();
  static //private static Set<LogicalOperator> operators;
  //private static HashMap<String, LogicalOperator> symbolOperatorMap;
  addAttributes obj=new addAttributes();
  
  public static void conditions() {
    defaultConditions();
    System.out.println("Enter 1 to check user eligiblity for present features");
    System.out.println("Enter 2 to add new features and condtions for eligiblity");
    int choose = sc.nextInt();
    switch (choose) {
      case 1:
        checkEligibilty();
        break;
      case 2:
        addFeatureAndCondition();
        break;
      default:
        checkEligibilty();
    }
  }

  public static void defaultConditions() {
   featureAndCondition.put("Special Access", "salary > 2000 and age < 18");
   featureAndCondition.put("Same Day Delivery", "spends > 15000 and age > 50");
   featureAndCondition.put("Return", "(city == Mumbai or city == Banglore) and (gender == male)");
  }

  public static void addFeatureAndCondition() {
    System.out.println("Add feature name");
    feature = sc.next();
    sc.nextLine();
    System.out.println("Add condition for eligiblity");
    System.out.println("Enter 0 after last condition");
    String condition = "";
    while (!condition.equals("0")) {
      condition = sc.next();
      sc.nextLine();
      if (condition.equals("0"))
        break;
      else {
        //conditionList.add(condition);
        newCondition.append(" ").append(condition);
      }
    }
    featureAndCondition.put(feature, newCondition.toString());
  } 

  public static void checkEligibilty() {
    Context context = new Context(obj);
    Set<String> keys= featureAndCondition.keySet();
    for(String key: keys) {
      String infix=featureAndCondition.get(key);
      String postfix=Calculator.getInstance().infixToPostfix(infix);
      System.out.println(infix);
      System.out.println(postfix);
        
        try {
          System.out.println(Calculator.getInstance().evaluateInfix(infix,context));
        } catch (Exception e) {
      
          e.printStackTrace();
        }
    //System.out.println(result);
      
   }
  } 
}
