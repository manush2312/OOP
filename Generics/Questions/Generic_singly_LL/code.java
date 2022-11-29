import java.util.Scanner;

//Define a generic List class to implement a singly linked list and show the use of the
//generic class for two different class types Integer and Double class objects

class node<T> {
    T data;
    node<T> next;

    node(T data){
        this.data = data;
        this.next = null;
    }
}

class List<T>{
    node<T> head = null;  // initially head will be pointing to null

    void insertnode(T data){
        node<T> temp = new node<T>(data); // creating a temporary node..

        if(head == null){
            head = temp;
        }else{
            node<T> curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = temp;
        }
    }


    void display(){
        node<T> temp = head;
        while(temp != null){
            System.out.print(temp.data+ "\t");
            temp = temp.next;
        }
    }
    
}

public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice: 1.Integer list    2. String List");
        int inp = sc.nextInt();
        System.out.println("Enter the size of the list:");
        int size = sc.nextInt();

        if(inp == 1){
            List<Integer> list1 = new List<>();
            for (int i = 0; i < size; i++) {
                System.out.println("Enter the node data:");
                list1.insertnode(sc.nextInt());
            }
            System.out.println("List is");
            list1.display();
        }else if(inp == 2){
            List<String> list2 = new List<>();
            for (int i = 0; i < size; i++) {
                System.out.println("Enter the node data:");
                list2.insertnode(sc.next());
            }
            System.out.println("List is");
            list2.display();
        }else{
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
