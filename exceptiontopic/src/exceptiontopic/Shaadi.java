package exceptiontopic;

public class Shaadi {
		static void submit() throws MarriageException
		{
			int age=15;
			if(age>=21){
				System.out.println("happy life");
			}
			else{
				throw new MarriageException("Invalid age");
			}
		}
		public static void main(String[] args) {
			try{
				submit();
			}
			catch(MarriageException e)
			{
				System.out.println(e.getMessage());
			}
		} 
}
		class MarriageException extends Exception
		{
			String msg;
			MarriageException(String msg) {
				this.msg=msg;
			}
			public String getMessage(){
				return msg;
			}
		}
		
