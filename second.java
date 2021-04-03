class call {
	synchronized void callMe(String tna)
	{
		System.out.print("\n [ "+tna);
		try {
			Thread.sleep(3000);
			
		}
		catch(Exception e)
		{
			
			
		}
		System.out.println(" ] ");
	}
}
class Child implements Runnable{
	Thread th;
	String name;
	call c;
	
	Child(String name,call c){
		th=new Thread(this);
		this.c=c;
		this.name=name;
		th.start();
		
		
	}
	public void run(){
		c.callMe(name);
		
	}
}


public class SynFirst {

	public static void main(String[] args) {
		call c=new call();
		
		Child c1=new Child("hetvi",c);
		Child c2=new Child("kanav",c);
		Child c3=new Child("manisha",c);// TODO Auto-generated method stub

	}

}
