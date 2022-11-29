
class Q{
    int num;
    boolean valueSet = false;

    public synchronized void put(int num){

        while(valueSet){  // while valueSet == true then the thread will wait..
            try{
                wait();
            }
            catch(InterruptedException e){

            }
        }

        System.out.println("Put : "+num);
        this.num = num;
        valueSet = true;
        notify();
    }

    public synchronized void get(){

        while(!valueSet){
            try{
                wait();
            }
            catch(InterruptedException e){

            }
        }

         System.out.println("Get : "+num);
         valueSet = false;
         notify();
    }
}

class Producer implements Runnable{  // producer produces a new value every time it runs.

    Q q;  // refernce of q..

    Producer(Q q){
        this.q = q;
        Thread t1 = new Thread(this, "Producer");
        t1.start();
    }

    public void run(){
        int i = 0;

        while(true){
            q.put(i++);

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
            
            }
        }
    }

}

class Consumer implements Runnable{
    Q q;

    Consumer(Q q){
        this.q = q;
        Thread t2 = new Thread(this, "Consumer");
        t2.start();
    }

    public void run(){
        q.get();
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e){
        
        }
    }
}


class prod_con{
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        
    }
}