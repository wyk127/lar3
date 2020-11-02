package lar4;

public class Doctor implements Student,Teacher{
      String name;
      String sex;
      int age;
      public int payFees(int x) {
    			  return x;
      }
      public int queryFees(int y) {
    	  return y;
    	  }
	public int getSalary(int m) {
		
		return m;
	}
	public int querySalary(int n) {
		return n;
	}

}
