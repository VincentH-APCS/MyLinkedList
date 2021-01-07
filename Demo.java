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
    System.out.println(alpha.setPrevious(wild));
  
  }

}
