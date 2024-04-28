// Ex10_5
class Triangle{
    protected int base;   
    protected int height;
     
    protected void show(){
       System.out.println("base="+base+", height="+height);
    }     
 }
class Data extends Triangle{
    public Data(int b, int h){
        base=b;
        height=h;
    }
    public void area(){
        super.show();
        System.out.printf("area=%6.2f",(double)base*height/2);
    }
}
public class Ex10_5{
    public static void main(String[] args){
        Data obj=new Data(3,8);
        obj.area();
    }
}

/* output--------
base=3, height=8
area= 12.00
---------------*/