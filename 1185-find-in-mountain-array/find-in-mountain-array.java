/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    private int findPeak(MountainArray arr) {
        int low = 0;
        int high = arr.length() - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) < arr.get(mid + 1)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return high;
    }

    private int left(MountainArray arr, int low, int high, int n) {

        while (low <= high) {

            int mid = (low + high) / 2;
            int value = arr.get(mid);
            if (value == n) {
                return mid;
            }
            if (value < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    private int right(MountainArray arr, int low, int high, int n) {

        while (low <= high) {
            int mid = (low + high) / 2;
            int value = arr.get(mid);
            if (value == n)
                return mid;
            if (value < n) {
                high = mid-1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        System.out.print(peak);
        int leftSearch = left(mountainArr, 0, peak, target);
        if (leftSearch != -1) {
            return leftSearch;
        }
        return right(mountainArr, peak+1, mountainArr.length() - 1, target);
    }

}