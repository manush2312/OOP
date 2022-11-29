//A  post  office  charges  parcel  senders  according  to  the  weight  of  the  parcel.  For each parcel having 
//weight 2 Kg or less, the charge is Rs 32.50 and for each extra Kg, there is an additional charge of Rs 10.50.
//Create a class with necessary fields for  storing  customer  name,  parcel  id  and  parcel  weight. Use  constructor  
//& methods for storing & processing the parcel details. Create an array of objects to process the charges of ‘n’ parcels.


import java.util.Scanner;
class info{
    String name;
    int id;
    int weight;
    static int temp = 21090;

    
    info(String name, int weight){
        this.name = name;
        this.weight = weight;
        this.id = temp++;
    }
    

    void display()
    {
        System.out.println("Name of the receiver:"+name+"\nCustomer id:"+id+"\nWeight of the parcel:"+weight);
    }
}









public class ques{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Customers:");
        int n;
        n = sc.nextInt();
        info cus[] = new info[n];

        System.out.println("...Welcome to the Parcel Servicing Company...\n");
        System.out.println("Parcel having 2kg or less = 32.50 and for each extra kg additional charge of 10.50\n");

        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the details of " + (i+1) + "customer");
            System.out.println("Enter the name of the Receiver:");
            String name = sc.next();
            System.out.println("Enter the weight of the parcels:");
            int weight = sc.nextInt();


            cus[i] = new info(name,weight);
        }

        for(int i=0; i<n; i++)
        {
            cus[i].display();
        }


    }
}