package moe.nea.firm

import ext.StringIdentifiable
import kotlin.enums.enumEntries


abstract class ManagedConfig(val identifier: String) {
	protected fun <T : Any> option(
		propertyName: String,
		default: () -> T,
//		handler: OptionHandler<T>
	): ManagedOption<T> {
		return TODO()
	}

	protected fun <E : Any> choice(
		propertyName: String,
		universe: List<E>,
		codec: Codec<E>,
		renderer: EnumRenderer<E>,
		default: () -> E
	): ManagedOption<E> {
		return option(propertyName, default,
//		              ChoiceHandler(universe, codec, renderer)
		)
	}

	protected inline fun <reified E> choice(
		propertyName: String,
		noinline default: () -> E
	): ManagedOption<E> where E : Enum<E>, E : StringIdentifiable {
		return choice(
			propertyName,
			enumEntries<E>().toList(),
			StringIdentifiable.createCodec { enumValues<E>() },
			EnumRenderer.default(),
			default
		)
	}
}
