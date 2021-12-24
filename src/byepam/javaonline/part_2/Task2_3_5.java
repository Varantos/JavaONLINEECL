package byepam.javaonline.part_2;
/* ������ 3.5
* 	 ���������� ���������
*   ���� ������������������ �����: �(1),�(2),�(3), ... �(n). ��������� ����������� ����� � ������� �����������.  
*   ��������  ���  ���������  �������.  
*   ����� �(1),�(2),�(3), ... �(i) - �������������  ������������������, �.�.  �������  ���������  ����� a(i+1)
*   �  �����������  �  ������������������  ���,  �����  ����� ������������������ ���� ���� ������������. 
*   ������� ������������ �� ��� ���, ���� ��� �������� ��  i  �� n �� ����� ���������. 
*   ����������. ����� ��������� ���������� �������� � ��������������� ����� ����������� � ������� ��������� ������. 
*   �������� ����� �������� � ���� ��������� �������. 
*/
import global.Global;

public class Task2_3_5 {
	public static void main(String[] args) {
		int n=9;
		
		int i=0;		
		int j=0;
	
		int ins=0;
		int tmp=0;
		
		int[] a = new int[n];	// ������� � ��������� ������ ������
		a = Global.GenVectorInt_rnd(n);  //��������� � ������� ������ ��������
		

		System.out.println();
		
		for (i = 1; i < n; i++) {
		        ins = BinarySearch5 (a, 0, i, a[i]);
		        tmp = a[i];
		        for (j=i-1; j >=ins; j--)
		          a[j+1]=a[j];
		          a[ins]=tmp;
		    }
		System.out.println("������������� ��������� � �������� �������");
		for (i=0;i<=a.length-1;i++) System.out.print("\t"+a[i]);
	}
	
	//---------------------�������� ����� �������� � �������
	/* 	�����������: ������ ����������.
	 *  ����: ����������� �����, ������� ����� ����� ������ ���, �� ������� ���������. 
	 *  ���� ��� ������, ��� ������� �������, ��� ����� ������� �����, ���� ��� ������,
	 *  ��� ������� �������, ��� ����� ������� ������.
	 */

//----------------------------------------------------------------
static int BinarySearch5 (int a[], int low, int high, int key){
    int mid;
    mid=low+((high-low)/2);
    
    if (low==high)
        return low;

    if (key>a[mid])
        return BinarySearch5 (a, mid+1, high, key);
    else if (key < a[mid])
        return BinarySearch5 (a, low, mid, key);

    return mid;
}

}
