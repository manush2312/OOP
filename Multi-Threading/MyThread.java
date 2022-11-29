
// creating a thread using a runnalbe interface..
class MyThread implements Runnable{

    @Override
    public void run() {
        for(int i=1; i<=10; i++ ){
            System.out.println("Value of i is "+i );
            try {
                Thread.sleep(1000);  // sleep for 1 second..
            } catch (Exception e) {
                System.out.println("Thread Interuppted");
            }
        }
        
    }
    
    public static void main(String[] args) {
        
        //create object of Mythread class
        MyThread t1 = new MyThread();

        Thread thr = new Thread(t1); // creating the thread on our object
        thr.start();

        
    }
}