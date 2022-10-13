
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = " MrCorrey ";
		String s2 = " MrCorrey ";
		String s3 = new String (" MrCorrey ");
		
		// Equal-To-Operator in string - it compares the address
		
		System.out.println(s1==s2);  // op- True (both will be stored in scp and have same addresse)
		System.out.println(s1==s3);  // OP:False - s1 will store in in scp and s3 in heap
		
		// equal() - it compares actual value
		
		System.out.println(s1.equals(s3)); //OP:True - as both contains same string 
		
		// equalsIgnoreCase() - it will compares actual value while ignoring cases
		
		String s4 = "Mrcorreykori";
		String s5 = "mrcorreyKori";
		System.out.println(s4.equalsIgnoreCase(s5)); //OP:true - both strings are same if you ignore cases
		
		//compareTo - it will compare character by character based on arche numbers
		
		System.out.println(s1.compareTo(s2)); //it will give either 0 or +ve or -ve number
}
}
