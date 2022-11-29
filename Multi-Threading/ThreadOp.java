class UserDefined extends Thread{
    public void run(){
        try {
            System.out.println("Starting USer Defined Thread..");
            for(int i =0; i<2; i++){
                System.out.println("Calling "+i+ "times");
                Thread.sleep(500);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}



public class ThreadOp {
    public static void main(String[] args) {
        System.out.println("Main thread started..");

        UserDefined t2 = new UserDefined();
        t2.start();

        int x = 4+10;
        System.out.println("Sum is "+x);

        // Thread.currentThread() gives you the object of the current thread and we storing this in t
        Thread t = Thread.currentThread();
        System.out.println("Current thread is "+t.getName()); // gives the name of current Thread..

        //now we are setting the name for the thread or main thread..
        t.setName("MyMain");
        System.out.println("New Name is "+t.getName());

        // now we are making this thread to sleep for 5 seconds..
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            // TODO: handle exception
        }

        // getting id of current thread..
        System.out.println("ID is: "+t.getId());
        System.out.println("Main thread terminatted..");
    }
}
