package MostCommonLetterSecond;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MostCommonLetterTest {

private static final int MAX_COUNT_OF_SPECIAL_SYMBOL = 20;

//	public static void writeDiez(double maxValue, ){
//		
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a text:");
		String text = sc.nextLine();

		text = text.toLowerCase().replaceAll("\\s","");
		char[] array = text.toCharArray();
		
		//Key - letter : Value - number
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		
		
		//Count how meny times every letter is in the map
		for(Character letter:array){
			if(!(map.containsKey(letter))){
				map.put(letter, 1);
			}
			else{
				map.put(letter, map.get(letter)+1);
			}
		}
		
		//Add all letters(keys) from map to ArrayList
		List<Character> keyList = new ArrayList<Character>();
		for(Character letter:map.keySet()){
			keyList.add(letter);
		}
		
		//Sort letter how many times each repeat in discending order
		keyList.sort((letter1, letter2) ->{
			return map.get(letter2) - map.get(letter1);
		});
		
		
		//Add all values(number of each letter) from map to ArrayList
		List<Integer> valueList = new ArrayList<Integer>();
		for(Character letter:map.keySet()){
			valueList.add(map.get(letter));
		}
		
		//Sort values in descending order
		Collections.sort(valueList, Collections.reverseOrder());
		double maxNumber = (double)(valueList.get(0));
		
		//Може и така да стане извеждането
//		for (int i = 0; i < keyList.size(); i++) {
//			for(int j = i; j<valueList.size(); j++){
//				System.out.println(keyList.get(i) + ":" + valueList.get(j));
//				break;
//			}
//		}
		
		
		for(Character letter:keyList){
			System.out.print(letter + ":" + map.get(letter) + " ");
			if(map.get(letter) == maxNumber){
				for(int i = 0; i<MAX_COUNT_OF_SPECIAL_SYMBOL; i++){
					System.out.print("#");
				}
			}
			else{
				double currentValue = (double)(map.get(letter));
				double countOfSymbols = Math.floor((currentValue/maxNumber)*MAX_COUNT_OF_SPECIAL_SYMBOL);
				for(int i = 0; i<countOfSymbols; i++){
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}

}
