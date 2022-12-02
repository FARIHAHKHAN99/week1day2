package week1.day2;



public class NegvetoPosve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num= -40;
int result = 1;

if (num<0) {
	System.out.println(num+"is negative");

	result=-result*num;
	System.out.println(num + "is converted to"+ result);
}
else {
	System.out.println(num+"is positive");
}
	}

}
