package com.sunbeam.q2;

public class Circle {
	Point2D center ;
	double myDiameter;
	
	public Circle() {
		center = new Point2D(0, 0);
		myDiameter = 100;	
	}

	public Point2D getCenter() {
		return center;
	}

	public double getMyDiameter() {
		return myDiameter;
	}

	public void setCenter(Point2D center) {
		this.center = center;
	}

	public void setMyDiameter(double myDiameter) {
		if(myDiameter <0)
			throw new NegativeDiameterException();
		this.myDiameter = myDiameter;
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + ", myDiameter=" + myDiameter + "]";
	}
	
	class NegativeDiameterException extends RuntimeException {
		public void displayError() {
			System.out.println("The diameter cannot be negative");
		}
	}
	
	
	

}