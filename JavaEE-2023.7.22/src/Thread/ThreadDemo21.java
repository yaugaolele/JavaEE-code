package Thread;
//将这个类设置成单例的
class Singleton{
    //唯一实例的本体
    //这里Singleton被static修饰表示该属性是类的属性
    //JVM中每个类的类对象只有唯一一份，类对象里的这个成员也就自然只有唯一一份了
    private static Singleton instance = new Singleton();
    //获取到实例的方法
    public static Singleton getInstance() {
        return instance;
    }
    //禁止外部new实例,将构造方法设为私有的
    private Singleton() { }
}
public class ThreadDemo21 {
    public static void main(String[] args) {
        //此时 s1 和 s2是同一个对象！！！
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
//        Singleton s3 = new Singleton();
        System.out.println(s1 == s2);
    }
}
