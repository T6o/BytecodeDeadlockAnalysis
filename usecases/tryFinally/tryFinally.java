package tryFinally;

public class tryFinally {


	public static int main(String[] args) {
		
		try{
			int i = 3;
			if(i == 3){
				return i;
			}
		}
		finally{
			System.out.println("in finally");
		}
		
		return 4;
		
	}

}
