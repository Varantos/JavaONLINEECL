package part_1;
public class Task_1_5 {
    public static void main(String[] args) {
        int T=Global.InPutIntVal("Введите время Т в секундах: ");
        System.out.print("Время: "+SolveMath(T));
    }
    private static String SolveMath(int x) {
        int sec=0,mins=0,hrs=0;
        String ssec="",smins="",shrs="",Srez="";
        hrs=x/3600;
        mins=(x/60)%60;
        sec=x%60;
        if (hrs <10) {  shrs=  "0"+Integer.toString(hrs); } else shrs=Integer.toString(hrs);
        if (mins<10) {  smins= "0"+Integer.toString(mins);} else smins=Integer.toString(mins);
        if (sec <10) {  ssec=  "0"+Integer.toString(sec); } else  ssec=Integer.toString(sec);
        Srez=shrs+"ч. "+smins+"мин. "+ssec+"сек. ";
        return Srez;
    }
}
