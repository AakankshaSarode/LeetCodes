class Solution {
    private int connectedComponentCount=0;

   public int removeStones(int[][] stones) {
        int [] setRepresentatives= new int[20003];
          for(int [] stone :stones){
            mergeComponents(stone[0]+1,stone[1]+10002,setRepresentatives);

           
          }
          return stones.length-connectedComponentCount;
   }
    private int findRepresentative( int element, int[]setRepresentatives){
       if(setRepresentatives[element]==0){
            setRepresentatives[element]=element ;
             connectedComponentCount++;

       } return setRepresentatives[element]== element ? element :
       (setRepresentatives[element]= findRepresentative(setRepresentatives[element], setRepresentatives));
    }
     private void mergeComponents(int elementA, int elementB, int[] setRepresentatives){
       int repA= findRepresentative(elementA, setRepresentatives);
        int repB= findRepresentative(elementB, setRepresentatives);
         if(repA !=repB){
            setRepresentatives[repB]=repA;
             connectedComponentCount--;
         }
     }
}