package javaproject;
//OOPS
//inheritance,polymor 1) over load/overrding
//,encap,abst
class Abc
{
	void cancer()
	{
		System.out.println(" i am having cancers");
		
	}
}

public class Test extends Abc {
public static void main(String[] args) {
	Test   gg = new Test();
gg.cancer();}
}
