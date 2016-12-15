import java.util.Arrays;
public class Sorts{

  public static String name(){
    return "10.Huang.Sihao"; 
  }

  /**Selection sort of an int array. 
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  /*
  public static void selectionSort(int[] data){
    for(int i = 0;i<data.length;i++){
      for(int j = i;j<data.length;j++){
        if (data[j]<data[i]) {
          int temp1 = data[j];
          int temp2 = data[i];
          data[i] = temp1;
          data[j] = temp2;
          System.out.println(Arrays.toString(data));
        }
      }
    }
  }
  */

  public static void selectionSort(int[] data){
    int smallestInd = 0;
    for(int i = 0;i<data.length;i++){
      smallestInd = i;
      for(int j = i;j<data.length;j++){
        if(data[j] < data[smallestInd]){
          smallestInd = j;
        }
      }
      int temp1 = data[smallestInd];
      int temp2 = data[i];
      data[i] = temp1;
      data[smallestInd] = temp2;
      System.out.println(Arrays.toString(data));
    }
  }

  public static void insertionSort(int[] data){
    for(int i = 1;i<data.length;i++){
      for(int j = 0;j<i;j++){
        if(data[j]>data[i]){
          int temp1 = data[j];
          int temp2 = data[i];
          data[i] = temp1;
          data[j] = temp2;
          //System.out.println(Arrays.toString(data));
        }
      }
    }
  }

  public static void main(String[] args){
    int[] arr = {64,25,12,22,11};
    selectionSort(arr);
    System.out.println(Arrays.toString(arr));

    int[] arr2 = {64,25,12,22,11};
    insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));
  }

}

