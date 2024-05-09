import java.awt.Window.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
class Main {
  public static void main(String[] args) {
    HashTable table = new HashTable();

    table.put(6, "A");
    table.put(8, "B");
    table.put(11, "C");
    System.out.println(table.get(6));
  }

}
    // CharFinder finder = new CharFinder();
    // var ch = finder.findFirstRepeatedChar("ereb");
    // System.out.println(ch);

    // Set<Integer> s = new HashSet<>();
    // int[] num = { 1, 3, 4, 5, 5, 5, 2, 3, 4, 4, 4, 4, 4};
    // for( var n: num)
    //   s.add(n);  
    // System.out.println(s); 


    // CharFinder finder = new CharFinder();
    // var ch = finder.findFirstNonRepeatingChar("wbvrfvwwrvwr  wrw rf");
    // System.out.println(ch);

    // Map<Integer, String> map = new HashMap<>();
    // map.get(1, "vaewb ");
    // map.get(2, "asf");
    // map.get(3, "vae");
    // map.containsKey(3); // O(1)
    // map.containsValue("mask"); // O(n)
    // for( var i: map.entrySet()) // or KeySet()
    //   System.out.println(i);
    
    // PriorityQueue q = new PriorityQueue(5);
    // q.add(5);
    // q.add(3);
    // q.add(7);
    // q.add(1);
    // q.add(4);
    // q.add(10);
    
    // System.out.println(q);

    // while(!q.isEmpty())
    //   System.out.println(q.remove());

    // PriorityQueue<Integer> q = new PriorityQueue<>();
    // q.add(5);
    // q.add(2);
    // q.add(3);
    // q.add(4);
    // while(!q.isEmpty())
    //   System.out.println(q.remove());

    // QueueWithTwoStacks q = new QueueWithTwoStacks();
    // q.enqueue(10);
    // q.enqueue(20);
    // q.enqueue(30);
    // var first = q.dequeue();
    // System.out.println(first);
    // ArrayQueue q = new ArrayQueue(5);
    // q.enqueue(10);
    // q.enqueue(20);
    // q.enqueue(30);
    // q.enqueue(40);
    // q.dequeue();
    // q.enqueue(50);
    // q.dequeue();
    // q.enqueue(60);
    // q.enqueue(70);
    
    // System.out.println(q);
  // public static void reverseQueue(Queue<Integer> q) {
  //   Stack<Integer> s = new Stack<>();
  //   while(!q.isEmpty()) {
  //     s.push(q.remove());
  //   }
    
  //   while(!s.isEmpty()) {
  //       q.add(s.pop());
  //   }

    
  // } 



    // Queue<Integer> q = new ArrayDeque<>();
    // q.add(10);
    // q.remove();
    // System.out.println(q);


    // Stack s = new Stack();
    // s.push(10);
    // s.push(20);
    // s.push(30); 
    // System.out.println(s.isEmpty());
    // String str = "( + 21)";
    
    // Expression exp = new Expression();
    // System.out.println(exp.isBalanced(str));
 
    // String str = "string";
    // StringReverser reverser = new StringReverser();
    // System.out.println(reverser.reverse(str));

    
    // var list = new LinkedList();
    // list.addLast(10);
    // list.addLast(20);
    // list.addLast(30);
    // System.out.println(list.getKthFromTheEnd(2 ));
    // list.reverse();
    // var array = list.toArray();
    // System.out.println(Arrays.toString(array));









    // LinkedList l = new LinkedList();
    // l.addLast(10);
    // l.addLast(20);
    // l.addLast(30);
    // System.out.println(l.size());

    // var a = l.toArray();
    // System.out.println(Arrays.toString(a));


    // Array num = new Array(3);
    // num.insert(10);
    // num.insert(30);
    // num.insert(20);
    // num.insert(40);

    // System.out.println(num.indexOf(100));
    // num.print();


    // ArrayList<Integer> l = new ArrayList<>();

    // l.add(1);
    // l.add(10);
    // l.add(100);
    // l.remove(2);
    // l.toArray();
    // System.out.println(Type(l));