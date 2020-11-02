package lar4;

public class Test {
	public static void main(String args[]) {
		Doctor doctor1 = new Doctor();
		Doctor doctor2 = new Doctor();
		System.out.println("博士生1所交学费为"+doctor1.payFees(3000)+",学费查询"+doctor1.queryFees(5000)+"年收入为："+doctor1.getSalary(100000));
		System.out.println("博士生2所交学费为"+doctor2.payFees(2500)+",学费查询"+doctor2.queryFees(4500)+"年收入为："+doctor2.getSalary(150000));
	}

}
