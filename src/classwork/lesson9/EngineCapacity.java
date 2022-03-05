package classwork.lesson9;

import java.util.Objects;

public final class EngineCapacity {
	private static final EngineCapacity ONE = new EngineCapacity(2);
	private static final EngineCapacity TWO = new EngineCapacity(2);
	private static final EngineCapacity THREE = new EngineCapacity(2);
	
	private int engineCapacity;
	
	EngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	@Override
	public String toString() {
		return String.valueOf(engineCapacity);
	}

	@Override
	public int hashCode() {
		return Objects.hash(engineCapacity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EngineCapacity other = (EngineCapacity) obj;
		return engineCapacity == other.engineCapacity;
	}
}
