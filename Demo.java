public class Demo{
  public static void main(String[] args){

    MyLinkedList Snake = new MyLinkedList();
    MyLinkedList Chain = new MyLinkedList();
    MyLinkedList Ropee = new MyLinkedList();
    MyLinkedList Nothin = new MyLinkedList();

    Snake.add(0, "Red Like Roses");
    Snake.add(1, "fills my head");
    Snake.add(2, "with dreams");
    Snake.add(3, "aaaaaaaand");
    Snake.add(4, "finds meee");
    Snake.extend(Nothin);
    System.out.println(Snake.toString());
    System.out.println(Nothin.toString());
    Nothin.extend(Ropee);
    System.out.println(Nothin.toString());
    System.out.println(Ropee.toString());

}
}
