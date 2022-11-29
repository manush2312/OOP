
import java.util.Scanner;
// Create a class by extending Thread Class to print a multiplication table of a number
// supplied as parameter. Create another class Tables which will instantiate two objects of the above class to 
//print multiplication table of 5 and 7.

class Multiplication extends Thread{
    String threadname;
    Thread t;
    int n;
    Multiplication(String threadname, int n){
        this.threadname = threadname;
        this.n = n;
        t = new Thread(this,this.threadname); // for creation of new thread..
        t.start();
    }

    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println(n +" * "+i+" = "+(n*i));
        }
    }
}



class Tables {
     String name;
     int n;
     Tables(String name, int n){
        this.name = name;
        this.n = n;
        new Multiplication(name, n);
     }
}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers for printing their tables:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Tables t1 = new Tables("Five", a);
        Tables t2 = new Tables("seven",b);
    }
}