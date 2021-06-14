package part_1;
import java.util.Locale;
import java.util.Scanner;
// глобальные определения 

public class Global {
    public static float InPutFloatVal(String msg) { //ввод вещественного числа float
        Scanner scanIn = new Scanner(System.in);    //создание объекта Scanner
        scanIn.useLocale(Locale.getDefault());      // Локальные настройки ОС
        float val=0;                                
        do{
            System.out.print(msg);
            if (scanIn.hasNextFloat()) {
                val = scanIn.nextFloat();
                break;
            } else scanIn.next();
        }while (true);
//---------------------
//        try {
//            scanIn = new Scanner(System.in);
//        } finally {
         //    if (scanIn != null) scanIn.close();
//        }
//---------------------
        return val;
    }
    //---------------------
    public static int InPutIntVal(String msg) {   //ввод вещественного числа  int
        Scanner scanIn = new Scanner(System.in);  //создание объекта Scanner
        scanIn.useLocale(Locale.getDefault());    
        int val = 0;                            
        do {
            System.out.print(msg);
            if (scanIn.hasNextInt()) {
                val = scanIn.nextInt();
                break;
            } else scanIn.next();
        } while (true);
        
   //     if (scanIn != null) scanIn.close();
        return val;
    }
//---------------------
public static int[] InPutCrds(String msg) { 	//ввод координат: массив из двух чисел типа int
    Scanner scanIn = new Scanner(System.in);  
    scanIn.useLocale(Locale.getDefault());    
    int[] crds;
    crds= new int[2];
   
    System.out.print(msg);
    crds[0] = scanIn.nextInt();
    crds[1] = scanIn.nextInt();
    if (scanIn != null) scanIn.close();
    return crds;
}
//---------------------



}