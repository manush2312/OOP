//create an array in the main class and pass half array in one thread and half array in another thread and find the greatest of two arrays and compare the greatest of two arrays and display. 

import java.util.Scanner;

class NewThread extends Thread{
    String name;
    int arr[];
    Thread t;
    int great;
    NewThread(String name, int arr[]){
        this.name = name;
        this.arr = arr;
        t = new Thread(this, this.name);
        t.start();
        // great=0;
    }

    public void run(){
            getgreat();
    }

    int getgreat(){
        int great = arr[0];
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                great = arr[i+1];
            }
        }
        
        // System.out.println("Greatest element for "+name+" is "+great);
        
        return great;
    }
    
    
}

public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        int arr[] = new int[n]; 
        System.out.println("Enter the elements of the array:" );
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int arr1[] = new int[n/2];
        //System.out.println(arr1.length);
        for(int i=0; i<n/2; i++){
            arr1[i] = arr[i];
        }
       
        // for(int i =0; i<arr1.length; i++){
        //     System.out.println(arr1[i]);
        // }

        int arr2[] = new int[n/2];
        //System.out.println(arr2.length);
        for(int i=0; i<n/2; i++){
            arr2[i] = arr[n-n/2+i];
        }

        // for(int i =0; i<arr1.length; i++){
        //     System.out.print(arr2[i]);
        // }

        NewThread t1 = new NewThread("Array_1", arr1);
        NewThread t2 = new NewThread("Array_2", arr2);
        Thread t= Thread.currentThread();
        System.out.println(t.getName());
        
        if(t1.getgreat()>t2.getgreat()) 
        {
            System.out.println(t1.getgreat());
        }
        else
        {
            System.out.println(t2.getgreat());
        }
        //System.out.println(t.getPriority());

    }
}