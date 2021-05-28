package test;

import java.util.Scanner;

/**
 * ClassName:TextDemo7
 * Package:test
 * Description:
 *
 * @Author:HP
 * @date:2021/5/26 16:44
 */
public class TextDemo7 {
    //剪花布条
//    public static int func(String s,String t) {
//        int lenS = s.length();
//        int lenT = t.length();
//        int count = 0;
//        for(int i = 0; i <= lenS - lenT; i++) {
//            int j = i + lenT;
//            if(s.substring(i,j).equals(t)){
//                count++;
//                i = j - 1;
//            }
//        }
//        return count;
//    }


    //BiNode
//   TreeNode head = new TreeNode(-1);
//    TreeNode cur = head;
//    public TreeNode convertBiNode(TreeNode root) {
//        dfs(root);
//        return head.right;
//    }
//    public void dfs(TreeNode root){
//        if(root == null) return;
//        dfs(root.left);
//        cur.right = root;
//        cur = cur.right;
//        cur.left = null;
//        dfs(root.right);
//    }

    //剑指 Offer 53 - II. 0～n-1中缺失的数字
//    public int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        for(int i = 0; i < nums.length; i++) {
//            if(nums[i] != i) {
//                return i;
//            }
//        }
//        return nums.length;
//    }

    //面试题 01.09. 字符串轮转
//    public boolean isFlipedString(String s1, String s2) {
//        int len1 = s1.length();
//        int len2 = s2.length();
//        if(len1 == 0 && len2 == 0) return true;
//        if(len1 != len2) return false;
//        for(int i = 0; i < len1; i++) {
//            String tmp = s1.substring(i,len1) + s1.substring(0,i);
//            if(tmp.equals(s2)) return true;
//        }
//        return false;
//    }


   //面试题 01.04. 回文排列
//    public boolean canPermutePalindrome(String s) {
//        HashSet<Character> set = new HashSet<>();
//        for(char c : s.toCharArray()) {
//            if(set.contains(c)) {
//                set.remove(c);
//            } else {
//                set.add(c);
//            }
//        }
//        return set.size() <= 1;
//    }
    public static void main(String[] args) {
        //收件人列表
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            StringBuilder sb = new StringBuilder();
//            for(int i = 0; i <= n; i++) {
//                String s = sc.nextLine();
//                if(s.contains(",") || s.contains(" ")) {
//                    sb.append("\"").append(s).append("\"").append(", ");
//                } else {
//                    sb.append(s).append(", ");
//                }
//            }
//            String res = sb.toString();
//            System.out.println(res.substring(2,res.length() - 2));
//        }
        //客似云来
//        Scanner sc = new Scanner(System.in);
//        long[] dp = new long[85];
//        dp[0] = 1;
//        dp[1] = 1;
//        for(int i = 2; i < 85; i++) {
//            dp[i] = dp[i - 1] + dp[i - 2];
//        }
//        while (sc.hasNext()) {
//            int from = sc.nextInt();
//            int to = sc.nextInt();
//            long sum = 0;
//            for(int i = from; i <= to; i++){
//                sum += dp[i - 1];
//            }
//            System.out.println(sum);
//        }
//        String s = "aabaabaaa";
//        String t = "aaaa";
//        System.out.println(func(s, t));

        //养兔子
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            long[] dp = new long[n + 1];
//            if(n == 1) System.out.println(n);
//            if(n >= 2) {
//                dp[0] = 1;
//                dp[1] = 1;
//                for(int i = 2; i <= n; i++) {
//                    dp[i] = dp[i - 1] + dp[i - 2];
//                }
//                System.out.println(dp[n]);
//            }
//        }
    }
}
