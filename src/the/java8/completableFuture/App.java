package the.java8.completableFuture;

public class App {
    public static void main(String[] args) {
        Thread thread = new Thread(() ->{
            while (true) {

                System.out.println("Thread: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(3000L);
                } catch (InterruptedException e) {
                    System.out.println("exit");
//                    e.printStackTrace();
                    return;
                }
            }


        });
        thread.start();

        System.out.println("hello:" + Thread.currentThread().getName());

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread + " is finished");
    }


    //1. thread를 생성해서 사용하는 방법
    /*static class MyThread extends Thread{
        @Override
        public void run(){
            System.out.println("Thread: " + Thread.currentThread().getName());
        }
    }*/
}
