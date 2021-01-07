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
      Node current = start;
      size = size + 1;
      Node adder = new Node(value);
      if(index == 0){
        Node oldstart = start;
        start = adder;
        start.setNext(oldstart);
      }
      else
      for(int i = 0; i < size; i++){
        if(i == index - 1){
          adder.setNext(current.getNext());
          adder.setPrev(current);
          i = size;
        }
        else current = current.getNext();
      }
      }

    public String get(int index){
      if(index < 0 || index >= size){
        throw new IndexOutOfBoundsException("Index" +index+
        "cannot be negative nor equal to nor greater than the size");
      }
      Node current = start;
      for(int i = 0; i < size; i++){
        if(i == index){
          return current.getData();
        }
        else current = current.getNext();
      }
      return "This shouldn't be read";
    }

    public String set(int index, String value){
      if(index < 0 || index >= size){
        throw new IndexOutOfBoundsException("Index" +index+
        "cannot be negative nor equal to nor greater than the size");
      }
      Node current = start;
      String garb = "";
      for(int i = 0; i < size; i++){
        if(i == index){
          garb = current.getData();
          current.setData(value);
          i = size;
        }
        else current = current.getNext();
      }
      return garb;
    }
    
}
