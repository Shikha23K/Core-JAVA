package StringMethods;

public class Demo1 {

	public static void main(String[] args) {
		String fName=new String(" Suresh");
		String mName=" Kumar ";
		String fullName=fName.concat(mName);
		System.out.println(fullName);
		System.out.println(fName.concat(mName));
		int l= fullName.trim().length();
		System.out.println("The Length of First Name is: "+l);
		System.out.println(fullName.substring(2,l-2));
		System.out.println(fName+mName.replace(mName.charAt(3),'v'));
		
		System.out.println(fullName.toUpperCase());
	}

}
