package part_1;
//вычисление функции на промежутке с шагом

public class Task_3_5 {
    public static void main(String[] args) {
        int i=0;
        double n;
        double e;
        double a=0;
        double sum=0;
        n=Global.InPutFloatVal("Введите предел числового ряда n: ");
        e=Global.InPutFloatVal("введите число е: ");
         while (i<=n){
            a=1/Math.pow(2,i)+1/Math.pow(3,i);
            if (Math.abs(a)>=e) sum=sum+a;
            i++;
        }
        System.out.println("Сумма: "+sum);
    }


}
