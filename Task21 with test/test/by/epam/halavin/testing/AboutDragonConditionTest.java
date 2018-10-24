package by.epam.halavin.testing;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import by.epam.halavin.task21.model.entity.Dragon;
import by.epam.halavin.task21.model.logic.AboutDragonCondition;

public class AboutDragonConditionTest {

	private AboutDragonCondition dragCon;
	private Dragon dragon;

	@Before
	public void initDragonCondition() {
		dragCon = new AboutDragonCondition();
	}

	@After
	public void destroyDragonCondition() {
		dragCon = null;
	}

	@Before
	public void initDragon() {
		dragon = new Dragon();
	}

	@After
	public void destroyDragon() {
		dragon = null;
	}

	@Test
	public void tesGetHeadCountFierstBrach() {
		int testAge = 98;
		int headsCount = 98 * 3 + 3;
		dragon.setAge(testAge);

		Assert.assertEquals(headsCount, dragCon.getHeadCount(dragon));
	}

	@Test
	public void testGetHeadCountSecondBranch() {
		int testAge = 258;
		int headsCount = 200 * 3 + 58 * 2 + 3;
		dragon.setAge(testAge);

		Assert.assertEquals(headsCount, dragCon.getHeadCount(dragon));
	}

	@Test
	public void tesGetHeadCountThirdBrach() {
		int testAge = 358;
		int headsCount = 600 + 200 + 58 + 3;
		dragon.setAge(testAge);

		Assert.assertEquals(headsCount, dragCon.getHeadCount(dragon));
	}

	@Test
	public void testGetEyesCountFirstBranch() {
		int testAge = 78;
		int eyesCount = (78 * 3 + 3) * 2;
		dragon.setAge(testAge);

		Assert.assertEquals(eyesCount, dragCon.getEyesCount(dragon));
	}

	@Test
	public void testGetEyesCountSecondBranch() {
		int testAge = 299;
		int eyesCount = (600 + 99 * 2 + 3) * 2;
		dragon.setAge(testAge);

		Assert.assertEquals(eyesCount, dragCon.getEyesCount(dragon));
	}

	@Test
	public void testGetEyesCountThirdBranch() {
		int testAge = 429;
		int eyesCount = (600 + 200 + 129 + 3) * 2;
		dragon.setAge(testAge);

		Assert.assertEquals(eyesCount, dragCon.getEyesCount(dragon));
	}

}
