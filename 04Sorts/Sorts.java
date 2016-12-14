import java.util.Arrays;
public class Sorts{

  public static String name(){
    return "10.Huang.Sihao"; 
  }

  /**Selection sort of an int array. 
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int[] data){
    for(int i = 0;i<data.length;i++){
      for(int j = i;j<data.length;j++){
        if (data[j]<data[i]) {
          int temp1 = data[j];
          int temp2 = data[i];
          data[i] = temp1;
          data[j] = temp2;
        }
      }
    }
  }
  
  public static void main(String[] args){
    int[] arr = {12,63,6,4,9,0};
    selectionSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}

