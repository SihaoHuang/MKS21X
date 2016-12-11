public class Driver{
  public static void main(String[]args){
    Barcode test0 = new Barcode("10819");
    System.out.println(test0.toString());
    try{
      Barcode test1 = new Barcode("125n1");
      System.out.println(test1.toString()); 
    }
    catch(IllegalArgumentException e){
      e.printStackTrace(); //illegal chars
    }
    try{
      Barcode test2 = new Barcode("514121");
      System.out.println(test2.toString()); 
    }
    catch(IllegalArgumentException e){
      e.printStackTrace(); //not right length
    }

/***************************************************/

    System.out.println(Barcode.toZip("|:::||||:::|::|::::|||:|::|:|::|"));
    try{
      System.out.println(Barcode.toZip("|::|:|::||::|:|:|::|:||:::|::|||::::|"));
    }
    catch(IllegalArgumentException e){
      e.printStackTrace(); //not right length
    }
    try{
      System.out.println(Barcode.toZip("|::|:|::||::|:|:5::|:||:::|::|:|"));
    }
    catch(IllegalArgumentException e){
      e.printStackTrace(); //illegal chars
    }
    try{
      System.out.println(Barcode.toZip("|::|:|::||::|:|::::|:||:::|::|::"));
    }
    catch(IllegalArgumentException e){
      e.printStackTrace(); //no guard rails
    }
    try{
      System.out.println(Barcode.toZip("|:::||||:::|::|::::|||:|::|||::|"));
    }
    catch(IllegalArgumentException e){
      e.printStackTrace(); //invalid encoding
    }
    try{
      System.out.println(Barcode.toZip("|:::||||:::|::|::::|||:|::||:::|"));
    }
    catch(IllegalArgumentException e){
      e.printStackTrace(); //invalid checksum
    }
    
  }
}