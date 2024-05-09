

import java.util.Arrays;

public class ArrayQueue { // First In First Out (FIFO) or Last In Last Out (LILO)
  // Loopkup
  // peek() -> O(1)
  // isEmpty() -> O(1)
  // isFull() -> O(1)

  // Insert
  // enqueue() -> O(1)

  // Delete
  // dequeue() -> O(1)
  
  private int[] items;
  private int rear;
  private int front;
  private int count;

  public ArrayQueue(int capacity) {
    items = new int[capacity];
  }

  public void enqueue(int item) { // add item to back of queue
    if (isFull())
      throw new IllegalStateException();

    items[rear] = item;
    rear = (rear + 1) % items.length;
    count++;
  }

  public int dequeue() { // remove item from front of queue
    if (isEmpty())
      throw new IllegalStateException();

    var item = items[front];
    items[front] = 0;
    front = (front + 1) % items.length;
    count--;

    return item;
  }

  public int peek() { // returns items at front
    if (isEmpty())
      throw new IllegalStateException();

    return items[front];
  }

  public boolean isEmpty() {
    return count == 0;
  }

  public boolean isFull() {
    return count == items.length;
  }

  @Override
  public String toString() {
    return Arrays.toString(items);
  }
}
