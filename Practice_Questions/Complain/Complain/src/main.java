import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Scanner;

class Complain{
    String sub;
    int id;
    GregorianCalendar date;
    static int temp = 210;

    Complain(String sub, int d, int m, int y){
        this.sub = sub;
        date = new GregorianCalendar(y,m-1,d);
        this.id = temp++;
    }

    void display(){
        System.out.println("Subject Of Complaint:"+sub+"\nID: "+id+"\nDate:"+date.get(Calendar.YEAR)+"/"+ (date.get(Calendar.MONTH)+1)+"/"+date.get(Calendar.DATE));
    }

    static void stringsort(Complain arr[], int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to search for:");
        String search = sc.next();
        for(int i=0; i<n; i++){
            if(arr[i].sub.equalsIgnoreCase(search))
                arr[i].display();
        }
    }

}




public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,val;
        System.out.println("----WELCOME TO MANAGEMENT COMPLAINT SYSYTEM----");
        System.out.println("Enter the number of complaints:");
        int n = sc.nextInt();

        Complain arr[] = new Complain[n];
        for(i=0; i<n; i++){
            System.out.println("Enter the Subject of complaint "+(i+1)+" :");
            String sub = sc.next();
            System.out.println("Enter the date, month and year of Complaint:");
            int d = sc.nextInt();
            int m = sc.nextInt();
            int y = sc.nextInt();

            arr[i] = new Complain(sub,d,m,y);
        }



        do{
            System.out.println("Enter the valid Sorting choice:");
            System.out.println("1.Particular String\n2.Id\n3.Date\n4.Display\n5.Exit");
            val = sc.nextInt();
            switch(val){
                case 1:{
                    Complain.stringsort(arr,n);
                    break;
                }

                case 2:{
                    System.out.println("Already sorted, just go for display option..");
                }



                case 4:{
                    for(i=0; i<n; i++){
                        arr[i].display();
                    }
                }
            }

        }while(val != 5);


    }
}
