package lar4;

public class Test {
	public static void main(String args[]) {
		Doctor doctor1 = new Doctor();
		Doctor doctor2 = new Doctor();
		System.out.println("��ʿ��1����ѧ��Ϊ"+doctor1.payFees(3000)+",ѧ�Ѳ�ѯ"+doctor1.queryFees(5000)+"������Ϊ��"+doctor1.getSalary(100000));
		System.out.println("��ʿ��2����ѧ��Ϊ"+doctor2.payFees(2500)+",ѧ�Ѳ�ѯ"+doctor2.queryFees(4500)+"������Ϊ��"+doctor2.getSalary(150000));
	}

}
