import java.util.ArrayList;
import java.util.*;

public class TreeBFS {

    public ArrayList<String> bfs(tree node) {
        ArrayList<String> result = new ArrayList<>();
        Queue<tree> queue = new LinkedList<>();
        // 입력받은 노드를 큐에 집어 넣는다.
        queue.offer(node);
        // 큐가 비어있지 않으면 반복문을 반복한다.
        while(!queue.isEmpty()){
            tree current = queue.poll();
            result.add(current.getValue());
            if(current.getChildrenNode() != null) {
                current.getChildrenNode().forEach(queue::offer);
            }
        }
        return result;
    }

    //아래 클래스의 내용은 수정하지 말아야 합니다.
    public static class tree {
        private String value;
        private ArrayList<tree> children;

        public tree(String data) {
            this.value = data;
            this.children = null;
        }

        public tree addChildNode(tree node) {
            if (children == null) children = new ArrayList<>();
            children.add(node);
            return children.get(children.size() - 1);
        }

        public String getValue() {      //현재 노드의 데이터를 반환
            return value;
        }

        public ArrayList<tree> getChildrenNode() {
            return children;
        }
    }
}

