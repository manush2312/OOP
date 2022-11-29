
import java.util.Scanner;
//Write and execute a java program to create and initialize a matrix ofintegers. Create I
// threads( by implementing Runnable interface) where n is equal to the number of rows
// in the matrix. Each of these threads should compute a distinct row sum. The main thread computes 
//the complete sum by looking into the partial sums given by the threads.

class NewThread implements Runnable{
    String name;
    Thread t;
    int row[];
    int sum;

    NewThread(String name, int arr[]){
        this.name = name;
        t = new Thread(this, name);  // creating a new object of the thread class..
        this.row = arr;
        t.start();
    }

    @Override
    public void run() {
        sum = 0;
        for (int i = 0; i < row.length; i++) {
            sum = sum + row[i];
        }
        System.out.println("Sum of "+name+ " is "+sum);
        
    }

    int getSum(){
        return sum;
    }
    
}



public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix:");
        int m = sc.nextInt();  // rows 
        int n = sc.nextInt();  // columns
        int[][] arr = new int[m][n];  // initializing a 2d matrix

        System.out.println("Enter the elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
            
        }

        // creating a refernce for m threads:
        NewThread r[] = new NewThread[m]; 
        for (int i = 0; i < m; i++) {
            String t = "Row "+i;
            r[i] = new NewThread(t, arr[i]);
        }

        // for (int i = 0; i < m; i++) {
        //     r[i].join();
        // }
    }
}
