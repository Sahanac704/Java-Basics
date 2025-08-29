import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        //1D array
        int array[] = {10,20,30};
        int[] myarray = {40,50,60};
        System.out.println(array);
        System.out.println(myarray);

        //2D array
        int twoD[][] = {{10,20},{30,40}};
        System.out.println(twoD);

        //3D array
        int[][][] threeD = {{{10},{20,30}}};
        System.out.println(threeD);

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();
        int arr[] = new int[size];
        arr[0] = 10;
        System.out.println("Enter the value to store in the array");
        arr[1] = scan.nextInt();
        System.out.println(arr[0]+","+arr[1]);
    }
}
