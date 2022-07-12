package waitNotify;

/**
 * @author wenjianli
 * @date 2022/7/3 8:48 下午
 */
public class Test1 {
    public static void main(String[] args) {
        try{
            String newString = new String("");
            newString.wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
