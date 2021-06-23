package byepam.javaonline.part_2;
/* Задача 2.1
 *   В массиве A[N] занесены натуральные числа.
 *   Найти сумму тех элементов, которые кратны данному К.
 */
import global.Global;
public class Task2_1_1 {
	public static void main(String[] args) {
		int   cnt=0;
		int   sum=0;
		int   n	 =Global.InPutIntVal("введите размерность массива n: "); 	// задаем размерность массива
		int   k	 =Global.InPutIntVal("введите число k: "); 				// задаем число k
		int[] a  =new int[n]; 											// объявляем и инициализируем массив
		
		System.out.print("Массив:  ");
		a= Global.GenVectorInt_rnd(n);// заполняем массив случайными целыми значениями в пределах 100
		
		System.out.print("\n"+"Кратные: "); 
		for (cnt=0;cnt<=n-1;cnt++) { 			// перебираем элементы массива
			if ( a[cnt]%k ==0 ) {				// проверяем кратность каждого элемента
				System.out.print(a[cnt]+"  ");	// вывод в консоль кратных
				sum=sum+a[cnt];					// подсчет суммы кратных
			}
		}
		System.out.print("\nСумма кратных элементов: "+sum); //выводим сумму
	}
}
