import java.util.*;
import java.io.*;


 // Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    // here -1 represents that there is a need to create the camera;
    // here 0 represents that i m covered by camera
    // here 1 represents that new camera is created
    int cameraCount;
    public int minCameraCover(TreeNode root) {
        if(root == null){
            return -1;
        }

        int req = getrequirements(root);
        if(req == -1){
            cameraCount++;
        }
        return cameraCount;
    }

    public int getrequirements(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return -1;
        }
        int lc = getrequirements(root.left);
        int rc = getrequirements(root.right);
        if(lc == -1 || rc == -1){
            cameraCount++;
            return 1;
        }else if(lc == 1 || rc == 1){
            return 0;
        }else{
            return -1;
        }
    }

}