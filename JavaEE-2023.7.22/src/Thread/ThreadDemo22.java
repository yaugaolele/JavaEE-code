package Thread;
//通过懒汉模式来实现单例模式
class SingletonLazy{
    //加关键字volatile 禁止指令重排序。
    volatile private static SingletonLazy instance = null;
    public static SingletonLazy getInstance() {
        //这个条件是判断是否要加锁，如果对象已经有了，就不必在加锁，此时本身线程就是安全的。
        if (instance == null) {
            //加锁
            synchronized (SingletonLazy.class) {
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }
    //禁止类外创建实体
    private SingletonLazy() { }
}
public class ThreadDemo22 {
    public static void main(String[] args) {
        SingletonLazy s1 = SingletonLazy.getInstance();
        SingletonLazy s2 = SingletonLazy.getInstance();
        System.out.println(s1 == s2);
    }
}
