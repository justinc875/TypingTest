public class Stuff implements Runnable {
    //instance variables
    private int x = 0;

    //create type test logic object
    TypeTestLogic info = new TypeTestLogic();

    //call method
    info.getInfo();
    //thread
    @Override
    public void run() {
        while (info != "") {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            x++;
            //System.out.println("hello " + x);
        }

    }

    public int getX() {
        return x;
    }
}
