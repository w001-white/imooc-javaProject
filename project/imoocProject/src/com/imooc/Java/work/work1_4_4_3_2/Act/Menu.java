package com.imooc.Java.work.work1_4_4_3_2.Act;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/25 17:05
 * @注释：
 */
public class Menu {
    public Menu() {

    }

    // 菜单
    public void Menu() {
        System.out.println("*************欢迎来到太阳马戏团***************");
        System.out.println("**************  请选择表演者   **************");
        System.out.println("**************    1、棕熊     **************");
        System.out.println("**************    2、狮子     **************");
        System.out.println("**************    3、猴子     **************");
        System.out.println("**************    4、鹦鹉     **************");
        System.out.println("**************    5、小丑     **************");
    }

    // 选择表演种类
    public void Switch(int n) {
        switch (n) {
            case 1:
                new Bear().act();
                break;
            case 2:
                new Lion().act();
                break;
            case 3:
                new Monkey().act();
                break;
            case 4:
                new Parrot().act();
                break;
            case 5:
                new Clown().act();
                break;
//            default:
//                System.out.println("请输入1~5的数字");
//                break;
        }
    }
}
