public class Hayes_DSHw1{
   public static void main(String []args){
      int[] array = new int[5];
      array[0] = (int)(Math.random() * 11);
      array[1] = (int)(Math.random() * 101);
      array[2] = (int)(Math.random() * 1001);
      array[3] = (int)(Math.random() * 10001);
      array[4] = (int)(Math.random() * 100001);
      int last = (array.length - 1);
      
      System.out.println("Array's Content: ");
      for( int a = 0; a < array.length; a++){
         System.out.println( array[a] );
      }

     
      System.out.println("Input size up to 10 Test-------");
      int target = array[0];
      
      long Start = System.nanoTime();
      boolean x = linearSearch(array, target);
      long Stop = System.nanoTime();
      long time = (Stop - Start);
      System.out.println("Linear Search Results------");
      System.out.println(target + " is equal to " + x +", which is found in the array");
      System.out.println("it took " + time + " nanoseconds to complete the linear search" + "\n");
      
      long beg = System.nanoTime();
      boolean y = binarySearch(array, 0, last, target);
      long end = System.nanoTime();
      long time2 = (end - beg);
      System.out.println("Binary Search Results------");
      System.out.println(target + " is equal to " + y +", which is found in the array");
      System.out.println("it took " + time2 + " nanoseconds to complete the binary search" + "\n" );
     
     
     
     
      System.out.println("Input size up to 100 Test-------");
      target = array[1];
      
      long Start1 = System.nanoTime();
      boolean x1 = linearSearch(array, target);
      long Stop1 = System.nanoTime();
      long time1 = (Stop1 - Start1);
      System.out.println("Linear Search Results------");
      System.out.println(target + " is equal to " + x1 +", which is found in the array");
      System.out.println("it took " + time1 + " nanoseconds to complete the linear search" + "\n");
      
      long beg1 = System.nanoTime();
      boolean y1 = binarySearch(array, 0, last, target);
      long end1 = System.nanoTime();
      long time3 = (end - beg);
      System.out.println("Binary Search Results------");
      System.out.println(target + " is equal to " + y1 +", which is found in the array");
      System.out.println("it took " + time3 + " nanoseconds to complete the binary search" + "\n" );
     
     
     
     
     
      System.out.println("Input size up to 1,000 Test-------");
      target = array[2];
      
      long Start2 = System.nanoTime();
      boolean x2 = linearSearch(array, target);
      long Stop2 = System.nanoTime();
      long time4 = (Stop2 - Start2);
      System.out.println("Linear Search Results------");
      System.out.println(target + " is equal to " + x2 +", which is found in the array");
      System.out.println("it took " + time4 + " nanoseconds to complete the linear search" + "\n");
      
      long beg2 = System.nanoTime();
      boolean y2 = binarySearch(array, 0, last, target);
      long end2 = System.nanoTime();
      long time5 = (end2 - beg2);
      System.out.println("Binary Search Results------");
      System.out.println(target + " is equal to " + y +", which is found in the array");
      System.out.println("it took " + time5 + " nanoseconds to complete the binary search" + "\n" );
      
      
      
      
      
      
      System.out.println("Input size up to 10,000 Test-------");
      target = array[3];
      
      long Start3 = System.nanoTime();
      boolean x3 = linearSearch(array, target);
      long Stop3 = System.nanoTime();
      long time6 = (Stop3 - Start3);
      System.out.println("Linear Search Results------");
      System.out.println(target + " is equal to " + x3 +", which is found in the array");
      System.out.println("it took " + time6 + " nanoseconds to complete the linear search" + "\n");
      
      long beg3 = System.nanoTime();
      boolean y3 = binarySearch(array, 0, last, target);
      long end3 = System.nanoTime();
      long time7 = (end3 - beg3);
      System.out.println("Binary Search Results------");
      System.out.println(target + " is equal to " + y +", which is found in the array");
      System.out.println("it took " + time7 + " nanoseconds to complete the binary search" + "\n" );
 
     
      System.out.println("Input size up to 100,000 Test-------");
      target = array[4];
      
      long Start4 = System.nanoTime();
      boolean x4 = linearSearch(array, target);
      long Stop4 = System.nanoTime();
      long time8 = (Stop4 - Start4);
      System.out.println("Linear Search Results------");
      System.out.println(target + " is equal to " + x4 +", which is found in the array");
      System.out.println("it took " + time8 + " nanoseconds to complete the linear search" + "\n");
      
      long beg4 = System.nanoTime();
      boolean y4 = binarySearch(array, 0, last, target);
      long end4 = System.nanoTime();
      long time9 = (end4 - beg4);
      System.out.println("Binary Search Results------");
      System.out.println(target + " is equal to " + y +", which is found in the array");
      System.out.println("it took " + time9 + " nanoseconds to complete the binary search" + "\n" );

   }
   
   public static boolean linearSearch( int[] array, int target){
      for(int i=0; i < array.length; i++){
         if ( array[i] == target){
            return true;
         }
      } return false;
   }
   
   public static boolean binarySearch( int[] array, int first, int last, int target){
      int middle = (first + last) / 2;
      while(first <= last){
         if ( array[middle] < target){
            first = (middle + 1);
         }
         else if(array[middle] == target){
            return true;
         }
         else{
            last = (middle - 1);
         }
         middle = (first+ last) / 2;
         }
         return true;
   }
      
}