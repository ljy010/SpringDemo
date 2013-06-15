package test.ioc;

public class ClassB {

	private ClassA a;
	
	public ClassB(){
		
	}
	
	public ClassB(ClassA a){
		this.a = a;
	}
	
	public ClassA getA() {
		return a;
	}


	public void setA(ClassA a) {
		this.a = a;
	}


	public void print(){
		System.out.println("this is b");
		a.print();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
