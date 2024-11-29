class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[] {-1};
        }

        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minValue = Math.min(minValue, arr[i]);
        }

        int[] result = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != minValue) {
                result[index++] = arr[i];
            }
        }

        return result;
    }
}
