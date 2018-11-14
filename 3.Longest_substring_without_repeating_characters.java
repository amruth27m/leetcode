class Solution {
	public int lengthOfLongestSubstring(String s) {
		int maxSoFar = 0;
		char[] chr = s.toCharArray();
		Set<Character> currentElements = new LinkedHashSet<Character>();
		for(char ch: chr){
			if(currentElements.contains(ch)){
				Iterator<Character> it = currentElements.iterator();
				while(it.hasNext()){
					if(it.next() == ch){
						it.remove();
						break;
					}
					it.remove();
				}
			}
			currentElements.add(ch);
			if(currentElements.size() >= maxSoFar){
				maxSoFar = currentElements.size();
			}

		}
		return maxSoFar;
	}
}
