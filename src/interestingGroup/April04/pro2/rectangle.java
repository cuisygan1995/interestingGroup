package interestingGroup.April04.pro2;

public class rectangle extends Shape{
    @Override
    public void shapePermeter(float... args) {
        super.shapePermeter(args);
        int n=0;
        float a=0,b=0;
        for(float i:args){
            n=n+1;
            if(n==1){
                a=i;
            }else if(n==2){
                b=i;
            }
        }
        if(n!=2){
            System.out.println("矩形为两边，参数应为两位数");
        }else if(a>0&&b>0){
            float L=(a+b)*2;
            System.out.println("矩形的周长为"+L);
        }else {
            System.out.println("矩形的两边没有大于0");
        }
    }

    @Override
    public void shapeArea(float... args) {
        super.shapeArea(args);
        int n=0;
        float a=0,b=0;
        for(float i:args){
            n=n+1;
            if(n==1){
                a=i;
            }else if(n==2){
                b=i;
            }
        }
        if(n!=2){
            System.out.println("矩形为两边，参数应为两位数");
        }else if(a>0&&b>0){
            float S=a*b;
            System.out.println("矩形的面积为"+S);
        }else {
            System.out.println("矩形的两边没有大于0");
        }
    }

    public static void main(String []args) {
        rectangle A = new rectangle();
        A.shapeArea(0, 4);
        A.shapePermeter(0, 4);
    }
}
