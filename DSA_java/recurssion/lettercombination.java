class Solution {

    HashMap<Character,String> map = new HashMap<>();

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if(digits.length() == 0)
            return ans;

        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        fun(digits, 0, new StringBuilder(), ans);

        return ans;
    }

    public void fun(String digits, int idx,
                    StringBuilder temp,
                    List<String> ans) {

        if(idx == digits.length()) {
            ans.add(temp.toString());
            return;
        }

        String letters = map.get(digits.charAt(idx));

        for(int i = 0; i < letters.length(); i++) {

            temp.append(letters.charAt(i));

            fun(digits, idx + 1, temp, ans);

            temp.deleteCharAt(temp.length() - 1); // backtrack
        }
    }
}
