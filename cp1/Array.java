

public class Array {
  // Lookup
  // By value -> O(n)
  // By index -> O(1)

  // Insert
  // At the Beginning -> O(n) -> have to shift all the items to right by one index
  // At the End -> O(n)  -> if array is full (worst case, in java's static array), copy paste all the items to new array
  // At the Middle -> O(n) -> have to shift all the items to right by one index

  // Delete
  // From the Beginning -> O(n) -> have to shift all the items to left by one index, after deletion
  // From the End -> O(1)
  // From the Middle -> O(n) -> have to shift all the items to left by one index, after deletion
  
  private int[] items;
  private int count;

  public Array(int length) {
    items = new int[length];
  }

  public void insert(int item) {
    resizeIfRequired();

    items[count++] = item;
  }

  public void insertAt(int item, int index) {
    if (index < 0 || index > count)
      throw new IllegalArgumentException();

    // Note that I've extracted the logic for
    // resizing the array into this private
    // method so we can reuse in insert() and
    // insertAt() methods.
    //
    // This also made our code cleaner and
    // more readable.
    resizeIfRequired();

    for (int i = count - 1; i >= index; i--)
      items[i + 1] = items[i];

    items[index] = item;
    count++;
  }

  private void resizeIfRequired() {
    if (items.length == count) {
      int[] newItems = new int[count * 2];

      for (int i = 0; i < count; i++)
        newItems[i] = items[i];

      items = newItems;
    }
  }

  public void reverse() {
    int[] newItems = new int[count];

    for (int i = 0; i < count; i++)
      newItems[i] = items[count - i - 1];

    items = newItems;
  }

  public int max() {
    // O(n): Because we have to iterate over
    // the entire array to find the largest
    // number. This number may be at the end
    // of the array (worst case scenario).
    int max = 0;
    for (int item : items)
      if (item > max)
        max = item;

    return max;
  }

  public Array intersect(Array other) {
    var intersection = new Array(count);

    for (int item : items)
      if (other.indexOf(item) >= 0)
        intersection.insert(item);

    return intersection;
  }

  public void removeAt(int index) {
    if (index < 0 || index >= count)
      throw new IllegalArgumentException();

    for (int i = index; i < count; i++)
      items[i] = items[i + 1];

    count--;
  }

  public int indexOf(int item) {
    for (int i = 0; i < count; i++)
      if (items[i] == item)
        return i;

    return -1;
  }

  public void print() {
    for (int i = 0; i < count; i++)
      System.out.println(items[i]);
  }
}
