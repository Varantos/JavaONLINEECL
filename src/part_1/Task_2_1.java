package part_1;
public class Task_2_1 {
    // Существует ли треугольник по двум углам. Будет ли он прямоугольным? 
    public static void main(String[] args) {
        int Corner1=Global.InPutIntVal("Угол 1 треугольника(в градусах): ");
        int Corner2=Global.InPutIntVal("Угол 2 треугольника(в градусах): ");
        if ( (Corner1+Corner2) <=180 )
            System.out.println("Можно построить треугольник!"); else System.out.println("Не получится треугольник.");
        if ( (180-(Corner1+Corner2))==90 )
            System.out.println("Будет прямоугольный треугольник!"); else System.out.println("Не получится прямоугольный треугольник.");

        }
    }


