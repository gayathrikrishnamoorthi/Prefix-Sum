package gayathri;

import java.util.Scanner;
 
public class Prefix {
	static int n;
	public static int[] pre_fix(int arr[])
	{
		int b[] = new int[n];
		b[0]=arr[0];
		for(int i=1;i<n;i++) {
			b[i]=b[i-1]+arr[i];
		}
		return b;
	}
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]= new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int pre[]=pre_fix(arr);
		for(int i=0;i<n;i++) {
			System.out.println(pre[i]+" ");
		}
	}

}
