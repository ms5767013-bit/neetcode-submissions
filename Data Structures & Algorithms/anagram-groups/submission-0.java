

class Solution {
    public List<List<String>> groupAnagrams(String[] a) {
        Map<String, List<String>> m = new HashMap<>();
        for (String s : a) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String k = new String(c);
            if (!m.containsKey(k)) {
                m.put(k, new ArrayList<>());
            }
            m.get(k).add(s);
        }
        return List.copyOf(m.values());
    }
}