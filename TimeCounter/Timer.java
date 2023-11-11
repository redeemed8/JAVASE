package TimeCounter;

public class Timer {
    private long start;
    public Timer() {
        this.start = System.currentTimeMillis();
    }
    public void getTime(){
        long end = System.currentTimeMillis();
        long t = end - this.start;
        System.out.println("执行了 " + t + " 毫秒.");
    }




}
