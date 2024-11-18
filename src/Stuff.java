public class Stuff implements Runnable {
    private int x = 0;
    @Override
    public void run() {
        while (true) {
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
