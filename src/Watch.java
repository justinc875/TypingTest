public class Watch implements Runnable {
    //instance variables
    private int x = 0;
    private boolean condition;
    private String startSequence;

    //create type test logic object
    TypeTestLogic info = new TypeTestLogic();
//
//    //call method
//    info.getInfo();

    public Watch() {
        condition = false;
        startSequence = info.getStart();
    }

    //check if condition is true for false in order to start the thread
    private void startSequence() {
    if (startSequence != "") {
        condition = true;
        }
    }

    //thread
    @Override
    public void run() {
        while (condition) {
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


//create a object of TypeTestLogic
