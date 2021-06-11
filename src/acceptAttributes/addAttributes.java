package acceptAttributes;

import java.util.Scanner;

public class addAttributes {
  static Scanner sc = new Scanner(System.in);
  protected String name;
  protected String gender;
  protected int age;
  protected double salary;
  protected double height;
  protected boolean is_affluent;
  protected double spends;
  protected String city;
  protected double latitude;
  protected double longitude;

  public static void chooseAttribute() {
    System.out
        .println("1.Name\n2.Gender\n3.Age\n4.Salary\n5.height\n6.Affluence\n7.Expenditute\n8.City\n"
            + "9.Latitude\n10.Longitude");
    int choice = sc.nextInt();
    addAttributes obj = new addAttributes();
    switch (choice) {
      case 1:
        obj.addName();
        break;
      case 2:
        obj.addGender();
        break;
      case 3:
        obj.addAge();
        break;
      case 4:
        obj.addSalary();
        break;
      case 5:
        obj.addHeight();
        break;
      case 8:
        obj.addCity();
        break;
      case 6:
        obj.addAffluence();
        break;
      case 7:
        obj.addExpeses();
        break;
      case 9:
        obj.addLatitude();
        break;
      case 10:
        obj.addLongitude();
        break;
      default:
        System.out.println("No attribute added");
    }
  }

  public void addName() {
    // accepting name
    System.out.println("Enter the Name of the user");
    name = sc.next();
    sc.nextLine();
    addToMap.toMap("Name", name);
    setName(name);
  }

  public void addGender() {
    // accepting gender
    while (true) {
      System.out.println("Enter the Gender(Male/Female/Unknown):");
      gender = sc.next();
      sc.nextLine();
      if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")
          || gender.equalsIgnoreCase("unknown"))
        break;
      else
        System.out.println("Choose gender from options");
    }
    addToMap.toMap("Gender", gender);
  }

  public void addAge() {
    // accepting age
    boolean flag = false;
    while (true) {
      try {
        System.out.println("Enter the age");
        age = Integer.valueOf(sc.next());
        flag = true;
      } catch (Exception e) {
        flag = false;
        System.out.println("Age must be a number");
      } finally {
        if (flag) {
          if (age >= 1 && age <= 100)
            break;
          else
            System.out.println("Age must be between 1 and 100");
        }
      }
    }
    addToMap.toMap("Age", String.valueOf(age));
  }

  public void addSalary() {
    // accepting salary
    boolean flag = false;
    while (true) {
      try {
        System.out.println("Enter the salary");
        salary = Double.valueOf(sc.next());
        flag = true;
      } catch (Exception e) {
        System.out.println("Salary must be a number");
      } finally {
        if (flag)
          break;
      }
    }
    addToMap.toMap("Salary", String.valueOf(salary));
  }

  public void addHeight() {
    // accepting salary
    boolean flag = false;
    while (true) {
      try {
        System.out.println("Enter the height in centimeter");
        height = Double.valueOf(sc.next());
        flag = true;
      } catch (Exception e) {
        System.out.println("Height must be a number");
      } finally {
        if (flag)
          break;
      }
    }
    addToMap.toMap("Height", String.valueOf(height));
  }

  public void addAffluence() {
    System.out.println("The user affluent(true/false)");
    is_affluent = sc.hasNextBoolean();
    sc.nextLine();
    addToMap.toMap("Affluent", String.valueOf(is_affluent));
  }

  public void addCity() {
    // accepting city
    System.out.println("Enter the city");
    city = sc.next();
    sc.nextLine();
    addToMap.toMap("City", city);
  }

  public void addExpeses() {
    boolean flag = false;
    while (true) {
      try {
        System.out.println("Enter the amount spend");
        spends = Double.valueOf(sc.next());
        flag = true;
      } catch (Exception e) {
        System.out.println("Expense must be a number");
      } finally {
        if (flag)
          break;
      }
    }
    addToMap.toMap("Expense", String.valueOf(spends));
  }

  public void addLatitude() {
    boolean flag = false;
    while (true) {
      try {
        System.out.println("Enter the latitude of the city");
        latitude = Double.valueOf(sc.next());
        flag = true;
      } catch (Exception e) {
        System.out.println("Latitude must be a number");
      } finally {
        if (flag)
          break;
      }
    }
    addToMap.toMap("Latitude", String.valueOf(latitude));
  }

  public void addLongitude() {
    boolean flag = false;
    while (true) {
      try {
        System.out.println("Enter the longitude of the city");
        longitude = Double.valueOf(sc.next());
        flag = true;
      } catch (Exception e) {
        System.out.println("Longitude must be a number");
      } finally {
        if (flag)
          break;
      }
    }
    addToMap.toMap("Longitude", String.valueOf(longitude));
  }

  public String getName() {
    return name;
  }
  void setName(String name)
  {
    this.name=name;
  }
  public String getGender() {
    return gender;
  }
  void setGender(String gender)
  {
    this.gender=gender;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age=age;
  }
  public double getSalary() {
    return salary;
  }
  void setSalary(double salary) {
    this.salary=salary;
  }
  public double getHeight() {
    return height;
  }
  void setHeight(double height) {
    this.height=height;
  }
  public double getExpediture() {
    return spends;
  }
  void setExpenditure(double spends) {
    this.spends=spends;
  }
  public double getLatitude() {
    return latitude;
  }
  void setLatitude(double latitude) {
    this.latitude=latitude;
  }
  public double getLongitude() {
    return longitude;
  }
  void setLongitude(double Longitude) {
    this.longitude=longitude;
  }
  public boolean getAffulence() {
    return true;
  }
  public String getCity() {
    return city;
  }
  void setCity(String city) {
    this.city=city;
  }
}
