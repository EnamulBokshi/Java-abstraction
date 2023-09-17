import java.util.Scanner;
abstract class  Max_min{
    public abstract double  max(double[] arr);
    public abstract double  min(double[] arr);
}
public class Main extends Max_min{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size Of Array: ");
        n = sc.nextInt();
        double [] arr = new double[n];
        int i;
        for (i = 0; i<n; i++){
            System.out.println("Enter data for arr["+i+"]: ");
            arr[i] = sc.nextDouble();
        }
        Main mn = new Main();
        double Mx = mn.max(arr);
        double Min = mn.min(arr);
        System.out.println("Max = "+ Mx);
        System.out.println("Min = "+ Min);

    }
    public double max(double []arr){
        double max = arr[0];
        int n = arr.length;
        int i;
        for(i = 0; i<n; i++){
            if (arr[i]>max) max = arr[i];
        }
        return max;

    }
    public double min(double [] arr){
        double min = arr[0];
        int n = arr.length;
        int i;
        for(i = 0; i<n; i++){
            if(arr[i]<min) min = arr[i];
        }
        return min;
    }
}