package ����;
import java.util.Scanner;

public class first {
    static int peoplenumber = 0;
    static int load = 0;
    static float totalprice = 0;

    public static void main(String[] agrs) {
        Passenger[] car1 = {new Passenger("�µ�", 500, 1, 4), new Passenger("���Դ�", 400, 2, 4), new Passenger("����", 800, 3, 20)};
        Trunk[] car2 = {new Trunk("�ɻ���", 800, 4, 20), new Trunk("��ά��", 1000, 5, 20)};
        Pickup[] car3 = {new Pickup("Ƥ��ѩ", 450, 6, 4, 2)};
        Scanner scan = new Scanner(System.in);
        System.out.println("��ӭʹ���⳵ϵͳ������");
        System.out.println("���Ƿ�Ҫ�⳵��1.�� 2.��");
        String str = scan.nextLine();
        if (str.equals("1")) {
            System.out.println("�����⳵�����ͼ����Ŀ��");
            System.out.println("���       ��������       ���            ����");
            System.out.println("1.         �µ�           500Ԫ/��       4��");
            System.out.println("2.         ���Դ�         400Ԫ/��       4��");
            System.out.println("3.         ����           800Ԫ/��       20��");
            System.out.println("4.         �ɻ���         400Ԫ/��       4��");
            System.out.println("5.         ��ά��         1000Ԫ/��      20��");
            System.out.println("6.         Ƥ��ѩ         450Ԫ/��       4��***2��");
            System.out.println("���������⳵��������");
            Scanner input = new Scanner(System.in);
            int code=input.nextInt();
            int[] num = new int[code];
            for (int i = 0; i <code; i++) {
                System.out.println("�������" +(i+1) + "���������");
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
                    System.out.println("������ĺ��벻��ȷ�����ʵ��������");
                    i--;
                }
            }
            System.out.println("�������⳵������");
            int day = input.nextInt();
            totalprice *= day;
            System.out.println("�����˵����£�");
            System.out.println("****�����˵ĳ��У�");
            for (int i = 0; i < code; i++) {
                if (num[i] == 1)
                    System.out.print("�µ�        ");
                if (num[i] == 2)
                    System.out.print("���Դ�      ");
                if (num[i] == 3)
                    System.out.print("����        ");
                if (num[i] == 6)
                    System.out.print("Ƥ��ѩ      ");
            }
            System.out.println("�����ˣ�" + peoplenumber + "��");
            System.out.println("****���ػ��ĳ��У�");
            for (int i = 0; i < code; i++) {
                if (num[i] == 4)
                    System.out.print("�ɻ���      ");
                if (num[i] == 5)
                    System.out.print("��ά��      ");
                if (num[i] == 6)
                    System.out.print("Ƥ��ѩ      ");
            }
            System.out.println("���ػ���" + load + "��");
            System.out.println("****�⳵�ܼ۸�" + totalprice + "Ԫ");
        } else
            System.out.println("лл���٣��ټ�������");
    }
}