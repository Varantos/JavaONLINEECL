package part_1;


public class Task_3_3 {
    public static void main(String[] args) {
        int count=0,rez=0;

        while (count <= 100) {
            rez+=count*count;
            count++ ;
                }

        System.out.println("Сумма квадратов первых ста целых чисел: "+ rez);
    }

}
