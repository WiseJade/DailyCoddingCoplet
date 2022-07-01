import java.util.ArrayList;

public class TreeDFS {
    public ArrayList<String> dfs(tree node) {
        // TODO:
        ArrayList<String> result = new ArrayList<String>();
        tree current = node;
        ArrayList<tree> child = current.getChildrenNode();
        result.add(current.getValue());
        if (child != null) {
            for (int i = 0; i < child.size(); i++) {
                result.addAll(dfs(child.get(i)));
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

