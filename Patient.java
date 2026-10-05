package javaproject;

 class DemoA {
	void cancer()
	{
		System.out.println("I am having cancer");
	}

}
public class Patient extends DemoA {
	public static void main (String []args) {
		Patient tt=new Patient();
		tt.cancer();
	}
}
