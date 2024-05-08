package parkinglot;

import spotInterface.parkingStrategy;
import spotInterface.spot;

public class defaultStrategy implements parkingStrategy{
	vehicalTypeFactory vehicalTypeFactory;
	@Override
	public spot pickThisStrategy(String Type) {
		spot spot =vehicalTypeFactory.vehicalFactory(Type);
		return spot;
	}

}
