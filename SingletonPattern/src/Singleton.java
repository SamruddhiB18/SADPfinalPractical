public class Singleton {
	private static Singleton object;
	private Singleton()
	{}
	public static synchronized Singleton getInstance()
	{
		if(object==null)
		{
			object=new Singleton();
		}
		return object;
	}
}
