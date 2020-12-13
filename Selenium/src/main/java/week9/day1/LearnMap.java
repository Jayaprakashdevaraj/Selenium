package week9.day1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.bson.codecs.CollectibleCodec;

public class LearnMap {
	public static void main(String[] args) {

		Map<String, Integer> carPrices = new LinkedHashMap<String, Integer>();
		carPrices.put("maruti swift", 9395);
		carPrices.put("maruti Brezza", 10165);
		carPrices.put("maruti kwid", 10995);
		carPrices.put("maruti kicks", 8795);

		List<Integer> allPrices = new ArrayList<Integer>();

		for (Entry<String, Integer> eachCarPrice : carPrices.entrySet()) {
			System.out.println(eachCarPrice.getKey());
			System.out.println(eachCarPrice.getValue());
		}
		Collections.sort(allPrices);
		System.out.println();

		for (Entry<String, Integer> eachCarPrice : carPrices.entrySet()) {
			if (allPrices.get(0) == eachCarPrice.getValue()) {
				System.out.println(eachCarPrice.getKey());
			}

		}

	}

}
