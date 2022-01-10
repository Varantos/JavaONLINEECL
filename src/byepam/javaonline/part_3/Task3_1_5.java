package byepam.javaonline.part_3;

/* Задача 3.1.5
 * Удалить  в  строке  все  лишние  пробелы,  то  есть  серии  подряд  идущих  
 * пробелов  заменить  на  одиночные  пробелы. Крайние пробелы в строке удалить
 */
public class Task3_1_5 {
	public static char[] str = "    React Native combines    the best parts   of native   development with   React, a best-in-class    JavaScript library for building user interfaces.  ".toCharArray();
	
//	usefulspace - полезные пробелы - usflspc
//	unusefulspase - бесполезные пробелы

	static int countingSpaces(int cnt, char[] str ){ // считаем пробелы
		int spcs=0;
		int k=cnt;
		while (k < str.length) {
		  if ( Character.isSpaceChar(str[k])  ) spcs++;
		  if( Character.isLetterOrDigit(str[k]) ) break;
			  
		k++;
		}
		
		
	//	System.out.println("пробелы: "+spcs);
		return spcs;
	}
	
	
	public static void main(String[] args) {
		
		int ss= countingSpaces(0,str); 
		int i=0;
		
		while (i < str.length) {
			if(Character.isSpaceChar(str[i]) ) {
				ss= countingSpaces(i,str); 
				System.out.println("пробелы: "+ss);
			
			}
			i++;
		}
		
	}
}
