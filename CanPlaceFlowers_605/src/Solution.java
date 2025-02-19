class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = n;
        for (int i = 0; i < flowerbed.length && cnt > 0; i++) {
            if (flowerbed[i] == 0 && (i - 1 < 0 || flowerbed[i-1] == 0) && (i + 1 >= flowerbed.length || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1;
                cnt--;
            }
        }
        return cnt == 0;
    }
}