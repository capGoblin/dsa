

import java.util.Arrays;

public class Stack { // Last In First Out (LIFO) or First In Last Out (FILO)
  // Loopkup
  // peek() -> O(1)
  // isEmpty() -> O(1)

  // Insert
  // push() -> O(1)

  // Delete
  // pop() -> O(1)

  private int[] items = new int[5];
  private int count;

  public void push(int item) {
    if (count == items.length)
      throw new StackOverflowError();

    items[count++] = item;
  }

  public int pop() {
    if (count == 0)
      throw new IllegalStateException();

    return items[--count];
  }

  public int peek() {
    if (count == 0)
      throw new IllegalStateException();

    return items[count - 1];
  }

  public boolean isEmpty() {
    return count == 0;
  }

  @Override
  public String toString() {
    var content = Arrays.copyOfRange(items, 0, count);
    return Arrays.toString(content);
  }
}
