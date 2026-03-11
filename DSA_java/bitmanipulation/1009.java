class Solution {
    public int bitwiseComplement(int n) {

        String b = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();

        for(char c : b.toCharArray()){

            if(c == '0'){
                sb.append('1');
            }
            else{
                sb.append('0');
            }

        }

        return Integer.parseInt(sb.toString(), 2);
    }
}