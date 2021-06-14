package part_1;
public class Task_1_2 {
    public static void main(String[] args) {
       double a=Global.InPutFloatVal(" а: ");
       double b=Global.InPutFloatVal(" b: ");
       double c=Global.InPutFloatVal(" c: ");

       System.out.println("a="+a+"; b="+b+"; c="+c);
       System.out.println("z= "+SolveMath(a, b, c) );
    }

    private static double SolveMath(double a, double b, double c) {
        double rez = 0, rrt=0;
        rrt=Math.pow(b,2)+4*a*c;
        if (rrt<0) {
            System.out.print("Ошибка: минус под корнем!");
            return 0;
        }
         if (a==0){
             System.out.println("деление на ноль!");
            return 0;
        }
        rez =  ( b + Math.sqrt(rrt) ) / (2*a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        return rez;
    }

    }