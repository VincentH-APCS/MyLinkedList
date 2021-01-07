public class Node{
  public Node(String value){
    data = value;
    next = null;
    prev = null;
  }
  private String data;
  private Node next,prev;

  public String getData(){
    return data;
  }
  public String setData(String value){
    String old = data;
    data = value;
    return old;
  }
  public Node getNext(){
    return next;
  }
  public Node setNext(Node nexter){
    Node old = next;
    next = nexter;
    return old;
  }
  public Node getPrev(){
    return prev;
  }
  public Node setPrev(Node laster){
    Node old = prev;
    prev = laster;
    return old;
  }

}
