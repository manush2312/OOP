//Write a generic method to exchange the positions of two different elements in an array.




import java.util.Scanner;


public class Script{

static <T> void exchange (T arr[], int a, int b){
    T temp; 
    temp = arr[a]; 
    arr[a] = arr[b];
    arr[b] = temp;
}

static <T> void display(T arr[]){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+ "\t");
    }
}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required choice:\n1.Integer Array \n2.String Array");
        int inp = sc.nextInt();

        System.out.println("Enter the length of the array:");
        int len = sc.nextInt();

        System.out.println("Enter the index1 and index2 that you want to replace:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(inp == 1){
            Integer arr[] = new Integer[len];  // we can not create a "int" type array because it will give error as we cannot use
            // primitives int generics..
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            exchange(arr, a, b);
            display(arr);
        }else if

            (inp == 2){
            String arr[] = new String[len];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.next();
            }
            exchange(arr, a, b);
            display(arr);
        }
        sc.close();
    }
    
}
