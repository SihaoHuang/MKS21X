import java.util.*;

public class SuperArray implements Iterable<String>{
  private String[] data;
  private int size;
  private String[] intermediate;
  private int at; //for iterations

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity){
    if (initialCapacity<0) { 
      throw new IllegalArgumentException();
    }
    data = new String[initialCapacity];
    size = initialCapacity;
  }

  public int size(){
    return size;
  }

  public boolean add(String n){
    if (data.length<(size+1)) {
      grow();
    }
    data[size] = n;
    size ++;
    return true;
  }

  private void grow(){
    intermediate = new String[size*2+1];
    for(int i=0;i<data.length;i++) {
      intermediate[i] = data[i];
    }
    data = intermediate;
  }

  public String toString(){
    String output = "[ ";
    if (size>0) output += data[0];
    if (size>1) {
      for(int i=1;i<size;i++) {
       output += ", " + data[i];
      }
    }
    output += " ]";
    return output;
  }

  public String toStringDebug(){
    String output = "[ ";
    if (size>0) output += data[0];
    else output += "_";
    for(int i=1;i<data.length;i++) {
      if(i<size) {
        output += ", " + data[i];
      }
      else output += ", _";
    }
    output += " ]";
    return output;
  }
  
  public void clear(){
    size = 0;
  }

  public int capacity(){
    return data.length;
  }

  public boolean isEmpty(){
    return size == 0;
  }

  public String set(int index, String element){
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException();
    }
    String original = data[index];
    data[index] = element;
    return original;
  }

  public void add(int index, String element){
    if (index < 0 || index > size()) {
      throw new IndexOutOfBoundsException(Integer.toString(index));
    }
    intermediate = new String[size+1];
    for(int i=0;i<index;i++) {
      intermediate[i] = data[i];
    }
    intermediate[index] = element;
    if (index!=data.length) {
      for(int i=index;i<size;i++) { 
        intermediate[i+1] = data[i];
      }
    }
    data = intermediate;
    size ++;
  }

  public String remove(int index){
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException(Integer.toString(index));
    }
    intermediate = new String[size-1];
    String val = data[index];
    for(int i=0;i<index;i++) {
      intermediate[i] = data[i];
    }
    for(int i=index+1;i<intermediate.length+1;i++) {
      intermediate[i-1] = data[i];
    }
    data = intermediate;
    size --;
    return val;
  }

  public String[] toArray(){
    intermediate = new String[size];
    for(int i=0;i<data.length;i++) {
      intermediate[i] = data[i];
    }
    return intermediate;
  }

  public int indexOf(String i){
    for(int x=0;x<data.length;x++) {
      if (data[x].equals(i)){
        return x;
      }
    }
    return -1;
  }
  
  public int lastIndexOf(String i){
    for(int x=data.length-1;x>=0;x--) {
      if (data[x].equals(i)){
        return x;
      }
    }
    return -1;
  }

  public String get(int i){
    if (i < 0 || i >= size()) {
      throw new IndexOutOfBoundsException(Integer.toString(i) + ", and size is " + Integer.toString(size()));
    }
    return data[i];
  }
 
  public void trimToSize(){
    intermediate = new String[size];
    for(int i=0;i<size;i++) {
      intermediate[i] = data[i];
    }
    data = intermediate;
  }
  
  public Iterator<String> iterator(){
    return new SuperArrayIterator(this,at); //maybe change this later?
  }
}

/*********************************************************************/

class SuperArrayIterator implements Iterator<String>{
  
  SuperArray arr = new SuperArray();
  int at;

  public SuperArrayIterator(SuperArray argArr,int argAt){
    at = argAt;
    arr = argArr;
  }

  public String next(){
    if (hasNext()) {
      at++;
      return arr.get(at-1);
    }
    else {
      throw new NoSuchElementException(); //import util later!!!
    }
  }

  public boolean hasNext(){
    return at < arr.capacity();
  }

  public void remove(){
    throw new UnsupportedOperationException();
  }

}

//Sihao Huang, Mr Konstantinovich APCS Pd 10, 2016
