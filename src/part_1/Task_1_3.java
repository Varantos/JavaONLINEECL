package part_1;
public class Task_1_3 {
    public static void main(String[] args) {
        double x=Global.InPutFloatVal(" x: ");
        double y=Global.InPutFloatVal(" y: ");
        System.out.println("x="+x+"; y="+y);
        System.out.println("z= "+SolveMath(x,y) );
    }
    
    private static double SolveMath(double x, double y) {
       double r1=0,r2=0,res=0;
       r1=Math.sin(x)+Math.cos(y);
       r2=Math.cos(x)-Math.sin(y);
       if (r2!=0) {
            res = r1/r2*Math.tan(x*y);
       }else System.out.println("деление на ноль!");
       return res;
    }


}
