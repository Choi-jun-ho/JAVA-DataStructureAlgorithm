package level1.personal_information_collection_period_validity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public int get_date(String date) {
        int[] datesArr = Arrays.stream(date.split("\\.")).mapToInt(Integer::parseInt).toArray();
        return datesArr[0] * 12 * 28 + datesArr[1] * 28 + datesArr[2];
    }

    public int[] solution(String today, String[] terms, String[] privacies) {

        HashMap<String, Integer> termMap = new HashMap<>();
        for(String term : terms) {
            String[] termArr = term.split(" ");
            termMap.put(termArr[0], Integer.parseInt(termArr[1]));
        }

        int index = 1;
        ArrayList<Integer> result = new ArrayList<>();
        for (String privacyS : privacies) {
            String[] priDateAndTerm = privacyS.split(" ");
            if (get_date(priDateAndTerm[0]) + termMap.get(priDateAndTerm[1]) * 28 <= get_date(today))
                result.add(index);
            index++;
        }

        return Arrays.stream(result.toArray()).mapToInt(i->(int)i).toArray();
    }

    public static void main(String[] args) {
        System.out.println("2022.05.19");
        System.out.println(Arrays.toString(new Solution().solution(
                "2022.05.19",
                new String[]{"A 6", "B 12", "C 3"},
                new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"})));

        System.out.println("2020.01.01");
        System.out.println(Arrays.toString(new Solution().solution(
                "2020.01.01",
                new String[]{"Z 3", "D 5"},
                new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"})));

    }
}
