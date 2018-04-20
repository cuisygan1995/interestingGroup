package interestingGroup.April04.pro3;

public class Increment {
    public static void main(String []args){
        int i=2;
        int j=i++;

        if ((i==(++j))&&((i++)==j)){
        i+=j;
    }
        System.out.println("i="+i);
}
}