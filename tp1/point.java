
class point {
	private int abs;
	private int ord ;
	private char nom;
	
	point (int x , int y , char c){
		abs=x;
		ord=y;
		nom=c;
	}
	point (int x , char c){
		abs=x;
		ord=2*x;
		nom=c;
	}
	void trans_horz(int d) {
		abs+=d;
	}
	void trans_vert(int d) {
		ord+=d;
	}
	void trans(int d , int d1) {
		abs+=d;
		ord+=d1;
	}
	void affiche() {
		System.out.println(nom+"(" + abs + ", " + ord + ")");
	}
}