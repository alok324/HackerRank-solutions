import java.util.*;
public class halloweenSale {

	public static void main(String[] args) {
		int p,d,m,s;
		Scanner in=new Scanner(System.in);
		p=in.nextInt();
		d=in.nextInt();
		m=in.nextInt();
		s=in.nextInt();
		System.out.println(solution( p, d,m, s));

	}
	static int solution(int p,int d,int m, int s){
		int count=0,  total=0;
		total=p;
		while(total<=s){
			p=p-d;
			if(p<=m)
			{
			total=total+m;
			count++;
			}
			else
				{
				total=total+p;
				count++;
				}
		} 
		return count;
}
}
