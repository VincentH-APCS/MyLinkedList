public class Demo{
  public static void main(String[] args){
    Node alpha = new Node("first");
    Node beta = new Node("second");
    Node wild = new Node("IDk lol");

    MyLinkedList Snake = new MyLinkedList();

    System.out.println(Snake.size());
    System.out.println(Snake.add("alpha"));
    System.out.println(Snake.add("beta"));
    System.out.println(Snake.size());
    System.out.println(Snake.add("Omega!"));
    System.out.print(Snake.get(0) + "  ");
    System.out.print(Snake.get(1) + "  ");
    System.out.print(Snake.get(2) + "   ");
    //System.out.println(Snake.get(3));
    Snake.add(2, "Whoa There Buddy!");
    System.out.println(Snake.size());
    System.out.print(Snake.get(0) + "  ");
    System.out.print(Snake.get(1) + "  ");
    System.out.print(Snake.get(2) + "  ");
    System.out.println(Snake.get(3) + "  ");
  //  System.out.println(Snake.get(-3));
    Snake.add(0, "I want to lead   ");
    System.out.println(Snake.get(0));
    System.out.println(Snake.get(1));
    System.out.println(Snake.get(2));
  }

}
