package javasandbox.probability;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Probability {
	
	public static double calculateProbability(int event, int[] sampleSpace) {
		
		List<Integer> list  = Arrays.stream( sampleSpace ).boxed().collect( Collectors.toList() );
		//List<int[]> list = Arrays.asList(sampleSpace);
		int x =1; 
		
		
		if(list.contains(1)) {
			x = 2;
		}
		System.out.println(x);
		return 0.00;
		
	}

}
