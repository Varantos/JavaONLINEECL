package byepam.javaonline.part_1;
/* Задача 3.6 :
 *   Вывести  на экран соответствие между символами и их числовыми кодами в памяти компьютера
 */
public class Task1_3_6 { //UTF-8 ???
    public static void main(String[] args) {
        
        for (char c='А'; c<='Я'; c++) System.out.println("код="+(int)c+"\tсимвол="+c); //прописные
        
        System.out.println();
        
        for (char c='а'; c<='я'; c++) System.out.println("код= "+(int)c+"\tсимвол= "+c); //строчные
  
    }
}
//=================================================================================================
//Глобальная установка кодовой страницы для Эклипс. Все коды зависят от кодировки по умолчанию.
//-Dfile.encoding=cp1251 
//c:\Users\ADMINLIDER\eclipse\java-2021-03\eclipse\eclipce.ini