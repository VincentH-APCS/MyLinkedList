public class MyLinkedList{
  private int size;
  private Node start, end;

  public MyLinkedList(){
    size = 0;
    start = null;
    end = null;
  }

  public int size(){
    return size;
  }

  public boolean add(String value){
    Node newone = new Node(value);
    if (size == 0){
      start = newone;
      end = newone;
    }
    else if (size == 1){
      start.setNext(newone);
      end = newone;
    }
    else {
    Node oldend = end;
    end = newone;
    newone.setPrev(oldend);
   }
    size = size + 1;
    return true;
   }

}
