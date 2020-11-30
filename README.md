# lar3第三次实验报告

#### 实验目的
1.掌握Java中抽象类和抽象方法的定义； 

2.掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法

3.了解异常的使用方法，并在程序中根据输入情况做异常处理
***

#### 实验过程
1.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括

缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。

2。设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性

别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）

3.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根

据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。
***

#### 实验要求
1.在博士研究生类中实现各个接口定义的抽象方法;

2.对年学费和年收入进行统计，用收入减去学费，求得纳税额；

3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。

4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值
***

#### 核心代码

//学生接口

public interface Student {

	public abstract int payFees(int x);
	
	public abstract int queryFees(int y);

}
***
//老师接口

public interface Teacher {

       public abstract int getSalary(int m);
       
       public abstract int querySalary(int n);
       
}
***
//实现接口中的全部方法

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
 ***   
    
 #### 编程感想
 本次实验尝试了编写接口类，运用抽象类方法，在调试错误中记住了以下知识点
 
 1.权限修饰符只可以使用public和默认的两种
 
 2.接口中的抽象方法必须通过一个类来实现
 
 3.如果一个类没有实现接口中的所有抽象方法，则该类必须为抽象类
