//Write and execute a java program to create five threads, the first thread checking the uniqueness ofmatrix elements, the second calculating row sum, the third calculating the column sum, the fourth calculating principal diagonal sum, the fifth calculating the secondary diagonal sum of a given matrix. The main thread reads a square matrix from keyboard and will display whether the given matrix is magic square or not by obtaining the required data from sub threads.

import java.util.Scanner;


class firstThread extends Thread{
    Thread t;
    int arr[][];
    String name;
    int m; 
    int n;
    firstThread(int arr[][], String name, int m, int n){
        this.m = m;
        this.n = n;
        this.arr = arr;
        this.name = name;
        t = new Thread(this, this.name);
        t.start();
    }

    public void run(){
        int flag = 0;
        for (int i = 0; i < m-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if(arr[i][j] == arr[i+1][j+1]){
                    flag = -1;
                    break;
                }
            }
            break;
        }
        if(flag == 0){
            System.out.println("Matrix elements are unique");
        }else{
            System.out.println("Matrix elements are not Unique");
        }
    }
}

class secondThread extends Thread{
    Thread t;
    String name;
    int row[];
    int sum;

    secondThread(String name, int row[]){
        this.row = row;
        this.name = name;
        t = new Thread(this, this.name);
        t.start();
    }

    public void run(){
        getSum();
    }

    int getSum(){
        for(int i=0; i<row.length; i++){
            sum = sum + row[i];
        }
        System.out.println("Sum of row "+name+" is: "+sum);
        return sum;
    }
}

class thirdThread extends Thread{
    Thread t;
    String name;
    int column[];
    int sum;

    thirdThread(String name, int column[]){
        this.column = column;
        this.name = name;
        t = new Thread(this, this.name);
        t.start();
    }

    public void run(){
        getSum();
    }

    int getSum(){
        for(int i=0; i<column.length; i++){
            sum = sum + column[i];
        }
        System.out.println("Sum of column "+name+" is: "+sum);
        return sum;
    }
}

class fourthThread extends Thread{
    String name;
    Thread t;
    int arr[][];
    int m;
    int n;
    int prinSum;

    fourthThread(String name, int arr[][], int m, int n){
        this.name = name;
        this.arr = arr;
        this.m = m;
        this.n = n;
        t = new Thread(this, this.name);
        t.start();
        this.prinSum = 0;
    }

    public void run(){
        getprinSum();
    }

    int getprinSum(){
        for (int i = 0; i < m; i++) {
            prinSum = prinSum + arr[i][i];
        }

        return prinSum;
    }

}



public class full_matrix {
    



    public static void main(String[] args) {
        System.out.println("Enter the rows and columns of the matrix:");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();  // rows
        int n = sc.nextInt();  // columns

        int arr[][] = new int[m][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();  
            }
            
        }

        System.out.println("The matrix is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(arr[i][j]); 
            }
            
        }

        firstThread t1 = new firstThread(arr, "First_thread", m, n);

        secondThread r[] = new secondThread[m]; // creating "m" refernces for the second thread..
        for(int i=0; i<m; i++){
            String t = "ROW "+i;
            r[i] = new secondThread(t, arr[i]);
        }

        thirdThread c[] = new thirdThread[n];  // creating "n" refernces i.e. same as column number..
        int count = 1;
        
            System.out.println("hello");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int newarr[] = new int[n];
                newarr[j] = arr[j][i];
                System.out.println("HEllo manush");
                count = count++;
                if(count == n){
                    System.out.println("HEllo manush");
                    String t = "Column "+i;
                    c[i] = new thirdThread(t, newarr);
                    break;
                }
            }
            
        

    }
    }

    

  


}
