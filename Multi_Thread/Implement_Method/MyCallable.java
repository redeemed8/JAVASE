package Multi_Thread.Implement_Method;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + "执行了");
        return t.getName();
    }

}
