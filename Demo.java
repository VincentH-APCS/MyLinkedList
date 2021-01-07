public class Demo{
  public static void main(String[] args){
    Node alpha = new Node("first");
    Node beta = new Node("second");
    Node wild = new Node("IDk lol");

  //  System.out.println(alpha.getData());
  //  System.out.println(beta.getData());
  //  System.out.println(wild.getData());
  //  System.out.println(wild.setData("change!"));
  //  System.out.println(wild.getData());
    System.out.println(alpha.setNext(beta));
    System.out.println(alpha.setPrev(wild));
    System.out.println(wild.getPrev());
    System.out.println(wild.getNext());
    System.out.println(alpha.getPrev());
    System.out.println(alpha.getNext());
    System.out.println(beta.getPrev());
    System.out.println(beta.getNext());
  }

}
