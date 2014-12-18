
public class StringReverser {

	public static void exec(String str ){
		StringBuffer sb = new StringBuffer(str.length());
		
		for ( int i=str.length()-1; i >=0; i--){
			sb.append(str.charAt(i));
		}
		System.out.println(sb);
		
		char[] cstr = new char[str.length()];
		for ( int i = str.length()-1; i>=0; i--)
			cstr[str.length()-1-i] = str.charAt(i);
		 
		System.out.println(cstr);
		
	}
	public static void main(String[] args) {
		
		String str = "123456789";
		exec(str);
	}

}
