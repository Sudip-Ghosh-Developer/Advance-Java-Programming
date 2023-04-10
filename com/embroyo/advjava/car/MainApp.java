package com.embroyo.advjava.car;
 import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class MainApp {

	public static void main(String[] args) {
		
		CarList hero =  new CarList("HeroBike", "Blue",100000);
		CarList honda =  new CarList("HondaBike", "Red",110000);
		CarList yahama =  new CarList("YahamaBike", "White",160000);
		CarList pulsar =  new CarList("PulsarBike", "Blue",120000);
		CarList tvs =  new CarList("TVSBike", "Blue",140000);
		
		
		
		List<CarList> car= new ArrayList<>();
		car.add(hero);
		car.add(honda);
		car.add(yahama);
		car.add(pulsar);
		car.add(tvs);
		System.out.println(car);
		
		/// predicate means comapre
		
		Predicate<CarList> d= x-> x.getPrice()>110000;
		 
		 for(CarList car1 : car) {
			 if (d.test(car1)) {
				 System.out.println(car1);
			 }
		 }
		   
	}

}
