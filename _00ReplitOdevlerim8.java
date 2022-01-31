package _00Replit;

import java.util.Arrays;

public class _00ReplitOdevlerim8 {

	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4};
		
		int arr2[]= {5,6};
		
		
		int arr3[]= birlestir(arr1,arr2);
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
		
		
				}

	  private static int[] birlestir(int[] arr1, int[] arr2) {
          
          int arr3[] = Arrays.copyOf(arr1, arr1.length+arr2.length);
       
          
          for (int i = 0; i < arr2.length; i++) { 
              
              arr3[i+arr1.length] = arr2[i];
              
          }
          
          
          return arr3;
      }
  }
