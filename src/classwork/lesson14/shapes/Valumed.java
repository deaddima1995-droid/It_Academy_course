package classwork.lesson14.shapes;

public interface Valumed {
	
	default double getValue() {
		throw new UnsupportedOperationException("Метод не поддерживается данным типом");
	};
	
}
