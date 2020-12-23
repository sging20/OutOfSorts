import java.util.Arrays;
public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int temp=0;
    for(int i=0; i< data.length; i++){
      for(int j=0; j< data.length-1-i; j++){
        if(data[j]> data[j+1]){
            temp = data[j];
            data[j]= data[j+1];
            data[j+1]= temp;
        }
      }
    }
}

public static void selectionSort(int[] data){
  for(int i=0; i< data.length-1; i++){
    int ind=i;
      for(int j=i+1; j< data.length; j++){
              if(data[ind] > data[j]){
                ind=j;
              }
            }
                int smallest= data[ind];
                data[ind]= data[i];
                data[i] = smallest;
              }
            }
public static void insertionSort(int[] data){
  int temp;
  for(int i=1; i< data.length; i++){ //go through each part of the list
            temp= data[i];
            int counter= i;
            while(counter >0 && data[counter-1] > temp){
              data[counter] = data[counter-1];
              counter--;
          }
          data[counter]= temp;
        }
      }
    }
