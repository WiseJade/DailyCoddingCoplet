import java.util.*;
import java.util.stream.Collectors;

public class IsSubsetOf {
    public boolean isSubsetOf(int[] base, int[] sample) {
        // TODO:
        Arrays.sort(base);
        Arrays.sort(sample);
        boolean equal = false;
        for(int i = 0; i < sample.length; i++) {
            for(int j = 0; j < base.length; j++) {
                if(sample[i] == base[j]) {
                    equal = true;
                    break;
                }
                if(base[j] > sample[i])
                    break;
            }
            if(!equal)
                return false;
            equal = false;
        }
        return true;
    }
}
