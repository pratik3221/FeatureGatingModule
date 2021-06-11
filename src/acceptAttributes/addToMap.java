package acceptAttributes;

import java.util.HashMap;
import java.util.Map;

public class addToMap {
  public static Map<String, String> userAttributes=new HashMap<String, String>();
    public static void toMap(String Attribute,String Value)
    {
      //Enter Attribute and value in map if not present
      if(!userAttributes.containsKey(Attribute))
        userAttributes.put(Attribute,Value);
      //if already present, update value
      else
        userAttributes.replace(Attribute,Value);
    }
}
