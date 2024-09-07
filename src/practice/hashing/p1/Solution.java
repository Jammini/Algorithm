package practice.hashing.p1;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public int solution(String s){
		int answer = -1;
		Map<Character, Integer> map = new HashMap<>();

		for (char alphabet : s.toCharArray()) {
			map.put(alphabet, map.getOrDefault(alphabet, 0) + 1);
		}

		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) == 1) {
				answer = i + 1;
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args){
		Solution T = new Solution();
		System.out.println(T.solution("statitsics"));
		System.out.println(T.solution("aabb"));
		System.out.println(T.solution("stringshowtime"));
		System.out.println(T.solution("abcdeabcdfg"));
	}
}