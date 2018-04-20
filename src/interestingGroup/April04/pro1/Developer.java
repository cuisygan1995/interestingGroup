package interestingGroup.April04.pro1;

public class Developer {
    public String name;
    public int id;
    public String position;
    public Developer(String name,int id,String positon){
        System.out.println("开发攻城狮已打卡");
        System.out.println(name+"工号为"+id+"是"+positon);
        System.out.println("他会写代码");
    }

    public static void main(String []args){
        Developer person=new Developer("贺聪",1001,"开发攻城狮");
    }
}
