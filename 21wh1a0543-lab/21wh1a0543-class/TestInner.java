package classnotes_programs;

class OuterTest{
	class Inner{
		void show() {
			System.out.println("Inner class");
		}
	}
}



class TestInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterTest.Inner inn = new OuterTest().new Inner();
		inn.show();

	}

}
