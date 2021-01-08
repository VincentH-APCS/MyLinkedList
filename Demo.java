public class Demo{
  public static void main(String[] args){

    MyLinkedList Snake = new MyLinkedList();

    Snake.add(0, "Hello");
    //System.out.println(Snake.remove(0));
    Snake.add(1, "Bonjour");
    Snake.add(2, "Gutentag");
    Snake.add(3, "Konichiwa");
    Snake.add(4, "Goodbye");
    Snake.add(5, "Hola");
    Snake.add(6, "This shouldn't be here");
    System.out.println(Snake.size());
    System.out.println(Snake.toString());
    System.out.println(Snake.toStringReversed());
    System.out.println();
    System.out.println(Snake.remove(4));
    System.out.println(Snake.toString());
    System.out.println(Snake.remove(5));
    System.out.println(Snake.size());
    System.out.println(Snake.toString());
    System.out.println(Snake.toStringReversed());
    System.out.println(Snake.remove(0));
    System.out.println();
    System.out.println(Snake.size());
    System.out.println(Snake.toString());
    System.out.println(Snake.toStringReversed());

}
}
