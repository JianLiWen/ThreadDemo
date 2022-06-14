package MyThread;

/**
 * @author wenjianli
 * @date 2022/6/14 9:26 上午
 */
public class HasSelfPrivateNum {
    public void addl(String username){
        try {
            int num=0;
            if (username.equals("a")){
                num=100;
                System.out.println("a set over");
                Thread.sleep(2000);
            }else {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(username + " num=" + num);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
