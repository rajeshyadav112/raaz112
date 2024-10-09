package string;

public class StringBufferProgram {

	public static void main(String[] args) {
		
		StringBuffer sf=new StringBuffer("java");
		
		sf.append("program");
		
		System.out.println(sf);
		
		sf.replace(0, 4, "lava");
		
		System.out.println(sf);
		
		sf.reverse();
		
		System.out.println(sf);
		
		sf.insert(0,"kawa");
		System.out.println(sf);
		
		sf.delete(0, 4);
		System.out.println(sf);
		sf.deleteCharAt(0);
		System.out.println(sf);

	}

}
