import java.util.Scanner;

public class DrawShape {
    public static void main(String[] args){
        int[] data = new int[4];
        get_data(data);
        draw_shape(data);
    }

    public static void get_data(int[] input){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter " + input.length + "numbers: ");
        for(int ind = 0; ind < input.length; ind++){
            input[ind] = scan.nextInt();
        }
    }

    public static void draw_shape(int[] in_array){
        for(int ind = 0 ; ind < in_array.length; ind++){

            for(int count = 0; count < in_array[ind]; count++){

                System.out.print((char)('A' + count));
            }
            System.out.println();
        }
    }
}
