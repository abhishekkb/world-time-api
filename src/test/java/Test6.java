import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Test6 {

    static Set<Character> openSet = Set.of('(', '{','[');
    static Set<Character> closeSet = Set.of(')', '}',']');
    static Map<Character, Character> pairs = Map.of('(', ')', '{', '}','[', ']');

    public boolean isValid(String s) {
        Stack stack = new Stack();
        boolean isValid = false;
        for (int i = 0; i < s.length(); i++) {
            char c =  s.charAt(i);
            char t = stack.curr();
            if(isOpenChar(c) && isOpenChar(t) || isCloseChar(c) && isCloseChar(t)){
                stack.add(c);
            } else if (isOpenChar(c) && isCloseChar(t) && isOpenClosePair(c, t)){
                stack.pop();
            } else {
                return false;
            }
        }

        return isValid;
    }

    public static boolean isOpenChar(char c) {
        return openSet.contains(c);
    }

    public static boolean isCloseChar(char c) {
        return closeSet.contains(c);
    }

    public static boolean isOpenClosePair(Character c, Character t){
        return t == pairs.get(c);
    }

    public static class Stack {
        //TODO
        public void pop(){}
        public void add(char c){}
        public char curr(){
            return '-';
        }
    }
}
