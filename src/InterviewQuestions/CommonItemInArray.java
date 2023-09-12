/* Here we try to implement this question in O(n) time complexity. This would be also achieved
by nested loop with O(n^2) complexity. But that is less efficient. Interviewer expects the more
efficient answer , that's why we use hashmap here.
 */

package InterviewQuestions;

import java.util.HashMap;

public class CommonItemInArray {
    public static boolean findInCommon(int array1[], int array2[]) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i : array1) {
            map.put(i, true);
        }

        for(int j : array2) {
            if(map.get(j) != null) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int array1[] = {1, 3, 5};
        int array2[] = {2, 4, 5};
        System.out.println(findInCommon(array1, array2));
    }

}
