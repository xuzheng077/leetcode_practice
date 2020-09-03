package everyday;

import java.util.List;

/**
 * @author Xu Zheng
 * @description
 */
public class canVisitAllRooms {
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int[] visited = new int[rooms.size()];
        dfs(0,rooms, visited);
        for (int i : visited){
            if (i == 0){
                return false;
            }
        }
        return true;
    }

    public static void dfs(int key,List<List<Integer>> rooms,int[] visited){
        if(visited[key] == 1){
            return;
        }
        visited[key] = 1;
        List<Integer> keys = rooms.get(key);
        for (int i: keys){
            dfs(i, rooms, visited);
        }
    }

    public static void main(String[] args) {

    }

}
