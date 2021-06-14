package part_1;
public class Task_2_2 {
    public static void main(String[] args) {
        int a = Global.InPutIntVal(" а: "); 
        int b = Global.InPutIntVal(" b: ");
        int c = Global.InPutIntVal(" c: ");
        int d = Global.InPutIntVal(" d: ");
        System.out.println("a="+a+"; b="+b+"; c="+c+"; d="+d);
        if (b<a) {
            a = b;
        } else if (a==b) System.out.print("(equal):: ");
        System.out.println("min(a,d)="+a);
        if (c>d) {
            c = d;
        } else if (c==d) System.out.print("(equal):: ");
        System.out.println("min(c,d)="+c);
        if (c>a) {
            a = c;
        } else if (c==a) System.out.print("(equal):: ");
        System.out.println("max(min(a,b),min(c,d))="+a);
     }

}
