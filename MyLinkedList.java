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

   public void add(int index, String value){
     if(index < 0 || index >= size){
       throw new IndexOutOfBoundsException("Index" +index+
       "cannot be negative nor equal to nor greater than the size");
     }
      Node current = Start;
      Node adder = new Node(value);
      size = size + 1;
      for(int i = 0; i < size; i++){
        if(i == index){
          Node save = current;
          adder.setNext(current);
          adder.setPrev(save.getPrev());
          i = size;
        }
        else current = current.next();
      }
      }

}
