package n1exercici1.handlers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demostrar {
	
	
	public void filtrarLlista() {
		
		List<String> animals = Arrays.asList("LLeo","Aranya","Anxova","Formiga","Estornell","Ànec",
												"Guineu","Cavall");
		
		List<String> animalsAmbO = new ArrayList<>();
		
		animalsAmbO = animals.stream().filter(animal -> animal.toLowerCase().contains("o"))
				.collect(Collectors.toList());
		animalsAmbO.forEach(animal -> System.out.println(animal + " "));
				
	}
}
