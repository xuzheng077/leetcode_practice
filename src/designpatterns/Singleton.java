package designpatterns;

/**
 * @author Xu Zheng
 * @description 三种单例模式
 */
public class Singleton {

}

//懒汉式单例
//实例初始化为null，第一次调用getInstance方法时再进行初始化
//下面的实现没有考虑线程安全问题，如果要考虑线程安全，见ThreadSafeSingleton类
class LazySingleton{
    private LazySingleton(){
        //something here
    }

    private static LazySingleton instance = null;
    public static LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}

//饿汉式单例
//与懒汉式的区别是，在类初始化的时候就已经把实例初始化了，
// 因此，这种实现天生是线程安全的，因为在多线程环境中类也只初始化一次
class HungrySingleton{
    private HungrySingleton(){}

    private static HungrySingleton instance = new HungrySingleton();
    public static HungrySingleton getInstance(){
        return instance;
    }
}

//登记式单例
//这一种不常用，内部也是饿汉式单例的方式来实现的，这里暂时不写，待有时间补充
