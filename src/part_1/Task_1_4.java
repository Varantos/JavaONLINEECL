package part_1;
public class Task_1_4 {
    public static void main(String[] args) {
       float  ValueX;
       ValueX=Global.InPutFloatVal("Введите вещественное число вида nnn.xxx: ");;
       System.out.print( "REZ="+SolveMath(ValueX)  );
    }
    private static double SolveMath(float x) {
        return (int)x*0.001 + Math.round( ( ( x-(int)x)*1000 ) );
    }

}
