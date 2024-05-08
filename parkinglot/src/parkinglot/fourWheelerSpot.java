package parkinglot;

import spotInterface.spot;

public class fourWheelerSpot implements spot{
	int id;
	vehical vehical;
	boolean isempty;
	int price;
	@Override
	public void parkvehical(vehical vehical) {
		this.vehical=vehical;
		this.isempty=false;
	}
	@Override
	public void removevehical() {
		this.vehical=null;
		this.isempty=false;
	}
	
}
