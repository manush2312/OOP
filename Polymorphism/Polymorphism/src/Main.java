public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circles circle = new Circles();
        Square square = new Square();

        Shapes.area();   // in this we have created same function called void area() in each class and while calling it
        Square.area();   // displays different messgaes this is known as polymorphism i.e. many ways to represent a
        Circles.area();  // a single entity..


        Shapes shape1 = new Square();  // referencing to shapes and object is created of type Square..
        shape1.area();  // this is printing "I am in shapes."



    }
}
