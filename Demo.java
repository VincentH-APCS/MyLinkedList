public class Demo{
  public static void main(String[] args){

    MyLinkedList Snake = new MyLinkedList();
    MyLinkedList Chain = new MyLinkedList();
    MyLinkedList Ropee = new MyLinkedList();

    Snake.add(0, "I summon");
    Snake.add(1, "the one");
    Snake.add(2, "the mighty");
    Snake.add(3, "Supreme King Dragon");
    Snake.add(4, "Starving Venom");
    //System.out.println(Snake.toString());
    Chain.add(0, "You fell");
    Chain.add(1, "for my");
    Chain.add(2, "Trap Card");
    Chain.add(3, "Bottomless Trap Hole");
    Chain.add(4, "Starving Venom is banished!");
    System.out.println(Chain.toString());
    Ropee.add(0, "You fell");
    Ropee.add(1, "For MY Trap");
    Ropee.add(2, "Counter Trap:");
    Ropee.add(3, "Solemn Judgement");
    Ropee.add(4, "Bottomless is negated");
    System.out.println(Ropee.toString());
    Snake.extend(Chain);
    System.out.println(Snake.toString());
    System.out.println(Snake.size());
    System.out.println(Chain.toString());
    System.out.println(Chain.size());
    System.out.println(Ropee.toString());
    Snake.extend(Ropee);
    System.out.println(Ropee.toString());
    System.out.println(Ropee.size());
    System.out.println(Snake.toString());
    System.out.println(Snake.toStringReversed());
    System.out.println(Snake.size());
    /*System.out.println(Snake.get(0));
    System.out.println(Snake.get(1));
    System.out.println(Snake.get(2));
    System.out.println(Snake.get(3));
    System.out.println(Snake.get(4));
    System.out.println(Snake.get(5));
    System.out.println(Snake.get(6));
    System.out.println(Snake.get(7));
    System.out.println(Snake.get(8));
    System.out.println(Snake.get(9));
    System.out.println(Snake.get(10));
    System.out.println(Snake.get(11));
    System.out.println(Snake.get(12));
    System.out.println(Snake.get(13));
    System.out.println(Snake.get(14));
    System.out.println(Snake.get(15));
    This was typed out to debug an error that happened*/

}
}
