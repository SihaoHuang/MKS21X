public class Barcode implements Comparable<Barcode>{

   private String _zip;
   private static String[] dictionary = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};

  public Barcode(String zip) {
    if (zip.length() != 5) throw new IllegalArgumentException("Zip is not the correct length");
    for(int i=0;i<zip.length();i++){
      if(zip.charAt(i)<'0'||zip.charAt(i)>'9'){
        throw new IllegalArgumentException("Zip contains illegal symbols");
      }
    }
    _zip = zip;
  }
  
  private static int checkSum(String input){
    int check = 0;
    for(int i = 0;i < 5;i++){
      check += Integer.parseInt(input.substring(i,i+1));
    }
    check = check%10;
    return check;
  }

  public String getZip(){
    return _zip;
  }

  public static String toCode(String input){
    String output = "";
    for(int i = 0;i < input.length();i++){
      output += dictionary[Integer.parseInt(input.substring(i,i+1))];
    }
    return output;
  }

  public static String toZip(String input){
    if(input.length() != 32){
      throw new IllegalArgumentException("Barcode is not the right length");
    }
    for(int i=0;i<input.length();i++){
      if(input.charAt(i)!=':' && input.charAt(i)!='|'){
        throw new IllegalArgumentException("Barcode contains illegal symbols");
      }
    }
    if(input.charAt(0)!= '|' || input.charAt(31)!='|'){
      throw new IllegalArgumentException("Barcode does not have guard rails");
    }
    
    String code = input.substring(1,32); //strip end bars
    String out = "";
    for(int i = 0;i<6;i+=1){
      for(int c = 0;c<10;c++){
        if (code.substring(i*5,(i+1)*5).equals(dictionary[c])) {
          out += Integer.toString(c);
        }
      }
    }
    return out;
  }

  public String toString(){
    String output = "";
    output += _zip + Integer.toString(checkSum(_zip)) + "  |" + toCode(_zip) + toCode(Integer.toString(checkSum(_zip))) + "|";
    return output;
  }

  public int compareTo(Barcode other){
    return _zip.compareTo(other.getZip());
  }
  
}



