public class Demo{
  public static void main(String[] args){
    Node alpha = new Node("first");
    Node beta = new Node("second");
    Node wild = new Node("IDk lol");

    MyLinkedList Snake = new MyLinkedList();

    System.out.println(Snake.size());
    System.out.print(Snake.add("alpha  "));
    System.out.print(Snake.add("beta  "));
    System.out.print(Snake.size());
    System.out.println(Snake.add("Omega!  "));
    System.out.print(Snake.get(0) + "  ");
    System.out.print(Snake.get(1) + "  ");
    System.out.print(Snake.get(2) + "   ");
    //System.out.println(Snake.get(3));
    Snake.add(2, "Whoa There Buddy!  ");
    System.out.println();
    System.out.print(Snake.size());
    System.out.print(Snake.get(0));
    System.out.print(Snake.get(1));
    System.out.print(Snake.get(2));
    System.out.print(Snake.get(3));
  System.out.println();
    Snake.add(0, "I want to lead   ");
    System.out.print(Snake.get(0));
    System.out.print(Snake.get(1));
    System.out.println(Snake.get(2));
    System.out.print(Snake.set(0, "Breaking News!  "));
    System.out.print(Snake.set(1, "The List has changed  "));
    System.out.print(Snake.set(2, "HAhahahahaha  "));
    System.out.print(Snake.set(3, "Yeah....  "));
    System.out.println(Snake.set(4, "pls work!"));
    System.out.print(Snake.get(0));
    System.out.print(Snake.get(1));
    System.out.print(Snake.get(2));
    System.out.print(Snake.get(3));
    System.out.println(Snake.get(4));
    System.out.print(Snake.set(5, "This should crash!"));
  }

}
