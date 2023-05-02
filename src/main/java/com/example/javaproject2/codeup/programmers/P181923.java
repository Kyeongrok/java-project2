package com.example.javaproject2.codeup.programmers;

import java.util.Arrays;

public class P181923 {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            System.out.println(Arrays.toString(query));
            // [s, e, k]
            int pivot = query[2];
            int caseMin = pivot;
            for (int j = query[0]; j <= query[1]; j++) {
                if(arr[j] > pivot && caseMin > arr[j]) caseMin = arr[j];
            }
            answer[i] = caseMin;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] resultArr = solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 2},{0, 3, 2},{0, 2, 2}});
        System.out.println(Arrays.toString(resultArr));
    }
}
