package part_1;

public class Task_2_5 {
    public static void main(String[] args) {
        float x;
        x=Global.InPutFloatVal("Введите Х: ");
        System.out.println("При x="+x+" F(x)="+SolveMath(x));
    }
    private static float SolveMath(float x) {  
        float rez=0;
        if (x <= 3) rez=x*x-38*x+9;
        if (x>3)    rez=1/(x*x*x+6);
        return rez;
    }
}
