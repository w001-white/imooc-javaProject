package com.imooc.Java.thisUse;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/1/8 19:35
 * @注释：就近原则，this：当前对象的默认引用；this的使用：调用重载的构造方法，必须是构造方法的第一句
 */

/**
 * 1、main方法启动，执行第一条语句，产生thisUse类型对象thisUse，此时由于thisUse类中没有定义构造方法，
 *    系统默认提供无参构造，并设置其属性month的默认值为0。
 * 2、创建一个int类型的变量mh，赋值为1。
 * 3、调用one的run方法，将mh作为实参传入run。此时,run方法的参数month即为1。
 * 4、run方法执行第一句，由于此时在run方法中,由于就近原则的影响，其可访问范围内的month，最近的是方法形参的month ,
 *    也就是说month=month，执行操作实际为，方法形参的自身赋值，说白了，这句话的执行类似于1=1，无实际意义,
 * 5、run方法执行第二句，将赋值结果后的month传入输出语句，打印输出。即输出结果的第一行:小猫已经1月大了，回到主方法，
 *    由于此时thisUse.month仍是初始值O，未被修改过，因此最后打印输出第二行:小猫已经0月大了，当实际输出结果需要为1和1时，常用修订方案:
 */

public class thisUse {
    // 成员属性，年龄
    int month;

    public void run(int month){
        month = month;
        System.out.println("小猫已经" + month + "月大了");
    }

    /**
     * 解决方案一：修改run方法参数名，使其与类中属性名不同，此时再执行run方法第一句时，
     *          其可访问范围内"的month就需要向上找类中的成员属性month了，也就会对成员属性赋值,从而影响主方法中属性输出结果。
     */
    public void run1(int Amonth){
        month = Amonth;
        System.out.println("小猫已经" + Amonth + "月大了");
    }

    /**
     * 解决方案二：修改方法中的第一行代码，通过this关键字，强行指代类中的成员属性month接收方法参数的赋值。
     *          此时由于this的影响。run方法传入的参数，将会直接给属性赋值，进而影响主方法最后的输出结果。
     */
    public void run2(int month){
        this.month = month;
        System.out.println("小猫已经" + month + "月大了");
    }


    public static void main(String[] args) {
        thisUse thisUse = new thisUse();
        int mh = 1;
        thisUse.run(mh);
        System.out.println("小猫已经" + thisUse.month + "月大了");

        System.out.println("------------");

        thisUse thisUse1 = new thisUse();
        thisUse1.run1(1);
        System.out.println("小猫已经" + thisUse1.month + "月大了");

        System.out.println("------------");
        thisUse thisUse2 = new thisUse();
        thisUse2.run2(1);
        System.out.println("小猫已经" + thisUse2.month + "月大了");
    }
}
