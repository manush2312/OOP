import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;

 class student
{
   
    String regno;
    String fullname;
    short sem;
    float gpa;
    float cgpa;
    //static int temp = 21;
    static int t =1;
    GregorianCalendar doj; //this is string..


   student()
   {
    System.out.println("default constructor");
   }

   student(String name, short sem, float gpa, float cgpa, int d, int m, int y, String str)
   {
        GregorianCalendar gcal = new GregorianCalendar(y,m-1,d);
        this.fullname = name;
        this.sem = sem;
        this.gpa = gpa;
        this.cgpa = cgpa;
        this.doj = gcal;
        this.regno = str;
   }

   void display()
   {
        System.out.println("Name:"+fullname+"\nRegistration number:"+regno+"\nSemester:"+sem+"\nGPA:"+gpa+"\ncgpa:"+cgpa+"\nDate:"+doj.get(Calendar.YEAR)+"/"+(doj.get(Calendar.MONTH)+1)+"/"+doj.get(Calendar.DATE));
   }

   static void semsort( student s[])
   {    int n=s.length;
        student temp1 = new student();
        int i,j;
        for (i=0; i<n; i++)
        {
            for(j=0; j<n-i-1; j++)
            {
                if(s[j].sem > s[j+1].sem)
                temp1 = s[j];
                s[j] = s[j+1];
                s[j+1] = temp1;
            }
        }
   }

   static void cgpasort(student stds[])
     {
    student temp = new student();
    int n = stds.length;
    for(int i=0;i<n-1;i++) {
        for(int j=i;j<n;j++) {
            if (((stds[i].cgpa)>((stds[j].cgpa)))) {
                temp = stds[i];
                stds[i] = stds[j];
                stds[j] = temp;
            }
        }
    }
}

static void namesort(student stds[])
{
    int n = stds.length;
    student temp  = new student();
    for(int i=0; i<n; i++)
    {
        for(int j=i+1; j<n; j++)
        {
            if(((stds[i].fullname).compareTo(stds[j].fullname)) > 0)
            {
                temp = stds[i];
                stds[i] = stds[j];
                stds[j] = temp;
            }
        }
    }
}

static void particularchar(student stds[])
{
    Scanner sc = new Scanner(System.in);
    int n = stds.length;
    System.out.print("Enter a character ");
        char ch = sc.next().charAt(0);
        System.out.println("The students with their name starting with same character are: ");
        for(int i=0;i<n;i++) {
            if ( stds[i].fullname.charAt(0) == ch) {
                stds[i].display();
            }
        }
}
}






public class Q1
{
    public static void main(String[] args) {
       int i;
       Scanner sc = new Scanner(System.in);
       System.out.println("....Welcome to the School....");

        System.out.println("...Enter the number of students:....");
       int n = sc.nextInt();

       student st[] = new student[n]; // creating array of students.. 

       for(i=0; i<n; i++)
       {
            String str="";
            System.out.println("Enter the name of the student:");
            String name = sc.next();
            System.out.println("Enter the current Semester:");
            short sem = sc.nextShort();
            System.out.println("Enter the GPA:");
            float gpa = sc.nextFloat();
            System.out.println("Enter the CGPA:");
            float cgpa = sc.nextFloat();
            System.out.println("ENter the date of DOJ");
            int d = sc.nextInt();
            System.out.println("ENter the month of DOJ");
            int m = sc.nextInt();
            System.out.println("ENter the year of DOJ");
            int y = sc.nextInt();

            if(student.t==1 || student.t<=9)
            {
                 str = ""+y%100 + "0"+student.t++ ;
            }

            st[i]= new student(name,sem,gpa,cgpa,d,m,y,str);
       }

       for(i=0; i<n; i++)
       {
         st[i].display();
       }

       i=0;

       System.out.println("....Enter the preferred sorting:....");
       System.out.println("1.SEMESTER\n 2.CGPA\n 3.NAME\n 4.ALL STUDENTS WITH CHARACHTER\n 5.EXIT");
       System.out.println("Enter the preferred choice:");
       int val = sc.nextInt();

       do{
        if(val==1)
        {
            student.semsort(st);
            for(i=0; i<n; i++)
            {
              st[i].display();
            }
            break;
        }

        if(val==2)
        {
            student.cgpasort(st);
            for(i=0; i<n; i++)
            {
              st[i].display();
            }
            break;
        }

        if (val==3)
        {
            student.namesort(st);
            for(i=0; i<n; i++)
            {
              st[i].display();
            }
            break;
        }

        if (val==4)
        {
            student.particularchar(st);
            
        }

       }while(val!=5);




    }
}