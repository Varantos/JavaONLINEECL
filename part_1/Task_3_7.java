package part_1;
//найти все делители для каждого числа из промежутка [m,n] кроме самого числа и 1
public class Task_3_7 {
    public static void main(String[] args) {
        int n=0;
        int m=0;
        int j=0,i=1;
        n=Global.InPutIntVal("Начало проиежутка: n: ");
        m=Global.InPutIntVal("Конец  промежутка: m: ");
        i=n;  
        while(i<=m) { //факторизация числа -разложение на простые множители
        	System.out.print(i+" :::");
        	SolveDelitels(i);
        	System.out.println();
         	i++;
        } 
}


private static void SolveDelitels( int cnt) {
   int[] rez;
   int i=0,j=2;
   while (j<=(cnt-1)) { 
	   if (cnt % j==0) { 
		   System.out.print(" "+cnt/j);
		   i++;
	   }
	   j++; 
   }
 }
}


