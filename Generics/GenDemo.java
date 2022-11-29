class Gen<T>{
    T ob;  // decalring an object of type T

    Gen(T o){
        this.ob = o;
    }

    T getob(){
        return ob;
    }

    void showType(){
        System.out.println(ob.getClass().getName());
    }
}

class GenDemo{
    public static void main(String[] args) {
        Gen<Integer> iob;  // creating a gen refernce of type Integer

        iob = new Gen<Integer>(88);

        iob.showType();  // shows the type of data used by iob..

        // getting value in iob:
        int v = iob.getob();
        System.out.println("value: "+v);

        // creating a Gen object for Strings:
        Gen<String> strob = new Gen<String>("Manush Darji");

        strob.showType();
        String str = strob.getob();
        System.out.println(str);
    }
}