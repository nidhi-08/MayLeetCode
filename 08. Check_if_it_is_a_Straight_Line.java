class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==2){    //if only two points, there is a line passing through
            return true;
        }
        else{   //else take the cross product
            int x=coordinates[1][0]-coordinates[0][0];
            int y=coordinates[1][1]-coordinates[0][1];
            for(int i=2 ;i<coordinates.length; i++){
                int x1=coordinates[i][0]-coordinates[0][0];
                int y1=coordinates[i][1]-coordinates[0][1];
                
                int cross = x1*y - y1*x;
                if(cross != 0){   //if cross product is zero then lines are linear
                    return false;
                }
            }
        }
        return true;
    }
}
