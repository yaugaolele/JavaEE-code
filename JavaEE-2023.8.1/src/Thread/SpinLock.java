package Thread;

public class SpinLock {
    private Thread owner = null;

    public void lock(){
        //通过CAS看当前锁是否被某个线程持有。
        //如果这个锁已经被别的线程持有，那么就自旋等待。
        //如果这个锁没有被别的线程持有，那么就把owner设为当前尝试加锁的线程。
//        while (!CAS(this.owner,null,Thread.currentThread())){
//
//        }
    }

    public void unlock() {
        this.owner = null;
    }
}
