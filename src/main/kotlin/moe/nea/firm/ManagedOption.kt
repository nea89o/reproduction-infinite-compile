package moe.nea.firm

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class ManagedOption<T : Any> : ReadOnlyProperty<Any?, T> {
	override fun getValue(thisRef: Any?, property: KProperty<*>): T {
		return TODO()
	}
}
