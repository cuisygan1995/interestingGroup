package interestingGroup.April04.pro2;

public class Triangle extends Shape{
    @Override
    public void shapeArea(float... args) {
        super.shapeArea(args);
        int n=0;
        float a=0,b=0,c=0;
        for(float i:args){
            n=n+1;
            if(n==1){
                a=i;
            }else if(n==2){
                b=i;
            }else if(n==3){
                c=i;
            }
        }
        if(n!=3){
            System.out.println("三角形为三边，参数应为三位数");
        }else if(a+b>c&&a+c>b&&b+c>a){
            float s=(a+b+c)/2+(a+b+c)%2;
            float k=s*(s-a)*(s-b)*(s-c);
            double area=Math.sqrt(k);
            System.out.println("三角形的面积为："+area);
        }else {
            System.out.println("三角形两边之和没有大于第三边");
        }
    }

    @Override
    public void shapePermeter(float... args) {
        super.shapePermeter(args);
        int n=0;
        float a=0,b=0,c=0;
        for(float i:args){
            n=n+1;
            if(n==1){
                a=i;
            }else if(n==2){
                b=i;
            }else if(n==3){
                c=i;
            }
        }
        if(n!=3) {
            System.out.println("三角形为三边，参数应为三位数");
        }else if(a+b>c&&a+c>b&&b+c>a){
            float L=a+b+c;
            System.out.println("三角形的周长为:"+L);
        }else {
            System.out.println("三角形两边之和没有大于第三边");
        }
    }

    public static void main(String []args){
        Triangle A=new Triangle();
        A.shapeArea(0,6,7);
        A.shapePermeter(0,6,5);
    }
}
