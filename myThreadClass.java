class myThreadClass extends Thread{
    @Override
    public void run(){

        System.out.println("Thread" + Thread.currentThread().getId());
    }

    public static void main(String args []){
       myThreadClass obj = new myThreadClass();
       obj.start();
    }
}