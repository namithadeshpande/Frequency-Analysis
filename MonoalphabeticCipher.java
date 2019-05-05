import java.io.*; 
import java.util.Scanner;
 
public class MonoalphabeticCipher
{
    public static char p[]  = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z' };
    public static char ch[] = { 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O',
            'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C',
            'V', 'B', 'N', 'M' };
 
    public static String doEncryption(String s)
    {
        char c[] = new char[(s.length())];
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 0; j < 26; j++)
            {
                if (p[j] == s.charAt(i))
                {
                    c[i] = ch[j];
                    break;
                }
            }
        }
        return (new String(c));
    }
 
    public static void main(String args[]) throws IOException
    {

	Scanner sc = new Scanner(System.in);
       // System.out.println("Enter the message: ");
	String line;
	String en;
        	
	File inputfile = new File(args[0]);

	// Creating a File object that represents the disk file. 
        PrintStream o = new PrintStream(new File("ciphertext.txt")); 
  
        // Store current System.out before assigning a new value 
        PrintStream console = System.out; 
  
        

   	try {

		Scanner sr = new Scanner(inputfile);

	     	while (sr.hasNext()) {
	     		String i = sr.next();
			en = doEncryption(i.toLowerCase());
			

		// Assign o to output stream 
        	System.setOut(o); 
		System.out.print(en);
       		// System.out.println("This will be written to the text file");
	
	 
  
        	// Use stored value for output stream 
		System.setOut(console); 
       		System.out.print(en);
					 	
		}
		
	    	sr.close();
   	    } 
    	catch (FileNotFoundException e) {
        	e.printStackTrace();
   	 	}
//        System.out.println("Encrypted message: " + en);
        sc.close();
    }
}
