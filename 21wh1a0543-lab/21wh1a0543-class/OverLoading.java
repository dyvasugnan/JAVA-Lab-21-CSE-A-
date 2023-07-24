package classnotes_programs;

class OverLoading {
	
    int L;
    OverLoading(int l){
        L = l;
        System.out.println(L);
    }
    OverLoading(int l,int m){
        L = l+m;
        System.out.println(L);
    }
    OverLoading(int m,int n,int o){
        L = m*n*o;
        System.out.println(L);
    }
}
class Overloading
{
	public static void main(String[] args) {
		OverLoading d = new OverLoading(5,5,2);
		OverLoading d1 = new OverLoading(3,4);
	}
}












/*class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/
