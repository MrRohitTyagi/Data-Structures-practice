import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner (System.in);
    String str = scn.nextLine();
    System.out.println(check(str));
  }

  public static boolean check (String str) {
    Stack<Character>st = new Stack<>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == '(' || ch == '{' || ch == '[') st.push(ch);
      else if ((st.size() == 0 &&  (ch == ')' || ch == '}' || ch == ']')) || ch == ')' && st.peek() != '(' || ch == '}' && st.peek() != '{' || ch == ']' && st.peek() != '[') {
        return false;
      }
      else if (ch == ')' || ch == '}' || ch == ']') st.pop();
    }
    return st.size() == 0;
  }
}