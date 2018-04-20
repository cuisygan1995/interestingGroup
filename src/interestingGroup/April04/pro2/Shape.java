package interestingGroup.April04.pro2;

public class Shape{
    public void shapeArea(float... args){
        for(float arg:args){
            if(arg<=0){
                System.out.println("请输入大于0的数字");
                break;
            }
        }
    }
    public void shapePermeter(float... args){
        for(float arg:args){
            if(arg<=0){
                System.out.println("请输入大于0的数字");
                break;
            }
        }
    }

    public static void main(String []args){
        Shape one=new Shape();
        one.shapePermeter(1,2);
    }
}

