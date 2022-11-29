class NumericFns<T extends Number>{
    T num;

     NumericFns(T n){
        this.num = n;
     }

     // Retrun the reciprocal
     double reciprocal(){
        return 1 / num.doubleValue();
        //doubleValue() is an inbuilt method in java that returns the 
        //value of the specified number casted as a double data type.
     }

     // Returns the fractional component
     double fraction(){
        return 1 / num.doubleValue() - num.intValue();
     }

     // Determining whether the absolute values of two objects are same
     boolean absEqual (NumericFns<?> ob){   // if we pass double as a parameter like <Double> then it will only compare values who are of type double
        // or only accept the values who are of type double..
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())){
            return true;
        }else{
            return false;
        }
     }
}


public class WildCard {
    public static void main(String[] args) {
        NumericFns<Integer> iob = new NumericFns<Integer>(6);

       NumericFns<Double>  dob = new NumericFns<Double>(-6d);

       NumericFns<Long> lob = new NumericFns<Long>(5l);

       System.out.println("Testing iob and dob");
       if(iob.absEqual(dob)){
        System.out.println("Ansolute values are equal");
       }else{
        System.out.println("Not equal");
       }

       System.out.println("Testing iob and lob");
       if(iob.absEqual(lob)){
        System.out.println("Ansolute values are equal");
       }else{
        System.out.println("Not equal");
       }
    }
}
