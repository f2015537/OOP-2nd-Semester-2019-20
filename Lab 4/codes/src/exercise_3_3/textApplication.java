package exercise_3_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class textApplication {
	
	private String[] words;
	private String[] uniqueLabels;
	private String[] countFreq;
	
	public String[] Split(String text) {
		StringTokenizer st = new StringTokenizer(text,"#");
		ArrayList<String> list = new ArrayList<String>();
		while(st.hasMoreTokens()) {
			String[] s = st.nextToken().split("\\s");
			for(int i = 0; i < s.length; i++)
				list.add(s[i]);
		}
		words = list.toArray(new String[list.size()]);
		return list.toArray(new String[list.size()]);
	}
	
	public String[] UniqueLabels(String[] words)  {
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i < words.length; i++) {
			if(!list.contains(words[i].toUpperCase()) && !list.contains(words[i].toLowerCase())) {
				list.add(words[i]);
			}
		}
		uniqueLabels = list.toArray(new String[list.size()]);
		return list.toArray(new String[list.size()]);
	}
	
	public String[] Count(String[] words, String[] labels) {
		String[] arr = new String[labels.length];
		for(int i = 0; i < labels.length; i++) {
			int counter = 0;
			for(int j = 0; j < words.length; j++) {
				if(words[j].equalsIgnoreCase(labels[i]))
					counter++;
			}
			arr[i] = labels[i] + " " + counter;
		}
		countFreq = arr;
		return arr;
	}
	
	public void Display(int n) {
		// Please make a PR if you come up with a solution that does not
		//use Arrays.sort
	}
	
	public static void main(String[] args) {
		textApplication t = new textApplication();
		System.out.println(Arrays.toString(t.Split("abc def#def ghi#abc def#ABC def")));
		System.out.println(Arrays.toString(t.UniqueLabels(t.Split("abc def#def ghi#abc def#ABC def"))));
		System.out.println(Arrays.toString(t.Count(t.Split("abc def#def ghi#abc def#ABC def"), t.UniqueLabels(t.Split("abc def#def ghi#abc def#ABC def")))));
		
	}
}
