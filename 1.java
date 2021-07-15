import java.util.*;

class Solution {
    public int slidingPuzzle(int[][] board) {
       ArrayList<Integer> [] swap = new ArrayList[2*3];
        int [][] dir = {{-1,0},{0,1},{1,0},{0,-1}};
        for(int i = 0; i< swap.length; i++){
            swap[i] = new ArrayList<>();
        }
        
        String str = "";
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j] == 0){
                    str+="_";
                }else{
                    str += board[i][j];
                }
                int currCellNo = i*board[0].length + j;
                for(int d = 0; d<dir.length; d++){
                    int row = i + dir[d][0];
                    int col = j + dir[d][1];
                    if(row >= 0 && row < board.length && col >= 0 && col < board[0].length){
                        int cellNo = row*board[0].length + col;
                        swap[currCellNo].add(cellNo);
                    }
                }
            }
        }
        
        HashSet<String> set = new HashSet<>();
        LinkedList<String> q = new LinkedList<>();
        q.addFirst(str);
        set.add(str);
        int level = 0;
        while(q.size() > 0){
            int size = q.size();
            while( size != 0){
                String rem = q.removeFirst();
                if(set.contains(rem)){
                    continue;
                }
                set.add(rem);
                
                int bIdx = getBlankidx(rem);
				ArrayList<Integer> pswaps = swap[bIdx];
                for(int i = 0; i<pswaps.size(); i++){
                    int vIdx = pswaps.get(i);
                    String nstr = swap(rem,bIdx, vIdx);
                    if(set.contains(nstr) == false){
                        q.add(nstr);
                    }
                }
                size--;
            }
            level++;
        }
        return level;
        
    }
    
    public int getBlankidx(String str){
        for(int i = 0; i<str.length(); i++){
            char ch =str.charAt(i);
            if(ch == '_'){
                return i;
            }
        }
        return -1;
    }
    
    public String swap(String str, int bi, int vi){
        char bc = str.charAt(bi);
        char vc = str.charAt(vi);
        if(vi < bi){
            String sp = str.substring(0,vi);
            String mp = str.substring(vi+1, bi);
            String lp = str.substring(bi+1);
            return sp + bc + mp + vc + lp; 
        }else{
            String sp = str.substring(0,bi);
            String mp = str.substring(bi+1, vi);
            String lp = str.substring(vi+1);
            return sp + vc + mp + bc + lp; 
        }
	}
}