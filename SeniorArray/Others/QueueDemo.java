package SeniorArray.Others;

public class QueueDemo {
    public static void main(String[] args) {

        /*
          阻塞队列
          阻塞队列的好处是可以防止队列容器溢出；只要满了就会进行阻塞等待；也就不存在溢出的情况；
          只要是阻塞队列，都是线程安全的；
          出队阻塞方法 ： take()
          入队阻塞方法 ： put()

          非阻塞队列
          不管出列还是入列，都不会进行阻塞，
          入列时，如果元素数量超过队列总数，则会抛出异常，
          出列时，如果队列为空，则取出空值；

          双端队列 QueueDemo
        */

        /*
         add        增加一个元索                 如果队列已满，则抛出一个IIIegaISlabException异常
　　      remove   移除并返回队列头部的元素         如果队列为空，则抛出一个NoSuchElementException异常
　　      element  返回队列头部的元素              如果队列为空，则抛出一个NoSuchElementException异常
　　      offer       添加一个元素并返回true       如果队列已满，则返回false
　　      poll         移除并返问队列头部的元素     如果队列为空，则返回null
　　      peek       返回队列头部的元素            如果队列为空，则返回null
　　      put         添加一个元素               如果队列满，则阻塞
　　      take        移除并返回队列头部的元素     如果队列为空，则阻塞
         drainTo(list)   一次性取出队列所有元素
        */

        /*
         阻塞队列
         1、DelayQueue
         一个支持延时获取元素的无界阻塞队列

         2、LinkedTransferQueue
         一个由链表结构组成的无界阻塞队列。

         3、ArrayBlockingQueue
         有界队列，阻塞式,初始化时必须指定队列大小，且不可改变；，底层由数组实现；

         4、SynchronousQueue
         最多只能存储一个元素，每一个put操作必须等待一个take操作，否则不能继续添加元素

         5、PriorityBlockingQueue
         一个带优先级的队列，而不是先进先出队列。元素按优先级顺序被移除，
         而且它也是无界的，也就是没有容量上限，虽然此队列逻辑上是无界的，
         但是由于资源被耗尽，所以试图执行添加操作可能会导致 OutOfMemoryError 错误；
        */


    }
}
