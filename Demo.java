public class Demo{
  public static void main(String[] args){
    Node alpha = new Node("first");
    Node beta = new Node("second");
    Node wild = new Node("IDk lol");

    MyLinkedList Snake = new MyLinkedList();

    System.out.println(Snake.add("alpha"));
    System.out.println(Snake.add("beta"));
    System.out.println(Snake.add("wild"));
    System.out.println(Snake.size());
  }

}
