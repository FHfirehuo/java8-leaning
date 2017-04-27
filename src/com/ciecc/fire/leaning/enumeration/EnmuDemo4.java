package com.ciecc.fire.leaning.enumeration;

public class EnmuDemo4 {

	public static void main(String[] args) {

		Apple ap, ap2, ap3;

		for (Apple a : Apple.values()) {
			System.out.println(a + " " + a.ordinal());
		}

		ap = Apple.RedDel;
		ap2 = Apple.ColdenDel;
		ap3 = Apple.RedDel;

		if (ap.compareTo(ap2) < 0) {

		}

		if (ap.compareTo(ap2) > 0) {

		}

		if (ap.compareTo(ap3) == 0) {

		}

		if (ap.equals(ap2)) {

		}

		if (ap.equals(ap3)) {

		}

		if (ap == ap3) {

		}

	}
}
