package classwork.lesson9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {
	
	private static final Random RANDOM = new Random();
	private static final OpenOption APPEND = null;
	
	
	public static void main(String[] args) {
		Map<EngineCapacity,List<Car>> mapCar = new HashMap<>();
		for(int i = 0; i < 10; i++) {
			Car car = new Car(
					String.valueOf(i),
					generateModel(),
					generateEngineCapacity()
			);
			
			List<Car> list = mapCar.computeIfAbsent(
					car.getEngineCapacity(),
					engineCapacity -> new ArrayList<>()	
			);
			list.add(car);
		}
		
		EngineCapacity engineCapacity = generateEngineCapacity();
        System.out.println(mapCar.get(engineCapacity));
		
		mapCar.get(generateEngineCapacity()).forEach(
				car -> {
					try {
						Files.write(
								Paths.get("readfile.txt"),
								car.toString().getBytes(),
								APPEND
						);		
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
		);	
	}
	
	public static EngineCapacity generateEngineCapacity() {
		return switch(RANDOM.nextInt(3)) {
		case 1 -> new EngineCapacity(1);
		case 2 -> new EngineCapacity(2);
		case 3 -> new EngineCapacity(3);
		default -> new EngineCapacity(1);
		};
	}
	
	public static CarModel generateModel() {
		return CarModel.values()[RANDOM.nextInt(2)];
	}
}