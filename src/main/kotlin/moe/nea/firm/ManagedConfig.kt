package moe.nea.firm

import ext.JavaHelper

interface EnumRenderer<E : Any> {
	companion object {
		fun <E : Enum<E>> default() = object : EnumRenderer<E> {}
	}
}

interface InterfaceA<T> {}

fun <E : Any> funA(
	codec: InterfaceA<E>,
	renderer: EnumRenderer<E>,
) {}

inline fun <reified E> choice() where E : Enum<E>, E : JavaHelper {
	return funA(
		JavaHelper.createInterfaceA { enumValues<E>() },
		EnumRenderer.default(),
	)
}
