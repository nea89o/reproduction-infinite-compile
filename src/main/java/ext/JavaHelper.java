package ext;

import moe.nea.firm.InterfaceA;

import java.util.function.Supplier;

public interface JavaHelper {
	static <E extends JavaHelper> InterfaceA<E> createInterfaceA() {
		return null;
	}
}

