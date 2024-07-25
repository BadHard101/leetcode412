import java.util.ArrayList;
import java.util.List;

class Solution {
    // fizz = 3
    // buzz = 1
    // i = 6
    // res: [1,2,Fizz,4,Buzz,Fizz]
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        int i = 1;
        int fizz = 0, buzz = 0;

        while (i <= n) {
            if (fizz == 3 && buzz == 5) {
                res.add("FizzBuzz");
                fizz = 0;
                buzz = 0;
            } else if (fizz == 3) {
                res.add("Fizz");
                fizz = 0;
            } else if (buzz == 5) {
                res.add("Buzz");
                buzz = 0;
            } else {
                res.add(Integer.toString(i));
            }
            fizz++;
            buzz++;
            i++;
        }
        return res;
    }
}