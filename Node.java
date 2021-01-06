public class Node{
  public Node(String value){
    data = value;
    next = null;
    prev = null;
  }
  private String data;
  private Node next,prev;

  public String get(){
    return data;
  }
  public String set(String value){
    String old = data;
    data = value;
    return old;
  }
}
