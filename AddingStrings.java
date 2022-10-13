
public class AddingStrings {

	public static void main(String[] args) {


		String s = new String ("This"); // This will be allocated in heap as it contains new keyword
		String s1 = "Mrcorrey";
		String s2 = "Kori";
		// by using concatente
		s1 = s1.concat(s2);  //This will allocate in scp 
		System.out.println(s1);

		// by using + operator
		String s3 = s1 + s2;
		System.out.println(s3);

		// ----------------------------------------------
		String s5 = "MrCorrey";
		String s6 = "kori";
		
		String s7 = "MrCorrey" + "Kori"; //This will alocate in scp 
		System.out.println(s7);
		String s8 = "MrCorrey" + s6 ;  //This will alocate in Heap area as in contains reference variable
		System.out.println(s8);
		
		
		String s9 = "MrcorreyKori"+ 90 + 99;
		System.out.println(s9);  //adding anything after string will be consider as string
		
		String s10 = 10+20+07+ "MrCorreyKori";
		System.out.println(s10); //adding anything before string will add naturally
		
	}

}
