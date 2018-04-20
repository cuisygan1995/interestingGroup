package interestingGroup.April04.pro2;

public class Round extends Shape {
    @Override
    public void shapePermeter(float... args) {
        super.shapePermeter(args);
        int n=0;
        float a=0;
        for(float i:args){
            n=n+1;
            if(n==1){
                a=i;
            }
        }
        if(n!=1){
            System.out.println("圆的半径，参数应只有一个");
        }else if(a>0){
            double L=2*3.14*a;
            System.out.println("圆的周长为"+L);
        }else {
            System.out.println("圆的半径没有大于0");
        }
    }

    @Override
    public void shapeArea(float... args) {
        super.shapeArea(args);
        int n=0;
        float a=0;
        for(float i:args){
            n=n+1;
            if(n==1){
                a=i;
            }
        }
        if(n!=1){
            System.out.println("圆的半径，参数应只有一个");
        }else if(a>0){
            double S=3.14*a*a;
            System.out.println("圆面积为"+S);
        }else {
            System.out.println("圆的半径没有大于0");
        }
    }

    public static void main(String []args) {
        Round A = new Round();
        A.shapeArea(0);
        A.shapePermeter(0);
    }
}
