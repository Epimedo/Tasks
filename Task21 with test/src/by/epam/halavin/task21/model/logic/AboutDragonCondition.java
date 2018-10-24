package by.epam.halavin.task21.model.logic;
import by.epam.halavin.task21.model.entity.Dragon;

public class AboutDragonCondition {
	static final int HEADNUMBERBEFORE200 = 3;
	static final int HEADNUMBERAFTER200 = 2;
	static final int HEADNUMBERAFTER300 = 1;
	static final int INITIANALHEADCOUNT = 3;
	static final int EYESNUMBER = 2;

	public int getHeadCount(Dragon dragon) {
		int heads = INITIANALHEADCOUNT;

		if (dragon.getAge() < 200) {
			heads += dragon.getAge() * HEADNUMBERBEFORE200;
		} else {
			if (dragon.getAge() < 300) {
				heads += (dragon.getAge() - 200) * HEADNUMBERAFTER200 + 200 * HEADNUMBERBEFORE200;
			} else {
				heads += 200 * HEADNUMBERBEFORE200 + 100 * HEADNUMBERAFTER200
						+ (dragon.getAge() - 300) * HEADNUMBERAFTER300;
			}
		}

		return heads;
	}

	public int getEyesCount(Dragon dragon) {
		int heads = INITIANALHEADCOUNT;

		if (dragon.getAge() < 200) {
			heads += dragon.getAge() * HEADNUMBERBEFORE200;
		} else {
			if (dragon.getAge() < 300) {
				heads += (dragon.getAge() - 200) * HEADNUMBERAFTER200 + 200 * HEADNUMBERBEFORE200;
			} else {
				heads += 200 * HEADNUMBERBEFORE200 + 100 * HEADNUMBERAFTER200
						+ (dragon.getAge() - 300) * HEADNUMBERAFTER300;
			}
		}

		return heads*EYESNUMBER;
	}
}
