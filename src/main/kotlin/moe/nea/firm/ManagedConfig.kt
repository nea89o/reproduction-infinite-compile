package moe.nea.firm

import ext.JavaHelper

interface InterfaceB<E> {
	companion object {
		fun <E : Enum<E>> default() = object : InterfaceB<E> {}
	}
}

interface InterfaceA<T>
interface InterfaceC

fun <E : InterfaceC> createInterfaceAKotlin():InterfaceA<E> = TODO()

fun <E : Any> funA(
	intA: InterfaceA<E>,
	intB: InterfaceB<E>,
) {}

fun <E> funB() where E : Enum<E>, E : InterfaceC {
	funA(
		JavaHelper.createInterfaceA(),
		InterfaceB.default(),
	)
}
