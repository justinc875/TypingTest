public class Watch implements Runnable {
    //instance variables
    private int x = 0;

//    //create type test logic object
//    TypeTestLogic info = new TypeTestLogic();
//
//    //call method
//    info.getInfo();
    //thread
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(x);
            x++;
            //System.out.println("hello " + x);
        }

    }

    public int getX() {
        return x;
    }
}
