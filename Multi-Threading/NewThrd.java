public class NewThrd extends Thread {
    public void run(){
        for(int i = 10; i<=0; i++){
            System.out.println("VAlue is "+i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Thread Interuppted");
            }
        }
    }

     public static void main(String[] args) {
        NewThrd t2 = new NewThrd();
        t2.start();
     }
}
