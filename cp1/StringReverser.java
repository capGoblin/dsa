

import java.util.Stack;

public class StringReverser {
  public String reverse(String input) {
    if (input == null)
      throw new IllegalArgumentException();

    Stack<Character> stack = new Stack<>();

    for (char ch : input.toCharArray())
      stack.push(ch);

    // for (int i = 0; i < input.length(); i++) {
    //   s.push(input.charAt(i));  
    // }

    StringBuffer reversed = new StringBuffer();  // if lot of string operations are done(new memory is created)
    while (!stack.empty())
      reversed.append(stack.pop());

    return reversed.toString();
  }
}
