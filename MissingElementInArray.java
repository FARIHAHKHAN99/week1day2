package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= new int [] { 1,2,3,4,6,7,8};
Arrays.sort(arr);

for (int i=1 ; i<arr.length;i++) {
	if (i!=arr[i-1]) {
		System.out.println(i);
		break;
	}
}
	}

}
