package interestingGroup.April19.pro1;

import sun.security.util.Length;
import java.awt.List;
import java.util.*;

public class weather {

    public boolean input(String temper){
        //判断输入的温度是否合法

        if(!temper.matches("^[0-9]+(\\.\\d{0,1})?")){ //[1-9]+((\.{0,1}[0,9]{0,1}))?
            System.out.println("请输入整数或者小数点后一位 ");
            return false;
        }else if((Float.valueOf(temper)<10)|(Float.valueOf(temper)>30)) {
            System.out.println("只提供 10-30°C 的穿衣搭配");
            return false;
        }
        return true;
    }

    public Set<String> clothes(float lowest,float high){
        //返回在一个温度下的所有可供选择衣服集合

        Map map=new HashMap();
        map.put("26-35","T恤");
        map.put("10-26","长袖");
        map.put("18-30","薄外套");
        map.put("10-19","厚外套");
        map.put("20-25","卫衣");
        Set<String> clothes=new TreeSet<>();
        for(Object i:map.keySet()){
            String range=String.valueOf(i);
            String[] temrange=range.split("-");
            if((lowest>=Float.valueOf(temrange[0])&&(lowest<Float.valueOf(temrange[1])))){
                clothes.add(String.valueOf(map.get(i)));
            }
            if((high>=Float.valueOf(temrange[0])&&(high<Float.valueOf(temrange[1])))){
                clothes.add(String.valueOf(map.get(i)));
            }
            if((lowest<Float.valueOf(temrange[0])&&(high>=Float.valueOf(temrange[1])))){
                clothes.add(String.valueOf(map.get(i)));
        }
        return clothes;
    }

    public Set[] subclothes(Set set){
        //返回集合的子集合数

        //将衣服放入clothList列表
        int n=set.size();
        Object[] clothList=new Object[n];
        int i=0;
        for(Object r:set){
            clothList[i]=r;
            i=i+1;
        }

        int sum=(int)Math.pow(2,n)-1; //集合的子集合总个数为2^n-1
        //遍历位循环，找出所有匹配
        Set[] allClothList=new Set[sum];
        int j=1;
        while(j<=sum){
            String str=Integer.toBinaryString(j );//将数字转化为二进制数
            String []list=str.split("");//将二进制拆分成数组
            int L=clothList.length-list.length;//将数组中的数对应列表组合
            Set<Object> onetype=new TreeSet<>();
            for(String a:list){
                if(Integer.valueOf(a)==1){
                    onetype.add(clothList[L]);
                }
                L=L+1;
            }
            allClothList[j-1]=onetype;
            j=j+1;
        }
        return allClothList;
    }

    public boolean match(Set set){
        //判断搭配是否满足基础条件（不考虑温差）

        Set<String> match1=new HashSet<>();
        Set<String> match2=new HashSet<>();
        Set<String> match3=new HashSet<>();
        Set<String> match4=new HashSet<>();
        match1.add("薄外套");//只有外套的去掉
        match2.add("厚外套");
        match3.add("薄外套");//用来取交集，交集后存在两个外套的去掉
        match3.add("厚外套");
        match4.add("T恤");//用来取交集，交集后存在两个内搭的去掉
        match4.add("长袖");
        if(set.size()==1){
            match1.retainAll(set);
            switch (match1.size()){
                case 1:
                    return false;
                case 0:
                    match2.retainAll(set);
                    if (match2.size()==1){return false;}
            }
        }else {
            match3.retainAll(set);
            switch (match3.size()){
                case 2:
                    return false;
                default:
                    match4.retainAll(set);
                    if (match4.size()==2){return false;}
            }
        }
        return true;
    }

    public static void main(String []args){
        weather chooseClothes=new weather();

        System.out.println("请输入当天最低温度：");
        Scanner scan=new Scanner(System.in);
        String low=scan.next();
        if(chooseClothes.input(low)){
            float lowest=Float.valueOf(low);
            System.out.println("请输入当天最高温度：");
            Scanner scan2=new Scanner(System.in);
            String high=scan2.next();
            if(chooseClothes.input(high)){
                float highest=Float.valueOf(low);
                System.out.println("在温度范围内的所有衣服有：");
                Set clothset=chooseClothes.clothes(lowest,highest);
                System.out.println(clothset+"\n");
                System.out.println("在温度范围内的衣服形成的子集合有：");
                Set[] subclo=chooseClothes.subclothes(clothset);
                for(Set m:subclo){System.out.print(m);}
                System.out.println("\n");
                System.out.println("满足所有条件下，可搭配的衣服有");
                Set<Object> rightClothes=new HashSet<>();
                for(Set m:subclo){
                    if(chooseClothes.match(m)){
                        if (highest-lowest>=10){
                            if (m.size()>=2){
                                rightClothes.add(m);
                            }
                        }else {
                            rightClothes.add(m);
                        }
                    }

                }
                System.out.println(rightClothes);
            }else{
                System.out.println("输入不合法，请重新启动程序" );}
            }else{
            System.out.println("输入不合法，请重新启动程序" );
        }
        }


}
