import static org.junit.Assert.*;

import org.junit.Test;

import com.fanniemae.payroll.dao.CarRepository;

public class CarTest {

	@Test
	public void testSizeFor10items() {
		CarRepository carRep = new CarRepository();
		
		int size =carRep.findMaps().size();
		
		assertTrue ("size is :'"+ size, size ==20);
	}

}
