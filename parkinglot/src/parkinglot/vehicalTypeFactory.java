package parkinglot;

import spotInterface.spot;

public class vehicalTypeFactory {
	//vehicalType vehicalType;
	 public spot vehicalFactory(String Type){
		if(Type.equalsIgnoreCase("TwoWheeler")) {
			twoWheelerSpot twoWheelerSpot= new twoWheelerSpot();
			 return twoWheelerSpot;
		}
		else if(Type.equalsIgnoreCase("FourWheeler")) {
			fourWheelerSpot fourWheelerSpot=new fourWheelerSpot();
			return fourWheelerSpot;
		}
		return null;
	}
}
