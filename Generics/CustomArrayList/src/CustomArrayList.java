import java.util.Arrays;

public class CustomArrayList {

    // we dont want to directly change the array, we want to change the array by the methods that we are going to build
    // so we are making it private
    private int data[];
    private static int DEFAULT_SIZE = 10;
    private int size = 0 ;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];   // creating an  arraylist of default size..
    }

    public void add(int num){
        if(this.isFull()){
            this.resize();
        }
        data[size++] = num;
    }

    private void resize(){
        int temp[] = new int[data.length * 2];

        // coping the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove(){
        int remove = data[--size];
        return remove;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    private boolean isFull(){
        return size == data.length;
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(4);
        list.add(5);

        for (int i = 0; i < 12; i++) {
            list.add(2 * i);
        }

        System.out.println(list);

        // object creation stuff happens during run time
        // you cannot create an instance of generic type because byte code has not idea about that during run time
    }
}
