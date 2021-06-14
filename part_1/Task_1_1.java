package part_1;

public class Task_1_1 {
    public static void main(String[] args) {
        float a=0,b=0,c=0;
        String msg[]=new String[3];
        msg[0]=" a: ";     
        msg[1]=" b: ";
        msg[2]=" c: ";
        a=Global.InPutFloatVal(msg[0]); 
        b=Global.InPutFloatVal(msg[1]);
        c=Global.InPutFloatVal(msg[2]);
        System.out.println("a="+a+"; b="+b+"; c="+c);   
        System.out.println("z= "+SolveMath(a, b, c) ); 
    }

    private static float SolveMath(float a, float b, float c) {  
        float rez=0;
        rez=((a-3)*b/2)+c;
        return rez;
    }




}
