package part_1;

public class Task_3_1 {
    public static void main(String[] args) {
        int x = Global.InPutIntVal("¬ведите число: ");
        int i=0,r=0;

        for(i=0;i<=x;i++) r=r+i;
        System.out.println("—умма: "+ r);
    }
}
