import java.util.*;
public class Example {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("A");
    list.add("B");
    list.add("A");
    System.out.println(list.get(0));
    for (String s : list) {
      System.out.println(s);
    }
  }
}