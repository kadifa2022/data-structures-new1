package com.cydeo.tree;

public class IsSameTree {



    public boolean isSameTree(TreeNode p, TreeNode q){

        if(p == null && q ==null)
            return true;//skipin
        if(p == null || q == null)
            return false;//skiping
        if(p.val != q.val)return false;
        return isSameTree(p.right, q.right) &&
                isSameTree(p.left, q.left);//reqursive call



    }

}
