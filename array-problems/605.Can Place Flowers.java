class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (n == 0)
            return true;

        if (flowerbed.length == 1) {
            return flowerbed[0] == 0;
        }

        int counter = 0;
        for (int i = 0; i < flowerbed.length - 1; i++) {
            if (i == 0) {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    counter++;
                    flowerbed[i] = 1;
                }
            } else if (i == flowerbed.length - 2) {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    counter++;
                    flowerbed[i + 1] = 1;
                }
            } else {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    counter++;
                    flowerbed[i] = 1;
                }
            }
        }

        return counter >= n;
    }
}