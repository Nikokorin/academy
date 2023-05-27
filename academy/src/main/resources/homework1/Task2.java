package homework1;

public class Task2 {

	public static void main(String[] args) {
    int x = 15;
    double y = 5.6;
    float z = 9.3f;
    char n = charAt();
    String m = null;
    
        switch (x) {
        case 1:
        	System.out.println(x % 2 );
        case 2:
        	System.out.println(y * 0.7 );
        case 3:
        	System.out.println(z * z );
        case 4:
        	System.out.println(n = charAt() );
        case 5:
        	System.out.println( "Hello, " + null);
        	default: 
        		System.out.println( "Unsupported type");
        }
        
	}

	private static char charAt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
