import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        int len = numbers.length;
        String[] str = new String[len];

        for (int i = 0; i < len; i++) {
            str[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);

            }
        });

        if(str[0].equals("0"))
            return "0";

        for(String s: str)
            answer += s;


        return answer;
    }

}