package first;

public class Emp {
	String name;
	int empid;
	String address;
	int mobile;
	double sal;

	public void add_emp(String n,int e,int m,String a){
		name =n;
		empid=e;
		mobile=m;
		address=a;
		}
	public void display() {
		System.out.println("ename:"+ name +"\temp_id:" + empid + "\tmobile"+ mobile + "\taddress\t"+address);
		
	}

	public void cal(double s)
	{
		
		sal=s;
		double toto_sal = 0.10 * sal + 0.15;
		System.out.println("salary=" + toto_sal);
	}
	public static void main(String[] args) {
		Emp e = new Emp() ;
				e.add_emp("vee",16,967846678,"bangalore");
				e.cal(100099);
				e.display();
		

	}

}
	/*public class Manager extends Emp ;
	{
		double bonus;
		public void cal() {
	    double salary=toto_sal + bonus;
	    System.out.println("total salary=" + salary)

			
		*/
		/*public static void main(String[] args) {
			Emp e=new Emp;
			Manager m=new Manager;
			System.out.println("enter employee details"+args[0])]
			m.cal();
			m.display();
			

		}*/

		

