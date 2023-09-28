import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter lenght :");
        int n = input.nextInt();
        
        double[] numbers = new double[n];

        System.out.print("Enter the nember : ");
        for (int i = 0; i< n ;i++){
            numbers[i] = input.nextDouble();
        }
        
        System.out.println(findMax(numbers));
        System.out.println(findMin(numbers));
        


    }

    public static double findMax(double[] num){
        double temp = 0;
        double max = 0;
        
        for(int i = 0 ; i < num.length ; i++){
            if (num[i] > temp){
                max = num[i];
            }
             temp = max;
        }
        return max;
    }


    public static double findMin(double[] num){
        double temp = 0;
        double min = 0;
        
        for(int i = 0 ; i < num.length ; i++){
            if (num[i] < temp){
                min = num[i];
            }
             temp = min;
        }
        return min;
    }

    
}
