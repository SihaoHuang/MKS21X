import java.util.*;
public class Sorts{

  public static String name(){
    return "10.Huang.Sihao"; 
  }

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
    }
  }

/**** Bad insertion sort by me
  public static void insertionSort(int[] data){
    for(int i = 1;i<data.length;i++){
      for(int j = 0;j<i;j++){
        if(data[j]>data[i]){
          int temp1 = data[j];
          int temp2 = data[i];
          data[i] = temp1;
          data[j] = temp2;
        }
      }
    }
  }
****/

  public static void insertionSort(int[] data){ //good insertion sort by Mr. K
    for(int i = 1;i<data.length;i++){
      int old = data[i];
      int index = i;
      while(index > 0 && old<data[index-1]){
        data[index] = data[index-1];
        index--;
      }
      data[index] = old;
    }
  }

  public static void bubbleSort(int[] data){
    boolean swapsMade = true;
    int end = data.length;
    while(swapsMade){
      swapsMade = false;
      end --;
      for(int i = 0;i<end;i++){
        if(data[i]>data[i+1]){
          int temp1 = data[i];
          int temp2 = data[i+1];
          data[i] = temp2;
          data[i+1] = temp1;
          swapsMade = true;
        }
      }
    }
  }
  
  public static int[] randomizeArray(int size){
    int[] arr = new int[size];
    for(int i = 0;i<size;i++){
      Random randgen = new Random();
      arr[i] = randgen.nextInt(size);
    }
    return arr;
  }

  public static void main(String[] args){
    
    int[] arr = {4,25,12,22,11,135,1,7,8,2,0,7,-139,65};
    selectionSort(arr);
    System.out.println(Arrays.toString(arr));

    int[] arr2 = {4,25,12,22,11,135,1,7,8,2,0,7,-139,65};
    insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));

    int[] arr3 = {4,25,12,22,11,135,1,7,8,2,0,7,-139,65};
    bubbleSort(arr3);
    System.out.println(Arrays.toString(arr3));
  }

}

