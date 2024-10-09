package constuctor;

public class Employ {

	
	   String name;
	   double salary;
	   int deptno;
	
		Employ(){
			
			System.out.println("constructor is designed");
		}
		
		Employ(String name,double salary,int deptno){
			
			this.name=name;
			this.salary=salary;
			this.deptno=deptno;
		}
		
		public void display() {
			
			
			System.out.println("The name of employ is"+this.name);
			System.out.println("salary of employ is"+this.salary);
			System.out.println("The deptno of employ is"+this.deptno);
		}
		
		
		
		
		
		
		
	

}
