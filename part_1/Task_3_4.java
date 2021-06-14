package part_1;
import java.math.BigInteger;
public class Task_3_4 {
    public static void main(String[] args) {
        BigInteger rez      = new BigInteger("1");
        BigInteger kvdr     = new BigInteger("1");
        BigInteger count    = new BigInteger("1");
        BigInteger stp      = new BigInteger("1");
        int n=Global.InPutIntVal("Введите колличество чисел: ");
        while (count.longValue() <= n) {
            kvdr=count.multiply(count);
            rez = rez.multiply(kvdr);
            System.out.println("rez_kv="+kvdr.toString()+" rez="+rez.toString()+" cnt="+count.toString());
            count=count.add(stp) ;
        }
        System.out.println("Произведение квадратов первых "+n+" целых чисел: "+ rez);
    }
}
