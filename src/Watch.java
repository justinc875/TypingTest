public class Watch implements Runnable {
    //instance variables
    private int x = 0;
    private boolean condition;
    private String startSequence;

    //create type test logic object
    TypeTestLogic info;

    public Watch(TypeTestLogic ttl) {
        info = ttl;
        condition = false;
        startSequence = info.getStart();
        startSequence();
    }

    //check if condition is true for false in order to start the thread
    private void startSequence() {
    if (startSequence != "") {
        condition = true;
        }
    }

    //thread for timer
    @Override
    public void run() {
        while (condition) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            x++;
        }

    }


    public int getX() {
        return x;
    }


}
