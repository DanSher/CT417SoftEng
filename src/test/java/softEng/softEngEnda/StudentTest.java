package softEng.softEngEnda;

import static org.junit.Assert.*;

import org.junit.Test;


public class StudentTest {
	
	@Test
	public void getUsernameTest(){
		Student stu = new Student( "Dan", 21, "23/2/1996", 14274 );
		assertEquals( stu.getUsername(), stu.getName() + stu.getAge() );
	}

}
