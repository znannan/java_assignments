public class NumberGame {

    private static void scanMaxAndMin(int[] numbers) {
        int max = 0, min = 0;
        // Your stuff here
        int i = 0;
        max = min = numbers[0];
        for(i=1; i<numbers.length; i++){ //遍历，逐个比较最大最小
            if(max < numbers[i]){
                max = numbers[i];
            }
            if(min > numbers[i]){
                min = numbers[i];
            }
        }
        System.out.printf("Max is %d and min is %d%n", max, min);
    }

    private static void scanFirstTwoMaxs(int[] numbers) {
        int max = 0, secondMax = 0;
        // Your stuff here
        //数组前两个元素比较大小，给max 和 secondMax 初始赋值
        if(numbers[0] > numbers [1]){
            max = numbers[0];
            secondMax = numbers[1];
        }else{
            max = numbers[1];
            secondMax = numbers[0];
        }
        //遍历数组其他元素，逐个与secondMax比较
        int i = 0;
        for(i=2; i<numbers.length; i++){
            if(numbers[i] > secondMax){
                secondMax = numbers[i];
                //如果比secondMax大，再比较Max
                if(numbers[i] > max){
                    secondMax = max;
                    max = numbers[i];
                }
            }
        }



        System.out.printf("Max is %d and second max is %d%n", max, secondMax);
    }

    private static void scanFirstThreeMaxs(int[] numbers) {
        int max = 0, secondMax = 0, thirdMax = 0;
        // Your stuff here
        //前三个元素 组合 遍历 排序
        if(numbers[0]>numbers[1]){
            if(numbers[1]>numbers[2]){
                max = numbers[0];
                secondMax = numbers[1];
                thirdMax = numbers[2];
            }else {
                if(numbers[0] > numbers[2]){
                    max = numbers[0];
                    secondMax = numbers[2];
                    thirdMax = numbers[1];
                }else{
                    max = numbers[2];
                    secondMax = numbers[0];
                    thirdMax = numbers[1];
                }
            }
        }else {
            if(numbers[0] > numbers[2]){
                max = numbers[1];
                secondMax = numbers[0];
                thirdMax = numbers[2];
            }else {
                if(numbers[1]>numbers[2]){
                    max = numbers[1];
                    secondMax = numbers[2];
                    thirdMax = numbers[0];
                }else {
                    max = numbers[2];
                    secondMax = numbers[1];
                    thirdMax = numbers[0];
                }
            }
        }
        // 其余元素逐个遍历 比较， 从第三大开始 进位 比较
        int i = 0;
        for(i=3; i<numbers.length; i++){
            if(numbers[i] > thirdMax){
                thirdMax = numbers[i];
                if(numbers[i] > secondMax){
                    thirdMax = secondMax;
                    secondMax = numbers[i];
                    if(numbers[i] > max){
                        secondMax = max;
                        max = numbers[i];
                    }
                }
            }
        }
        System.out.printf("Max is %d, second max is %d and third max is %d%n", max, secondMax, thirdMax);
    }

    private static void threeSums(int[] numbers) {
        int count = 0;
        // 所有组合数遍历
        int i = 0, j = 0, k = 0;

        for(i = 0; i<numbers.length; i++){
            for(j = i+1; j<numbers.length; j++){
                for(k = j+1; k<numbers.length; k++){
                    if(numbers[i]+numbers[j]+numbers[k]==0){
                        count += 1;
                    }
                }
            }

        }
        System.out.printf("There are %d combinations of 3 numbers that sum of them is 0%n", count);
    }

    public static void main(String[] args) {
        int[] numbers = {-1, -2, 3, -4, -5, 9, 10, 11};
        scanMaxAndMin(numbers);
        scanFirstTwoMaxs(numbers);
        scanFirstThreeMaxs(numbers);
        threeSums(numbers);
    }

}