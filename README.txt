Minimal (ish) reproduction for an infinite loop in the kotlin compiler.

I first encountered this issue in

The issue seems to be this method:

	protected fun <E : Any> choice(
		propertyName: String,
		universe: List<E>,
		codec: Codec<E>,
		renderer: EnumRenderer<E>,
		default: () -> E
	): ManagedOption<E> {

Calling this method causes some sort of infinite loop during type resolution. While i am not sure if this is truly an
infinite loop, it at least took over an hour on my hardware to compile this. In the first minute or so it went through
a couple different steps, eventually getting stuck on some slowly increasing tower of

	at org.jetbrains.kotlin.fir.types.ConeInferenceContext.containsInternal(ConeInferenceContext.kt:190)

calls.

This function also seems to hang my IntelliJ whenever i ctrl-click to navigate to the function.