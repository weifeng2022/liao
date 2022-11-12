package git;			//a1

import java.util.*;

interface biao{
	//
    void print(int i);
	// 检查是否有 stuType对应的班级名额
    // 如果没有剩余名额，请返回 false ，否则学生将报名进入该班级并返回 true
    public boolean addStudent (int s);
}

class ren{
	int a,b,c;
	public ren(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getBig() {
		return a;
	}
	public int getMedium() {
		return b;
	}
	public int getSmall() {
		return c;
	}
}

public class school implements biao{
	ren r=new ren(1,1,0);
	public boolean addStudent(int s) {
		if(s==1) {
			if(r.getBig()>0) {
				int t=r.getBig();
				t--;
				r.setA(t);
				return true;
			}else return false;
		}else {
			if(s==2) {
				if(r.getMedium()>0) {
					int t=r.getMedium();
					t--;
					r.setB(t);
					return true;
				}else return false;
			}else {
				if(s==3) {
					if(r.getSmall()>0) {
						int t=r.getSmall();
						t--;
						r.setC(t);
						return true;
					}else return false;
				}else return false;
			}
		}
	}
	@Override
	public void print(int i) {
		System.out.print("[");
		System.out.print(addStudent(i));
		System.out.print("]");
	}
	public static void main(String []args) {
		school qw = new school ();
		ArrayList<Integer> plan =new ArrayList<Integer>();
		System.out.print("请输入入学人数：");
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		System.out.print("分别入学的班级：");
		for(int i=0;i<x;i++) {
			int q=sc.nextInt();
			plan.add(q);
		}
		for (int i = 0; i < plan.size(); i++) {
			qw.print((int)plan.get(i));
        }
	} 
	
}
