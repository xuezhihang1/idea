import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* Main main = new Main();
        main.login();*/

        //登陆
       String[] user = Main.login();
        System.out.println("你的用户名是"+user[0]);
        System.out.println("你的密码是"+user[1]);

       //符文
        for (ziFuWen ziFuWen :fuWen.create()){
            System.out.println(ziFuWen.getName()+ziFuWen.getType()+ziFuWen.getColer());
        }
        while(true){
            List<ziFuWen> ziFuWens = fuWen.create();
            List<ziFuWen> has = choose(ziFuWens);
            if (has.size() == 0) {
                System.out.println("攻击：" + has.size());
            }
          //  int shuxing = 0;
            int gongji = 0;
            int fashu = 0;
            int fangyu = 0;
           /* for (ziFuWen ziFuWen : has) {
                shuxing += ziFuWen.getShuxing();
            }*/
            for (int i = 0; i < has.size(); i++) {
                if (i < 10) {
                    gongji += has.get(i).shuxing;
                }
                if (i > 10 && i < 20) {
                    fashu += has.get(i).shuxing;
                }
                if (i > 20 && i < 30) {
                    fangyu += has.get(i).shuxing;
                }
            }
            System.out.println("攻击：" + gongji);
            System.out.println("法术：" + fashu);
            System.out.println("防御：" + fangyu);
        }
    }


    //登陆
    public static String[] login(){
        System.out.println("请输入用户名");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("请输入密码");
        Scanner scannerp = new Scanner(System.in);
        String password = scannerp.next();


        String[] user = new String[2];
        user[0] = name;
        user[1] = password;


        return user;
    }


    //选择符文                                          所有符文
    public static  List<ziFuWen> choose(List<ziFuWen> ziFuWens){

        //所选择的符文
        List<ziFuWen> list = new ArrayList<>();

        //限制选择类型数量
        int xianzhihong = 10;
        int xianzhilan = 10;
        int xianzhilv = 10;

        System.out.println("请选择你想要的符文");

        //开始输入
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //获取输入的值
            int num = scanner.nextInt();

            //限制条件
            if (xianzhihong == 0 && xianzhilan == 0 && xianzhilv == 0 && num != 999 && num != 111) {
                System.out.println("请重新选择1");
            } else if (num == 999) {
                //确认
                return list;
            } else if (num == 111){
                //放弃
                list = new ArrayList<>();
                return list;
            }else {
                //继续选择
                if (num < 30 && xianzhihong > 0) {
                    list.add(ziFuWens.get(num));
                    System.out.println("您选择了第" + num + "个");
                    xianzhihong--;
                } else if (num > 30 && num < 60 && xianzhilan > 0) {
                    list.add(ziFuWens.get(num));
                    System.out.println("您选择了第" + num + "个");
                    xianzhilan--;
                } else  if(num > 60 && num < 94 && xianzhilv > 0) {
                    list.add(ziFuWens.get(num));
                    System.out.println("您选择了第" + num + "个");
                    xianzhilv--;
                } else {
                    //限制数组越界
                    System.out.println("请重新选择2");
                }
            }

        }
    }


}
