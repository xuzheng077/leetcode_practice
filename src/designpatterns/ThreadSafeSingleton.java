package designpatterns;

/**
 * @author Xu Zheng
 * @description
 * 因为饿汉式单例模式是天生线程安全的，因此这个类是介绍如何为懒汉式单例模式实现线程安全
 */
public class ThreadSafeSingleton {
    //这没啥用
}

// 在getInstance方法上加同步
// synchronized关键字的作用就是限制在同一时刻，每次只有一个线程能执行这段代码，具体可自己再查synchronized用法
class LazySingleton1{
    private LazySingleton1(){}
    private static LazySingleton1 instance = null;

    //这种方式每次getInstance都会触发synchonized的限制，导致每次只有一个线程调用此方法，
    //虽然保证了多线程下的线程安全，但是效率较低
    public static synchronized LazySingleton1 getInstance(){
        if (instance == null){
            instance = new LazySingleton1();
        }
        return instance;
    }
}

//双重检查锁定，对上一种方法优化一下
class LazySingleton2{
    private LazySingleton2(){}
    private static LazySingleton2 instance = null;

    //进行了两次null检查，也就是所谓双重检查
    public static LazySingleton2 getInstance(){
        if (instance == null){
            //只有第一次调用此方法的时候才会进入这个if分支，因为第二次instance就不是null了
            //也就是说下面的synchronized代码块只会调用一次，以后就不会用到，因此提高了效率
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new LazySingleton2();
                }
            }
        }
        return instance;
    }
}

//使用静态内部类
//这种比上面两种都好，没有使用synchronized，避免了同步带来的影响
//使用内部类，内部类的类加载的时候就把这个instance给初始化了，可以保证只有一个实例，因此这种是线程安全的
//我感觉有点像饿汉式单例
class LazySingleton3{
    private static class LazyHolder{
        private static final LazySingleton3 instance = new LazySingleton3();
    }

    private LazySingleton3(){}

    public static final LazySingleton3 getInstance() {
        return LazyHolder.instance;
    }
}

