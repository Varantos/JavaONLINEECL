package part_1;

public class Task_2_4 {
    public static void main(String[] args) {
        System.out.println("Задача про кирпич!");
        int a=Global.InPutIntVal("Длинна отверстия а: "); 	//Отверстие
        int b=Global.InPutIntVal("Ширина отверстия b: ");
        int x=Global.InPutIntVal("Длинна кирпича х: "); 	//Кирпич
        int y=Global.InPutIntVal("Длина кирпича  y: ");
        int z=Global.InPutIntVal("Высота кирпича z: ");
        System.out.println("Размеры отверстия: a="+a+"; b="+b);
        System.out.println("Размеры кирпича: x="+x+"; y="+y+"; z="+z);
        if( ((x<=a)&&(y<=b)) || ((x<=b)&&(y<=a)) || ((x<=a)&&(z<=b)) || ((x<=a)&&(z<=b)) || ((z<b)&&(x<a)) ||((y<a)&&(z<b)) || ((z<b)&&(y<a)) )
            System.out.print("Кирпич пройдет!");
        else  System.out.print("Кирпич не пройдет!");
    }



}
