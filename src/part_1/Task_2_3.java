package part_1;

public class Task_2_3 {
    public static void main(String[] args) {
        System.out.println("принадлежат ли точки одной прямой? вводите координаты через пробел.");
        if (SolveMath( Global.InPutCrds("Точка А: "), Global.InPutCrds("Точка B: "), Global.InPutCrds("Точка C: ") )==0)
            System.out.print("Принадлежат одной прямой!");
                else System.out.print(" Не принадлежат одной прямой.");

    }
    private static int SolveMath(int[] pnt1, int[] pnt2, int[] pnt3) {  //СЂР°СЃСЃС‡РµС‚ РјР°С‚РµРјР°С‚РёС‡РµСЃРєРѕРіРѕ РІС‹СЂР°Р¶РµРЅРёСЏ
        System.out.print("Тогчки A("+pnt1[0]+","+pnt1[1]+"); B("+pnt2[0]+","+pnt2[1]+"); C("+pnt3[0]+","+pnt3[1]+")");
        return  (pnt1[0]-pnt3[0])*(pnt2[1]-pnt3[1])-(pnt2[0]-pnt3[0])*(pnt1[1]-pnt3[1]);
    }

}
