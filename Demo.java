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
    Chain.add(0, "This bedtime story ends with misery ever after");
    //Chain.add(1, "after");
    Ropee.add(0, "The pages are torn");
    Ropee.add(1, "And there's no final chapter");

    Snake.extend(Nothin);
    System.out.println("Snake" + Snake.toString());
    System.out.println("Chain" + Chain.toString());
    System.out.println("Ropee" + Ropee.toString());
    System.out.println("Nothin" + Nothin.toString());
    System.out.println();
    Chain.extend(Nothin);
    System.out.println("Chain" + Chain.toString());
    System.out.println("Nothin" + Nothin.toString());
    System.out.println();
    Nothin.extend(Chain);
    System.out.println("Chain" + Chain.toString());
    System.out.println("Nothin" + Nothin.toString());
    Chain.extend(Nothin);
    System.out.println("Chain" + Chain.toString());
    System.out.println("Nothin" + Nothin.toString());
    System.out.println();
    Nothin.extend(Chain);
    System.out.println("Chain" + Chain.toString());
    System.out.println("Nothin" + Nothin.toString());
    System.out.println();
    Chain.extend(Ropee);
    Ropee.extend(Nothin);
    System.out.println("Snake" + Snake.toString());
    System.out.println("Chain" + Chain.toString());
    System.out.println("Ropee" + Ropee.toString());
    System.out.println("Nothin" + Nothin.toString());
    Ropee.extend(Chain);
    Ropee.extend(Chain);
    System.out.println();
    System.out.println("Snake" + Snake.toString());
    System.out.println("Chain" + Chain.toString());
    System.out.println("Ropee" + Ropee.toString());
    System.out.println("Nothin" + Nothin.toString());
    Nothin.extend(Ropee);
    Chain.extend(Ropee);
    System.out.println();
    System.out.println("Snake" + Snake.toString());
    System.out.println("Chain" + Chain.toString());
    System.out.println("Ropee" + Ropee.toString());
    System.out.println("Nothin" + Nothin.toString());
    Snake.extend(Ropee);
    Snake.extend(Nothin);
    Nothin.extend(Chain);
    System.out.println("Snake" + Snake.toString());
    System.out.println("Chain" + Chain.toString());
    System.out.println("Ropee" + Ropee.toString());
    System.out.println("Nothin" + Nothin.toString());
}
}
