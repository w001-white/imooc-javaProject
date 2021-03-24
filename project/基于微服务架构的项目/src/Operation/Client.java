package Operation;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        while(true){
            aa();
        }
    }
    public static void aa(){
        System.out.println("输入两个数字");
        Scanner input1 = new Scanner(System.in);
        int a=input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        int b=input2.nextInt();

        System.out.println("输入的字符为(+,-,*,/):");
        Scanner in= new Scanner(System.in);
        String s=in.next();
        char c=s.charAt(0);

        Operation operation = OperationFactory.createOperation(c);
        operation.setNumberA(a);
        operation.setNumberB(b);
        System.out.println(operation.operate());
    }

}
