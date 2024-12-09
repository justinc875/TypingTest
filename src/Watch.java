public class Watch implements Runnable {
    //instance variables
    private int x = 0;
    private boolean condition;
    private String startSequence;
    //private String userInput;

    //create type test logic object
    TypeTestLogic info;

    public Watch(TypeTestLogic ttl) {
        info = ttl;
        condition = false;
        startSequence = info.getStart();
    }

    //check if condition is true for false in order to start the thread
    public void startSequence() {
        condition = true;
    }

    public void stopSequence() {
        condition = false;
    }

    //thread for timer
    @Override
    public void run() {
        while (condition) {
            try {
                Thread.sleep(1000);
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