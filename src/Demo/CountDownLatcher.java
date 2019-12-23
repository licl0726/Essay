package Demo;

public class CountDownLatcher {
    //单例实现方法之一
    private static volatile CountDownLatcher mSingleCountDown = null;

    private CountDownLatcher(){}
    public static CountDownLatcher getInstance(){
        if (mSingleCountDown == null){
            synchronized (CountDownLatchTest.class){
                if (mSingleCountDown == null){
                    mSingleCountDown = new CountDownLatcher();
                }
            }
        }
        return mSingleCountDown;
    }


}
