package Algorithm.Sort;

import java.util.Scanner;

public class encoding{
    /*public static void main(String[] args) {
        char[] form = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0'
                , '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入待加密的明文：");
        String MingWen = sc.nextLine();
        MingWen=MingWen.toUpperCase();//将输入的明文全部大写
        final int K1 = 3;
        final int K2 = 4;
        final int K3 = 31;
        int [] cipherNum=new int[MingWen.length()];//用来存储数字化的密文
        encryption(MingWen,form,K1,K2,cipherNum);
        decryption(form,MingWen,K2,K3,cipherNum);

    }*/
    public static void encryption(String MingWen,char[] form,int K1,int K2,int[] cipherNum){
        //第一步：将明文存入数组
        char[] pla=new char[MingWen.length()];
        for (int i = 0; i <MingWen.length() ; i++) {
            pla[i]=MingWen.charAt(i);
        }//已将明文存入字符数组pla中
        //第二步：通过脚标找到明文中每个字符对应的数，参与加密运算
        int[] MingWenNumber=new int[pla.length];
        for (int i = 0; i <pla.length ; i++) {
            for (int j = 0; j <form.length ; j++) {
                if (form[j]==pla[i]) {
                    MingWenNumber[i] = j;
                }
            }
        }
        //通过脚标将明文全部转化为数字
        char[] cipher = new char[MingWen.length()];//cipher密码数组 用来存储密文
        for (int i = 0; i <MingWen.length() ; i++) {
            int a= Math.floorMod((K1*MingWenNumber[i]+K2),26);
            cipherNum[i]=a;
            cipher[i]=form[a];
            //计算密文并存入数组中
        }
        System.out.println("加密结果是：");
        System.out.println(cipher);
    }

    public static void decryption(char[] form,String Mingwen,int K2,int K3,int[] cipherNum){
        char[] JieMI=new char[Mingwen.length()];
        for (int i =0;i<Mingwen.length();i++){
            JieMI[i]=form[Math.floorMod(K3*(cipherNum[i]-K2),36)];
        }
        System.out.println("解密结果是：");
        System.out.println(JieMI);
    }
}