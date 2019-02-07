package cmput402.tdd;

import java.util.ArrayList;
import java.util.HashMap;

import cmput402.tdd.service.Search;

public class Utility {

	public HashMap<String, Float>  countAverageScore(Search search){
		
		HashMap<String, ArrayList<Integer>> results = search.returnAll();
		
		HashMap<String, Float> map = new HashMap<String, Float>();
		
		for(String player: results.keySet()) {
			ArrayList<Integer> playerStats = results.get(player);
			Integer numGames = playerStats.get(0);
			Integer numGoals = playerStats.get(1);
			
			Float average = (float) numGoals / numGames;
			map.put(player, average);
		}
		return map;
	}
	
//public HashMap<String, Integer>  findTopScorer(Search search){
//		
//	HashMap<String, ArrayList<Integer>> stats = search.returnAll();
//	
//	HashMap<String, Integer> map = new HashMap<String, Integer>();
//	String bestPlayer = new String();
//	
//	for(String player: stats.keySet()) {
//		if(bestPlayer == null) {
//			bestPlayer = player;
//			
//		} else if(stats.get(player).get(1) > stats.get(bestPlayer).get(1)) {
//			bestPlayer = player;
//		}
//	}
//	map.put(bestPlayer, stats.get(bestPlayer).get(1));
//	return map;
//	}
//	
}
