/* we need to greate a game of mentioned instance variables and a function to eleminate a player using player
id and add his money to pool price and display winner at the last when one player is left
 */




import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Arrays;

import static java.util.Locale.filter;

class Player{
    Scanner sc = new Scanner(System.in);
    String name;
    int id;
    int price;
    static int pool=0;
    static int temp = 210;

    Player(String name, int price){
        this.name = name;
        this.price = price;
        this.id = temp++;
    }

    void display(int n, int i){

            //int i=0;

            System.out.println("Name of Player " + (i + 1) + "is: " + name + "\nPrice of Player" + (i + 1) + "is: " + price + "\nPlayer id: " + id);

    }

    static void game(Player arr[], int n){
        Scanner sc = new Scanner(System.in);
        int i=0,k;
        if(arr.length > 1) {

            Player newarr[] = new Player[arr.length-1];
            System.out.println("Enter the id of Player you want to delete:");
            int iid = sc.nextInt();



            for (i=0, k=0; i<arr.length; i++){
                if(arr[i].id == iid){
                    continue;
                }

                newarr[k++] = arr[i];
            }

            arr[i] = newarr[i];

        }

        if(arr.length == 1){
            System.out.println("----Winner-----");

            arr[i].display(n, i);
        }

    }

}







public class main
{
    public static void main(String[] args)
    {
        int val,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("----Welcome to the Game----");
        System.out.print("Enter the number of players:");
        int n = sc.nextInt();

        Player arr[] = new Player[n];  // creating an array of Player..

        for(i=0; i<n; i++)
        {
            System.out.print("Enter the name of the Player "+i+":");
            String name = sc.next();
            System.out.print("Enter the initial Price of Player "+i+":");
            int price = sc.nextInt();

            arr[i] = new Player(name,price);
        }

        i=0;

        do{
            System.out.println("--Enter the preferred Choice--");
            System.out.println("1.Display\n2.Play Game\n3.Exit");
            val = sc.nextInt();
            switch(val){
                case 1:{
                    for(i=0; i<n; i++) {
                        if(arr[i].id != -1) {
                            arr[i].display(n, i);
                        }
                    }
                    break;
                }

                case 2:{
                    Player.game(arr,n);
                    break;
                }

                case 3: {
                    System.out.println("----Exiting from the Game----");
                    break;
                }
            }

        }while(val != 3);


    }
}
