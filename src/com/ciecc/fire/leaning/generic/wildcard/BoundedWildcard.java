package com.ciecc.fire.leaning.generic.wildcard;

public class BoundedWildcard {

	static void showXY(Coords<?> c){
		System.out.println(" X Y Coordinates:");
		for(int i=0; i< c.coords.length; i++){
			System.out.println(c.coords[i].x + " " + c.coords[i].y);
			System.out.println();
		}
	}
	
	static void showXYZ(Coords<? extends ThreeD> c){
		System.out.println(" X Y Coordinates:");
		for(int i=0; i< c.coords.length; i++){
			System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
			System.out.println();
		}
	}
	
	static void showAll(Coords<? extends FourD> c){
		System.out.println(" X Y Coordinates:");
		for(int i=0; i< c.coords.length; i++){
			System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		TwoD td[] = {
				new TwoD(0, 0),
				new TwoD(7, 9),
				new TwoD(18, 4),
				new TwoD(-1, -23),
		};
		
		Coords<TwoD> tdlocs = new Coords<>(td);
		
		System.out.println("Contents of  tdlocs.");
		showXY(tdlocs); //ok, is two
	}
}
