package interestingGroup.April04.pro3;

public class Operator {
    public static void main(String []args){
        boolean flagOne=10%2==1&&10/3==0&&1/0==0;
        System.out.println(flagOne? "Developer":"Tester");

        boolean flagTwo=10%2==0&&10/3==3&&2/1==1;
        System.out.println(flagTwo? "Developer":"Tester");

        boolean flagThree=10%2==0&&10/3==3||2/1==1;
        System.out.println(flagThree? "Developer":"Tester");
    }
}
