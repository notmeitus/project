import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [][]array = {
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25},
                {26,27,28,29,30},
                {31,32,33,34,35}};
        //displaying the numbers
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }


       //selecting the column number
        System.out.println("SELECT ANY NUMBER FROM ABOVE SET AND ");
        System.out.println("ENTER THE COLUMN NUMBER");
        int k =sc.nextInt();


        //checking the k value

        while (!(k<=array.length && k>0) ) {
            System.out.println("OOPS! YOUR ENTERED WRONG COLUMN NUMBER");
            System.out.println("plz! ENTER CORRECT COLUMN NUMBER");
            k = sc.nextInt();
        }
            //swap

            for (int i=0;i<array.length;i++){
                int temp = array[i][i];
                array[i][i]=array[i][k-1];
                array[i][k-1]=temp;
            }

        //displaying the numbers
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

           //choose the number again
        System.out.println("AGAIN ENTER YOUR SELECTED NUMBERS COLUMN  (Be careful..!) ");
        int s = sc.nextInt();
        System.out.println("your number is  "+array[s-1][s-1]);
    }
}
