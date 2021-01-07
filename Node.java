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
  public String setNext(String value){
    String old = data;
    next = value;
    return old;
  }
  public Node getPrev(){
    return prev;
  }
  public String setPrev(String value){
    String old = prev;
    prev = value;
    return old;
  }

}
