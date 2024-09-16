import java.util.*;
class strBuffer
{
	public static void main(String args[])
	{
		StringBuffer s = new StringBuffer("CalAmity");
		
		System.out.println(s);
		
		s.append(" University");
		System.out.println(s);

		s.replace(0, 3, "Sca");
		System.out.println(s);

		s.delete(0,3);
		System.out.println(s);

		s.insert(0, "Ye hai ");
		System.out.println(s);

		s.reverse();
		System.out.println(s);
	}
}