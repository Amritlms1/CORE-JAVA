package arrays;

public class array {
 public static void main(String[] args){
     int[] numbers = new int[10];
     for (int i = 0; i < 10; i++) {
         numbers[i]=i+1;
     }

     for (int i = 0; i < 10; i++)  {
         System.out.println(numbers[i]);
     }
 }
}