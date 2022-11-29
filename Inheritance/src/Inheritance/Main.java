package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();  // default consructor is being called..
        System.out.println(box.l+" "+box.h+" "+box.w);

        Box box1 = new Box(4); // side constructor is being called
        System.out.println(box1.l+" "+box1.h+" "+box1.w);

        Box box2 = new Box(box1);
        System.out.println(box2.l+" "+box2.h+" "+box2.w);

        Boxweight box3 =new Boxweight();
        System.out.println(box3.h+" "+box3.weight); // this will give -1.0 and -1.0

        // but we want to initialize all 4 variables.. so do this:

        Boxweight box4 = new Boxweight(2,3,4,8);
        System.out.println(box4.l+" "+box4.h+" "+box4.w+" "+box4.weight); // this will give 2,3,4,8 as output..

        Box box5 = new Boxweight(2,3,4,5);
        System.out.println(box5.l+" "+box5.h+" "+box5.w);
        // System.out.println(box5.weight);  -- this will give error as we can only access to the properties of
                                                // of refernce type i.e. Box type properties..

        // it is actually the type of reference variable and not the type of object that determines what members can
        // be accessed..


        Boxweight box6 = new Boxweight(box4);
        System.out.println(box6.l+" "+box6.h+" "+box6.w);

    }
}
