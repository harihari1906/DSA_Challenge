class Missing_number {
    public int missingNumber(int[] nums) {
        int xor1 = 0, xor2 = 0;
        int n = nums.length;

        // XOR all elements in the array
        for (int i = 0; i < n; i++) {
            xor2 ^= nums[i];
            xor1 ^= (i + 1); // Ensure correct precedence
        }

        // XOR with the missing number (n)
        return xor1 ^ xor2;
    }
    public static void main(String[] args) {
        Missing_number obj = new Missing_number();

        int[] nums = {3, 0, 1};  
        int result = obj.missingNumber(nums);

        System.out.println("Missing number is: " + result);
    }
}
