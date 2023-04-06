public class Test1 {

    private static Object obj = new Object();
    private static T2 t2;

//    static {
//        t2 = new T2();
//    }

    public static T2 getT2 (){
        synchronized (obj){
            if(t2 == null){
                t2 = new T2();
            }
        }
        return t2;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 50, -10, 40, 50};
        int x = arr[0];
        int y =  arr[1];

        for (int i = 2; i < arr.length; i++) {
            int t = arr[i];
            //x < t < y
            if(t > x && y > t) {
                x = t;
            }
            // x < y < t
            if (y < t) {
                x = y;
                y = t;
            }

        }
    }

    private static class T2 {

        private static Object obj = new Object();
        private T2() {
        }

        public static T2 getT2 (){
            synchronized (obj){
                if(t2 == null){
                    t2 = new T2();
                }
            }
            return t2;
        }

    }

}

