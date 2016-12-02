public class OrderedSuperArray extends SuperArray{

  public OrderedSuperArray(){
    super();
  }

  public OrderedSuperArray(int initialCapacity){
    super(initialCapacity);
  }

  public OrderedSuperArray(String []ary){
    for(int x = 0;x<ary.length;x++){
      add(ary[x]);
    }
  }

  public boolean add(String element){
    if(size()==0) super.add(element);
    else super.add(locate(element),element);
    return true;
  }

  public int locate(String value){
    if(size()==0) return 0;
    else {
      if(value.compareTo(get(0))<0){
        return 0;
      }
      for(int x = 0;x<size()-1;x++){
        if(value.compareTo(get(x))>=0 && value.compareTo(get(x+1))<=0){
          return x+1;
        }
      }
      if(value.compareTo(get(size()-1))>=0) return size();
      return -1;
    }
  }  

  public String set(int index, String element){
    throw new UnsupportedOperationException();
  }

  public void add(int index, String element){
    throw new UnsupportedOperationException();
  }

}

//Sihao Huang, Mr Konstantinovich APCS Pd 10, 2016