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
    this.next = nexter;
    if(nexter.getPrev() != this){
    nexter.setPrev(this);}
    return old;
  }
  public Node getPrev(){
    return prev;
  }
  public Node setPrev(Node laster){
    Node old = prev;
    this.prev = laster;
    if(laster.getNext() != this){
    laster.setNext(this);}
    return old;
  }

}
