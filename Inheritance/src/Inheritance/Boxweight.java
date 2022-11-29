package Inheritance;

public class Boxweight extends Box{  // So now all the properties of the box class can be accessed from the boxweight
    double weight;  // instance variable of boxweight class

    public Boxweight(){  // default constructor for this class..
        this.weight=-1;
    }

    public Boxweight(double l, double h, double w, double weight){
        super(l,h,w);  // this will call constructor=3 of Box class as there are no l,w,h variables in this class
        this.weight=weight;
    }


    Boxweight(Boxweight other){ 
        super(other);
        this.weight=other.weight;
    }
}
