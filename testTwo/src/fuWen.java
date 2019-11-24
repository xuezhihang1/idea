import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/11/23 21:28
 * @Description:
 */
public class fuWen {
   public  String name;
    public String coler;
    public  String type;
    public int shuxing;

    public fuWen(String name, String coler, String type,int shuxing) {
        this.name = name;
        this.coler = coler;
        this.type = type;
        this.shuxing = shuxing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColer() {
        return coler;
    }

    public void setColer(String coler) {
        this.coler = coler;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getShuxing() {
        return shuxing;
    }

    public void setShuxing(int shuxing) {
        this.shuxing = shuxing;
    }

    //创建
    public static List<ziFuWen> create(){

        List<ziFuWen> ziFuWens = new ArrayList<>();
        String yongqi = "勇气";
        String yonggan = "勇敢";
        for (int i=1; i < 30; i++) {
            ziFuWen ziFuWen = new ziFuWen("符文"+i,"红色"+i,"攻击",1);
            if (i > 5) {
                ziFuWen.setName(yongqi);
                ziFuWen.setType("法术");
            }
            if (i > 10) {
                ziFuWen.setName(yonggan);
                ziFuWen.setType("法术");
            }
            ziFuWens.add(ziFuWen);
        }
        for (int i=30; i < 60; i++) {
            ziFuWen ziFuWen = new ziFuWen("符文"+i,"蓝色"+i,"攻击",2);
            ziFuWens.add(ziFuWen);
        }
        for (int i=60; i <90; i++) {
            ziFuWen ziFuWen = new ziFuWen("符文" + i, "绿色" + i, "攻击",3);
            ziFuWens.add(ziFuWen);
        }
        return ziFuWens;
    }

}
