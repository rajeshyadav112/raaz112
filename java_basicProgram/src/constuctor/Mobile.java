package constuctor;
//constructor over loading
public class Mobile {

		String color;
		String brand;
		double price;
		double size;
		
		Mobile(){
			
		}
		
		Mobile(String color){
			
			this.color=color;
		}
		
		Mobile(String color,String brand){
			
			this.color=color;
			this.brand=brand;
		}
		Mobile(String color,String brand,double price){
			
			this.color=color;
			this.brand=brand;
			this.price=price;
			
		}
	Mobile(String color,String brand,double price,double size){
			
			this.color=color;
			this.brand=brand;
			this.price=price;
			this.size=size;
			
		}
	
	public void display() {
		
		System.out.println("The color of mobile phone is:"+this.color);
		System.out.println("The brand of mobile phone is:"+this.brand);
		System.out.println("The price of mobile phone is:"+this.price);
		System.out.println("The size of mobile phone is:"+this.size);
	}
		

	}


