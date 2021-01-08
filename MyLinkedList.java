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
     if(index < 0 || index > size){
       throw new IndexOutOfBoundsException("Index" +index+
       "cannot be negative  nor greater than the size");
     }
      size = size + 1;
      Node adder = new Node(value);
      if (size == 1){
        start = adder;
        end = adder;
      }
      Node current = start;
      if(index == 0){
        Node oldstart = start;
        start = adder;
        start.setNext(oldstart);
      }
      else if(index == size - 1){
        Node oldend = end;
        end = adder;
        end.setPrev(oldend);
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

    public String toString(){
    Node current = start;
    int fin = 0;
    String omni = "[";
    while(fin < size ){
      omni = omni + current.getData();
      if(current.getNext() != null){
        omni = omni + ", ";
      }
      current = current.getNext();
      fin = fin + 1;
    }
    return omni + "]";
  }

  public String toStringReversed(){
    Node current = end;
    int fin = 0;
    String delta = "[";
    while(fin < size){
      delta = delta + current.getData();
      if(current.getPrev() != null){
        delta = delta + ", ";
      }
      current = current.getPrev();
      fin = fin + 1;
    }
    return delta + "]";
  }

  public String remove(int index){
    if(index < 0 || index >= size){
      throw new IndexOutOfBoundsException("Index" +index+
      "cannot be negative nor equal to nor greater than the size");
    }
    Node last = new Node();
    Node after = new Node();
    Node current = start;
    int place = 0;
    if(size == 1){
      String output = start.getData();
      start = null;
      end = null;
      return output;
    }
    if(index == size - 1){
      String output = end.getData();
      end = end.getPrev();
      end.setNext(null);
      return output;
    }
    if(index == 0){
      String output = start.getData();
      start = start.getNext();
      start.setPrev(null);
      return output;
    }
    while(place < size){
      if(place == index){
        String output = current.getData();
        last.setNext(after)
        current.setPrev(null);
        current.setNext(null);
        return output;
      }
    }
  }

}
