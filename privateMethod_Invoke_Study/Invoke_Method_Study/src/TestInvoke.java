import java.lang.reflect.Method;

import org.junit.Test;


public class TestInvoke {
	
	@Test
	public void test(){
		try {
			Integer[] input = {new Integer(2), new Integer(6)};
			Class c1 = Class.forName("RunMthdRef");
			Class[] par = new Class[2];
			
			par[0] = Integer.TYPE;
			par[1] = Integer.TYPE;
			
			Method addMthd = c1.getDeclaredMethod("add", par);
			addMthd.setAccessible(true);
			Integer output = (Integer) addMthd.invoke(new RunMthdRef(), input);
			System.out.println(output.intValue());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
