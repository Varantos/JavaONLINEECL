package byepam.javaonline.part_3;

/* ������ 3.1.4
 * � ������ ����� ���������� �����. 
 */
public class Task3_1_4 {
	public static char[] NUMBERS="1234567890".toCharArray();
	
	static int findNUM( int cnt, char[] str ){ // ���� ������ ���� 
		int k=cnt; 
		int dgds=0;
		while (k < str.length) {
			if ( Character.isDigit(str[k]) ) dgds++;
			if (str[k]=='.' ) dgds++ ;
			if (Character.isDigit(str[k+1])) dgds++; 
				else break;
			k++;	
		}	
	return dgds;	
	}
	
	public static void main(String[] args) {
		char[] str = "w222.99ordfkwor77.7kgjdflkwo w.rdvg32vwewe word  ogwo-888rk".toCharArray();
		int nums=0;
		int j=0;
		int i=0;

		while (i < str.length) {
			if(  Character.isDigit(str[i]) ) { //������� �����!
				nums=findNUM(i,str);	// ������� ����� � �������� �����
				i=i+nums; 				// ���������� �� ���������� ���� � �������� ������
				j++;					// ������� ����� �����������
			};
			i++; 						//������� �� ��������� ������ ������ ����� ���������� �����
			}
		System.out.println("������: "+new String(str));
			System.out.println("����� � ������: "+j);
	}
}