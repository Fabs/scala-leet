package leet.java.scala_unsupported;

//FIXME: Time Limit
public class OddEven {
    public int oddEvenJumps(int[] arr) {
        int possible = 0;


        for(int s = 0; s < arr.length; s++) {
            int d = s;
            boolean oddJump = true;
            boolean canProgress = true;

            while(canProgress) {
                if(d == arr.length -1) {
                    possible += 1;
                    canProgress = false;
                }

                if(oddJump) {
                    int minIdx = minIndexLarger(arr, d + 1, arr.length, arr[d]);
                    if(minIdx != -1) {
                        d = minIdx;
                    } else {
                        canProgress = false;
                    }
                } else {
                    int maxIdx = maxIndexSmaller(arr, d + 1, arr.length, arr[d]);
                    if(maxIdx != -1) {
                        d = maxIdx;
                    } else {
                        canProgress = false;
                    }
                }

                oddJump = !oddJump;
            }
        }

        return possible;
    }

    public static int minIndexLarger(int[] arr, int start, int end, int minimum) {
        int min = Integer.MAX_VALUE;
        int minIdx = -1;

        for(int i = end - 1; i >= start; i--) {
            if(arr[i] >= minimum && arr[i] <= min) {
                min = arr[i];
                minIdx = i;
            }
        }

        return minIdx;
    }

    public static int maxIndexSmaller(int[] arr, int start, int end, int maximum) {
        int max = Integer.MIN_VALUE;
        int maxIdx = -1;

        for(int i = end - 1; i >= start; i--) {
            if(arr[i] <= maximum && arr[i] >= max) {
                max = arr[i];
                maxIdx = i;
            }
        }

        return maxIdx;
    }
}
