import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object data[];
    private static int DEFAULT_SIZE = 10;
    private int size = 0 ;

    public void CustomArrayList() {
        this.data = new Object [DEFAULT_SIZE];   // creating an  arraylist of default size..
    }

    public void add(T num){
        if(this.isFull()){
            this.resize();
        }
        data[size++] = num;
    }

    private void resize(){
        Object temp[] = new Object [data.length * 2];

        // coping the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove(){
        T remove = (T)(data[--size]);   // we did here is casting..
        return remove;
    }

    public T get(int index){
        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
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
       CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
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

