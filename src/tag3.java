import java.sql.Array;
import java.util.Scanner;  // Import the Scanner class
public class tag3 {
    public static void main(String[] args) {

    int [] array = {6,2,3,4,5,6,7,8,9,10} ;
    int sum=0;
    int largestNummer =0;
            for(int i=0 ; i<array.length; i++){
                sum=sum + array[i];
                if(largestNummer< array[i])
                    largestNummer=array[i] ;
            }
            System.out.println("sum= "+ sum);
          System.out.println("largestNummer="+largestNummer);

        int [] array2 = {11,12,13,14,15,16,17,18,19,20} ;
        int [] addArray=new int[10];

        for(int i=0 ; i<array.length; i++){
                addArray[i] = array[i]+array2[i];
        }
        System.out.print("add Array  " );
       for( int i=0 ; i<addArray.length; i++){
           System.out.print(addArray[i]+" ");
       }

    }

}
