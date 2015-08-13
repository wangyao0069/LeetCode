package Longest_Substring_Without_Repeating_Characters;

public class Solution {
	private int[] hash_map;
	private String m_s;
	private int num;
	private int max;

	public int lengthOfLongestSubstring(String s) {
		m_s = s;
		hash_map = new int[128];

		for (int i = 0; i < s.length(); i++) {
			search(i);
		}

		return max;
	}

	private void clear() {
		for (int i = 0; i < 128; i++) {
			hash_map[i] = 0;
		}
	}

	private void search(int index) {
		num = 0;
		clear();
		for (int i = index; i < m_s.length(); i++) {
			if (hash_map[m_s.charAt(i)] == 1) {
				break;
			} else {
				hash_map[m_s.charAt(i)] = 1;
				num++;
			}
		}

		for (int i = index - 1; i >= 0; i--) {
			if (hash_map[m_s.charAt(i)] == 1) {
				break;
			} else {
				hash_map[m_s.charAt(i)] = 1;
				num++;
			}
		}

		max = num > max ? num : max;
	}
}
