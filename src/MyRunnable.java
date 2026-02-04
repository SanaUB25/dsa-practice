/*public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i<=5; i++) {
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("error");
            }
            if (i == 5) {
                System.out.println("Time's uppppp!!!!!");
            }
        }

    }


}*/
/*public class MyRunnable implements Runnable {

    private final String text;
    MyRunnable (String text){
        this.text = text;}

    @Override
    public void run (){
        for (int i = 1 ;i < 5 ; i++){
            try{
                Thread.sleep(1000);
                System.out.println(text);
            }
            catch (InterruptedException e){
                System.out.println("thread was interrupted");
            }
        }
    }

}


*/


