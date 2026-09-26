public class test {
	public static void main(String[] args) {
		point p=new point(0,0,'O');
		
		point p1 = new point(1,1,'P');
		point p2 = new point (3 , 1,'A');
		point p3=new point (4,'B');
		
		
		p.affiche();
		p1.affiche();
		p2.affiche();
		p3.affiche();
		
		
		System.out.println("---------------");
		
		
		p.trans_vert(5);
		p1.trans_horz(3);
		p2.trans(2, 4);
		p3.trans_horz(4);
		
		
		p.affiche();
		p1.affiche();
		p2.affiche();
		p3.affiche();
		
		
	}
}
