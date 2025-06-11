interface A
{
//	public abstract void show();
//	public abstract void config();
	int age=44;            // final and static 
	String area="Mumbai";
	
	void show();
	void config();
}

class B implements A
{
	public void show()
	{
		System.out.println("in show");
	}
	public void config()
	{
		System.out.println("in cofing");
	}
}

public class Demo {
    public static void main(String[] args) {

    	A obj;
    	obj=new B();
    	
    	obj.show();
    	obj.config();
    	
 //   	A.area="Hyderabad";
    	
    	System.out.println(A.area);
        
    }
}

//By default all methods in an interface are public and abstract 
//Interface has static variables since u cannot create an object of an interface and final also because it does not have memory in heap so how can u create a non-final variable
//kepwords implements is used instead of Extends
