import java.util.ArrayList;
import java.util.List;

class No_disappeared_in_array {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr = new ArrayList<Integer>();
        
        for(int i=1;i<=nums.length;i++){
            boolean flag=false;
            for(int j=0;j<nums.length;j++){
            if(i==nums[j]){
                flag =true;
            }
        }
        if(flag==false){
                arr.add(i);
            }
        }
       return arr; 
    }
    public static void main(String[] args){
        int [] nums={1,1};
        No_disappeared_in_array obj = new No_disappeared_in_array();
        System.out.println(obj.findDisappearedNumbers(nums));
    }
}