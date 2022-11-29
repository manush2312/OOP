public class main {
    public static void main(String[] args) {
        A obj = new A(2,"Manush");
        //obj.num -> this will give error as num has a private access, this is known as data hiding.

        obj.getNum(); // this will give the value of num, we are not directly getting it, obj has a getNum method and
                      // this method is inside of this class.
        // num or a private variable can be access anywhere inside the file A or class A, but since the method getNum
        // is public so it can be access from anywhere.

        // PUBLIC can be accessed from anywhere or everywhere.

        // when u don't specify any access modifier then it is DEFAULT access modifier. DEFAULT access modifier
        // variables can be accessed in the same package but we cannot access it in a different package.


    }
}
