import java.util.*;
class Solution {
    final String[] exts = {"code","date","maximum","remain"};
    public int getExtIndex(String ext){
        for(int i = 0; i<exts.length; i++){
            if(ext.equals(exts[i])) return i;
        }
        throw new IllegalArgumentException("Cannot found value from argument");
    }
    public int[][] solution(int[][] datas, String ext, int val_ext, String sort_by) {
        return Arrays.stream(datas).filter(data -> {
            int index = getExtIndex(ext);
            int compareValue = data[index];
            return compareValue < val_ext;
        }).sorted((a,b)-> {
                    int index = getExtIndex(sort_by);
                    return a[index] - b[index];
                }).toArray(int[][]::new);
    }
}
