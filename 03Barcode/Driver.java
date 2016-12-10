public class Driver{
  public static void main(String[]args){
    try{
      Barcode test1 = new Barcode("125n1");
      System.out.println(test1.toString()); 
    }
    catch(IllegalArgumentException e){
      e.printStackTrace();
    }
    try{
      Barcode test2 = new Barcode("514121");
      System.out.println(test2.toString()); 
    }
    catch(IllegalArgumentException e){
      e.printStackTrace();
    }
    System.out.println(Barcode.toZip("|::|:|::||::|:|:|::|:||:::|::|:|"));
  }
}