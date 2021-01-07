public class Demo{
  public static void main(String[] args){
    Node alpha = new Node("first");
    Node beta = new Node("second");
    Node wild = new Node("IDk lol");

    MyLinkedList Snake = new MyLinkedList();

    Snake.add(0, "Once upon a time");
    Snake.add(1, "There lived an");
    Snake.add(2, "Ancient Wizard who");
    Snake.add(3, "Ate a cheeseburger");
    System.out.println(Snake.size());
    Snake.add(4, "He then went to");
    Snake.add(4, "at McWizardry Bell");
    Snake.add(0, "This story is an old one.");
    Snake.add(7, "the Wands R Us");
    Snake.add(8, "That was next door");
    System.out.println(Snake.size());
    Snake.add(9, "So he could");
    Snake.add(10, "purchase");
    Snake.add(11, "2 new wands");
    Snake.add(12, "one for himself");
    Snake.add(13, "and one for his");
    Snake.add(14, "niece's birthday next week.");
    System.out.println(Snake.size());
    System.out.println(Snake.toString());
    System.out.println();
    System.out.println(Snake.reverseString());
}
}
