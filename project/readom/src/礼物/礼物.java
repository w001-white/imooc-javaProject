package 礼物;

import java.util.Random;

public class 礼物 {

    public static void main(String args[]) {
        Random random=new Random();
        int a=random.nextInt(4);
        if(a==0){
            System.out.println("镜子");
        }
        if(a==1){
            System.out.println("小屋");
        }
        if(a==2){
            System.out.println("手环");
        }
        if(a==3){
            System.out.println("耳机");
        }
    }

}
