package interestingGroup.April19.pro1;

import java.util.*;

public class test {
    public boolean Match(Set set){
        //过滤一部分不满足条件的

        Set<String> match1=new HashSet<>();
        Set<String> match2=new HashSet<>();
        Set<String> match3=new HashSet<>();
        Set<String> match4=new HashSet<>();
        match1.add("薄外套");//只有外套的去掉
        match2.add("厚外套");
        match3.add("薄外套");//用来取交集，交集后存在两个外套的也去掉
        match3.add("厚外套");
        match4.add("T恤");//用来取交集，交集后存在两个内搭的也去掉
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

    public boolean input(String temper){
        if(!temper.matches("[0-9]+([.]{0,1}[0,9]{0,1}){0,1}$")){
            System.out.println("请输入整数或者小数点后一位 ");
            return false;
        }else if((Float.valueOf(temper)<10)||(Float.valueOf(temper)>30)) {
            System.out.println("只提供 10-30°C 的穿衣搭配");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
//        Set<String> clothes=new TreeSet<>();
//        Set<String> clothes2=new TreeSet<>();
//        clothes.add("T恤");
//        clothes.add("长袖");
//        clothes.add("薄外套");
//        clothes.add("卫衣");
////        clothes2.add("薄外套");
////        clothes2.add("T恤");
////        clothes.retainAll(clothes2);
////        System.out.println(clothes.size());
////        clothes.retainAll(clothes2);
////        System.out.print(clothes);
//
        test test1=new test();
//        if(test1.Match(clothes)==true){
//            System.out.print("true");
//        }else {
//            System.out.print("false");
//        }

//        System.out.println("请输入当天最低温度：");
//        Scanner scan=new Scanner(System.in);
//        String low=scan.next();

    }
}
