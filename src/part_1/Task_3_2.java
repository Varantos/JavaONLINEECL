package part_1;

public class Task_3_2 {//РЅР° С†РµР»С‹С… С‡РёСЃР»Р°С…!
    public static void main(String[] args) {
        int[] xy = new int[2];
        int i=0,x=0, y=0, step=0;
        xy=Global.InPutCrds("Отрезок: ");
        step=Global.InPutIntVal("Шаг: ");

        for (x=xy[0]; x<=xy[1] ; x+=step){
            if (x<=2)  y=-x;
            if (x>2)   y=x;
            System.out.println("РПри x="+x+" y="+y);
        }

    }
}
