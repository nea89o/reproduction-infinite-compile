package moe.nea.firm

import ext.JavaHelper

interface InterfaceB<E> {
	companion object {
		fun <E : Enum<E>> default() = object : InterfaceB<E> {}
	}
}

interface InterfaceA<T>

fun <E : Any> funA(
	codec: InterfaceA<E>,
	renderer: InterfaceB<E>,
) {}

inline fun <reified E> funB() where E : Enum<E>, E : JavaHelper {
	return funA(
		JavaHelper.createInterfaceA(),
		InterfaceB.default(),
	)
}
