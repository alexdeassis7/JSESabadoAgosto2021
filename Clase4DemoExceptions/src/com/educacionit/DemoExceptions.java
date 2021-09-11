package com.educacionit;

public class DemoExceptions {

	public static void main(String[] args) {
		System.out.println("inicio de la app");

		int nums[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };

		// recorremos el array de numeradores
//		for (int i = 0; i < nums.length; i++) {
//
//			try {
//				System.out.println(nums[i] + " / " + denom[i] + " = " + nums[i] / denom[i]);
//			} catch (ArithmeticException objetoE) {
//				System.out.println("No se puede dividir por cero ....");
//			} catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("Te Desbordaste del array de denominadores");
//				e.printStackTrace();
//				System.out.println(e.getMessage());
//			}
//
//		}

		// LOS BLOQUES TRY CATCH PUEDEN ANIDARSE DE LA SIGUIENTE MANERA
		try {// try externo
			for (int i = 0; i < nums.length; i++) {

				try { // try interno
					System.out.println(nums[i] + " / " + denom[i] + " = " + nums[i] / denom[i]);
				} catch (ArithmeticException e) {
					System.out.println("No se puede dividir por cero ....");
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Te Desbordaste del array de denominadores");
		}
		System.out.println("Fin de la app");
	}
}
