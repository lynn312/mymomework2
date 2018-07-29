package 来啊;
import java.util.Scanner;

public class first {
    static int peoplenumber = 0;
    static int load = 0;
    static float totalprice = 0;

    public static void main(String[] agrs) {
        Passenger[] car1 = {new Passenger("奥迪", 500, 1, 4), new Passenger("马自达", 400, 2, 4), new Passenger("金龙", 800, 3, 20)};
        Trunk[] car2 = {new Trunk("松花江", 800, 4, 20), new Trunk("依维柯", 1000, 5, 20)};
        Pickup[] car3 = {new Pickup("皮卡雪", 450, 6, 4, 2)};
        Scanner scan = new Scanner(System.in);
        System.out.println("欢迎使用租车系统！！！");
        System.out.println("您是否要租车：1.是 2.否");
        String str = scan.nextLine();
        if (str.equals("1")) {
            System.out.println("您所租车的类型及其价目表：");
            System.out.println("序号       汽车名称       租金            容量");
            System.out.println("1.         奥迪           500元/天       4人");
            System.out.println("2.         马自达         400元/天       4人");
            System.out.println("3.         金龙           800元/天       20人");
            System.out.println("4.         松花江         400元/天       4吨");
            System.out.println("5.         依维柯         1000元/天      20吨");
            System.out.println("6.         皮卡雪         450元/天       4人***2吨");
            System.out.println("请输入你租车的数量：");
            Scanner input = new Scanner(System.in);
            int code=input.nextInt();
            int[] num = new int[code];
            for (int i = 0; i <code; i++) {
                System.out.println("请输入第" +(i+1) + "辆车的序号");
                num[i] = input.nextInt();
                if (num[i] == 1) {
                    peoplenumber += 4;
                    totalprice += 500;
                } else if (num[i] == 2) {
                    peoplenumber += 4;
                    totalprice += 400;
                } else if (num[i] == 3) {
                    peoplenumber += 20;
                    totalprice += 800;
                } else if (num[i] == 4) {
                    load += 4;
                    totalprice += 400;
                } else if (num[i] == 5) {
                    load += 20;
                    totalprice += 1000;
                } else if (num[i] == 6) {
                    peoplenumber += 4;
                    load += 2;
                    totalprice += 450;
                } else {
                    System.out.println("您输入的号码不正确，请核实后在输入");
                    i--;
                }
            }
            System.out.println("请输入租车天数：");
            int day = input.nextInt();
            totalprice *= day;
            System.out.println("您的账单如下：");
            System.out.println("****可载人的车有：");
            for (int i = 0; i < code; i++) {
                if (num[i] == 1)
                    System.out.print("奥迪        ");
                if (num[i] == 2)
                    System.out.print("马自达      ");
                if (num[i] == 3)
                    System.out.print("金龙        ");
                if (num[i] == 6)
                    System.out.print("皮卡雪      ");
            }
            System.out.println("共载人：" + peoplenumber + "人");
            System.out.println("****可载货的车有：");
            for (int i = 0; i < code; i++) {
                if (num[i] == 4)
                    System.out.print("松花江      ");
                if (num[i] == 5)
                    System.out.print("依维柯      ");
                if (num[i] == 6)
                    System.out.print("皮卡雪      ");
            }
            System.out.println("共载货：" + load + "吨");
            System.out.println("****租车总价格：" + totalprice + "元");
        } else
            System.out.println("谢谢光临，再见！！！");
    }
}