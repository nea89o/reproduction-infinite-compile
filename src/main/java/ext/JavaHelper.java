package ext;

import moe.nea.firm.InterfaceA;

public interface JavaHelper {
	static <E extends JavaHelper> InterfaceA<E> createInterfaceA() {
		return null;
	}
}

