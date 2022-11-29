package Inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box(){  // this is default constructor..
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }


    Box(double side){  // this is for cube..
        this.h=side;
        this.l=side;
        this.w=side;
    }

    Box(double l, double w, double h){  // constructor=3...
        this.l=l;
        this.w=w;
        this.h=h;
    }

    Box(Box old){  // calling one constructor from another constructor..
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }


    public void information(){
        System.out.println("Running the box..");
    }



}
