import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of item : ");
        int n = input.nextInt();

        double[] numbers = new double[n];

        System.out.print("Enter the nember : ");
        for (int i = 0; i< n ;i++){
            numbers[i] = input.nextDouble();
        }
        double max = 0;
        double min = 0;
        double temp = 0;
        for(int i = 0 ; i < n ; i++){
            if (numbers[i] > temp){
                max = numbers[i];
            }
             temp = max;
        }

        for(int i = 0 ; i < n ; i++){
            if (numbers[i] < temp){
                min = numbers[i];
            }
             temp = min;
        }


        System.out.println("Maximum is "+ max);
        System.out.println("Minimum is "+ min);

        }
    
    }



