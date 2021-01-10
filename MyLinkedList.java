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
     Node adder = new Node(value);
       Node current = start;
       Node term = end;
      size = size + 1;
      if (size == 1){
        start = adder;
        end = adder;
      }

      else if(index == 0){
        start = adder;
        start.setNext(current);
      }
      else if(index == size - 1){
      end = adder;
      adder.setPrev(term);
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
    while(fin < size){
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
    Node current = start;
    Node term = end;
    int place = 0;
    if(size == 1){
      String output = start.getData();
      start = null;
      end = null;
      size = size - 1;
      return output;
    }
    if(size == 2 && index == 1){
      String output = end.getData();
      Node replace = new Node(start.getData());
      start = replace;
      end = replace;
      size = size - 1;
      return output;
    }
    if(size == 2 && index == 0){
      String output = start.getData();
      Node replace = new Node(end.getData());
      start = replace;
      end = replace;
      size = size - 1;
      return output;
    }
    if(index == size - 1){
      String output = end.getData();
      term = end.getPrev();
      Node replace = new Node(term.getData());
      replace.setPrev(term.getPrev());
      end = term;
      size = size - 1;
      return output;
    }
    if(index == 0){
      String output = start.getData();
      current = start.getNext();
      Node replace = new Node(current.getData());
      replace.setNext(current.getNext());
      start = current;
      size = size - 1;
      return output;
    }
    while(place < size){
      if(place == index){
        String output = current.getData();
        current.getPrev().setNext(current.getNext());
        size = size - 1;
        return output;
      }
      current = current.getNext();
      place = place + 1;
    }
    return "IF you see this, something wrong happened";
  }

  public void extend(MyLinkedList other){

    if(this.size == 0){
    start = other.start;
    end = other.end;
    size = other.size;
    if(other.size != 0){
    other.remove(0);
    other.size = 0;}
    }
    else if(other.size == 1){
      this.add(other.get(0));
      other.remove(0);
    }
    else if (other.size == 2){
      this.add(other.get(0));
      other.remove(0);
      this.add(other.get(0));
      other.remove(0);
    }
    else if(other.size != 0){
    this.end.setNext(other.start);
    this.size = this.size + other.size;
    this.end.setData(other.end.getData());
    this.end.setPrev(other.end.getPrev());
    other.size = 0;
    other.start = null;
    other.end = null;}
  }
  public boolean StartTest(){
    if(start != null){
      return true;
    } else return false;
  }
  public boolean EndTest(){
    if(end != null){
      return true;
    } else return false;
  }
  //both are for debugging purposes only

}
