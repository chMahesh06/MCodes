package PracticePackage;

public class InterfaceDemoMain implements InterfaceDemo, InterfaceDemo1 {



@Override
public void print() {
	System.out.println("it is a print method ");
}

@Override
public void copy() {
	System.out.println("it is a copy method ");
	
	
}
public static void main(String[] args) {
	InterfaceDemoMain obj= new InterfaceDemoMain();
	
	obj.copy();
	obj.print();
	
}
}
