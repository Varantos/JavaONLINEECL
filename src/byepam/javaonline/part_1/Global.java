package part_1;

import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;


public class Global {


  
	public static <scanInr> float InPutFloatVal(String msg) { //ввод вещественного числа типа float
		float val=0;                              //объявляем и инициализируем переменноую для вещественного числа
		
	//	Scanner scanIn;
		 
		Scanner scanIn = new Scanner(System.in);

		
//		scanIn.useLocale(Locale.getDefault());      // локальные настройки ОС
			do{
			    System.out.print(msg);
			    if (scanIn.hasNextFloat()) {
			        val = scanIn.nextFloat();
			        break;
			    } else scanIn.next();
			}while (true);
			 		
//---------------------
		
	   //try {
         // scanIn = new Scanner(System.in);
    //  } finally {
		
    	  //if (scanIn != null)	 scanIn.close();
       //}
//---------------------
			
	
		
			
			
return val;
    }
    //---------------------
    public static int InPutIntVal(String msg) { //ввод целого числа типа int
        Scanner scanIn = new Scanner(System.in);  //создание объекта типа Scanner
        scanIn.useLocale(Locale.getDefault());    // локальные настройки ОС
        int val = 0;                            //объявляем и инициализируем переменноую для вещественного числа
        do {
            System.out.print(msg);
            if (scanIn.hasNextInt()) {
                val = scanIn.nextInt();
                break;
            } else scanIn.next();
        } while (true);
        return val;
    }
//---------------------



}
