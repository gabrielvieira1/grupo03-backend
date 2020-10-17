package com.group03.demo.enums;

public enum NumerosEnum {
	A(2), B(22), C(222),

	D(3), E(33), F(333),

	G(4), H(44), I(444),

	J(5), K(55), L(555),

	M(6), N(66), O(666),

	P(7), Q(77), R(777), S(7777),

	T(8), U(88), V(888),

	W(9), X(99), Y(999), Z(9999);

	public int value;

	NumerosEnum(int value) {

		this.value = value;

	}

	public Integer getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public static NumerosEnum retornaLetra(int entrada) {

		switch (entrada) {
		case 2:
			return NumerosEnum.A;
		case 22:
			return NumerosEnum.B;
		case 222:
			return NumerosEnum.C;
		case 3:
			return NumerosEnum.D;
		case 33:
			return NumerosEnum.E;
		case 333:
			return NumerosEnum.F;
		case 4:
			return NumerosEnum.G;
		case 44:
			return NumerosEnum.H;
		case 444:
			return NumerosEnum.I;
		case 5:
			return NumerosEnum.J;
		case 55:
			return NumerosEnum.K;
		case 555:
			return NumerosEnum.L;
		case 6:
			return NumerosEnum.M;
		case 66:
			return NumerosEnum.N;
		case 666:
			return NumerosEnum.O;
		case 7:
			return NumerosEnum.P;
		case 77:
			return NumerosEnum.Q;
		case 777:
			return NumerosEnum.R;
		case 7777:
			return NumerosEnum.S;
		case 8:
			return NumerosEnum.T;
		case 88:
			return NumerosEnum.U;
		case 888:
			return NumerosEnum.V;
		case 9:
			return NumerosEnum.W;
		case 99:
			return NumerosEnum.X;
		case 999:
			return NumerosEnum.Y;
		case 9999:
			return NumerosEnum.Z;

		}

		return null;

	}

}
