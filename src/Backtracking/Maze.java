package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maze {
    public static void main(String[] args) {
        System.out.println(countMaze(3,3));
//        printPath("",3,3);
//        System.out.println(pathList("",3,3));
//        System.out.println(pathListDiagonal("",4,4));
        boolean[][] maze = {{true,true,true},
                            {true,true,true},
                            {true,true,true}};
//        System.out.println(pathAllDirections("",maze,0,0));
        int[][] path = new int[maze.length][maze.length];
        pathAllPrint("",maze,0,0,path,1);
    }
    public static int countMaze(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int count = 0;
        count+=countMaze(r-1,c);
        count+=countMaze(r,c-1);
        return count;
    }

    public static void printPath(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r == 1){
            printPath(p+"R",r,c-1);
        } else if (c==1) {
            printPath(p+'D',r-1,c);
        }else {
            printPath(p+"R",r,c-1);
            printPath(p+'D',r-1,c);
        }
    }

//    public static List<String> pathList(String p,int r,int c){
//        List<String> ans = new ArrayList<>();
//        if(r==1 && c==1){
//            ans.add(p);
//            return ans;
//        }
//        if(r>1){
//            ans.addAll(pathList(p+"D",r-1,c));
//        }
//        if(c>1){
//            ans.addAll(pathList(p+"R",r,c-1));
//        }
//        return ans;
//    }

    public static List<String> pathListDiagonal(String p,int r,int c){
        List<String> ans = new ArrayList<>();
        if(r==1 && c==1){
            ans.add(p);
            return ans;
        }
        if(r>1 && c>1){
            ans.addAll(pathListDiagonal(p+"D",r-1,c-1));
        }
        if(r>1){
            ans.addAll(pathListDiagonal(p+"V",r-1,c));
        }
        if(c>1){
            ans.addAll(pathListDiagonal(p+"H",r,c-1));
        }
        return ans;
    }

    public static List<String> pathRestrictions(String p,boolean[][] maze,int r,int c){
        List<String> ans =  new ArrayList<>();
        if(r==maze.length-1 && c==maze.length-1){
            ans.add(p);
            return ans;
        }
        if(!maze[r][c]){
            return ans;
        }
        if(r<maze.length-1){
            ans.addAll(pathRestrictions(p+"D",maze,r+1,c));
        }
        if(c<maze.length-1){
            ans.addAll(pathRestrictions(p+"R",maze,r,c+1));
        }
        return ans;
    }

    public static List<String> pathAllDirections(String p,boolean[][] maze,int r,int c){
        List<String> ans =  new ArrayList<>();
        if(r==maze.length-1 && c==maze.length-1){
            ans.add(p);
            return ans;
        }
        if(!maze[r][c]){
            return ans;
        }
        maze[r][c]=false;
        if(r<maze.length-1){
            ans.addAll(pathAllDirections(p+"D",maze,r+1,c));
        }
        if(c<maze.length-1){
            ans.addAll(pathAllDirections(p+"R",maze,r,c+1));
        }
        if(r>0){
            ans.addAll(pathAllDirections(p+"U",maze,r-1,c));
        }
        if(c>0){
            ans.addAll(pathAllDirections(p+"L",maze,r,c-1));
        }
        maze[r][c]=true;
        return ans;
    }

    public static void pathAllPrint(String p,boolean[][] maze,int r,int c,int[][] path,int step){
        if(r==maze.length-1 && c==maze.length-1){
            path[r][c] = step;
            for (int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if(r<maze.length-1){
            pathAllPrint(p+"D",maze,r+1,c,path,step+1);
        }
        if(c<maze.length-1){
            pathAllPrint(p+"R",maze,r,c+1,path,step+1);
        }
        if(r>0){
            pathAllPrint(p+"U",maze,r-1,c,path,step+1);
        }
        if(c>0){
            pathAllPrint(p+"L",maze,r,c-1,path,step+1);
        }
        maze[r][c]=true;
    }


}
