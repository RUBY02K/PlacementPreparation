class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < knowledge.size(); i++) {
            String key = knowledge.get(i).get(0);
            String v = knowledge.get(i).get(1);
            map.put(key, v);
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            StringBuilder key = new StringBuilder();
            if (ch == '(') {

                i++; 

                while (s.charAt(i) != ')') {
                    key.append(s.charAt(i));
                    i++;
                }

                if (map.containsKey(key.toString())) {
                    String value = map.get(key.toString());
                    result.append(value);
                } else {
                    result.append("?");
                }
            } else {
                result.append(ch);
            }
        }
        return result.toString();

    }
}