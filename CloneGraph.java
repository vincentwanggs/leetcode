public class  CloneGraph{
   public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
      if (node == null)
        return node;
      
      HashMap<UndirectedGraphNode, UndirectedGraphNode> old2new = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
      
      ArrayList<UndirectedGraphNode> queue = new ArrayList<UndirectedGraphNode>();
      
      queue.add(node);
      UndirectedGraphNode newGraph = new UndirectedGraphNode(node.label);
      old2new.put(node,newGraph);
      while (queue.size() > 0){
        UndirectedGraphNode cur = queue.get(0);
        queue.remove(0);
        
        UndirectedGraphNode newNode = new UndirectedGraphNode(cur.label);
        
        ArrayList<UndirectedGraphNode> neighbors = (ArrayList<UndirectedGraphNode>)cur.neighbors;
        
        for (int i = 0; i < neighbors.size(); i ++){
          UndirectedGraphNode n = neighbors.get(i);
          if (old2new.containsKey(n)){// the current node has been processed before
            old2new.get(cur).neighbors.add(old2new.get(n));
           // newNode.neighbors.add();
          }
          else{
            UndirectedGraphNode tmp = new UndirectedGraphNode(n.label);
            old2new.put(n,tmp);
            old2new.get(cur).neighbors.add(tmp);
            queue.add(n);
          }
        }
        
      }
      return newGraph;
    }
}
