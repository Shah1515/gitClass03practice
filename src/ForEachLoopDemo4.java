import java.util.Arrays;
import java.util.Scanner;

public class ForEachLoopDemo4 {
    public static void main(String[] args) {

        int[] arr={10,13,20,25,45,50};

        System.out.println(Arrays.toString(arr));

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter 5 numbers");
        int [] numbers=new int[5];
//        numbers[0]=scanner.nextInt();
//        numbers[1]=scanner.nextInt();
//        numbers[2]=scanner.nextInt();
//        numbers[3]=scanner.nextInt();
//        numbers[4]=scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scanner.nextInt();

        }

        System.out.println(Arrays.toString(numbers));

    }
}
