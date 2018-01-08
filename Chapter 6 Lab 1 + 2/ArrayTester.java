/**
 * Write a description of class ArrayTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayTester
{
   public static void main(String[] args) {
       int[][] arr = {{1, 1, 1,}, {1, 1, 1}};
       ArrayCalculations.averageArray(arr);
       
       int[] a = ArrayCalculations.sumColumn(arr);
       for(int i = 0; i < a.length; i++) {
           System.out.println(a[i]);
        }
    }
}
