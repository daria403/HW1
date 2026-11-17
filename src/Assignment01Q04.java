import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {

        if ((direction != 'R' && direction != 'L') || array.length == 0) {
            return array;
        }
        if (move < 0){
            move = -move;
            direction = (direction == 'R') ? 'L' : 'R';
        }
        move = move % array.length;

        if (move == 0){
            return array;
        }
        for(int i=0;i<move;i++){
            if(direction == 'L'){
                shiftLeftArray(array);
            }else{
                shiftrightArray(array);
            }
        }
        return array;
        
    }
    private static void shiftLeftArray(int[] array){
        int first = array[0];
        for(int i = 0; i < array.length - 1; i++){
            array[i] = array[i+1];
        }
        array[array.length -1] = first;
    }
    private static void shiftrightArray(int[] array){
        int last = array[array.length -1];
        for(int i = array.length -1; i>0; i--){
            array[i] = array[i-1];
        }
        array[0] = last;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}