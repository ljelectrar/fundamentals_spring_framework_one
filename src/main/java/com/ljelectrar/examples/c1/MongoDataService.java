package com.ljelectrar.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDataService implements DataService {

	@Override
	public int[] retriveData() {
		return new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	}

}
