public class A {
    private int num;
    String name; // this has a DEFAULT access modifier
    int[] arr;

    public int getNum() {  // getter gets the value
        return num;
    }

    public void setNum(int num) {  // setter sets the value
        this.num = num;
    }

    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

}
