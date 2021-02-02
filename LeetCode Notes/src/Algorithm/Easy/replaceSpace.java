package Algorithm.Easy;

public class replaceSpace {
    public static void main(String[] args) {
        String s = "Hello World!";
//        for(int i = 0;i < s.length(); i++){
//            if(s.charAt(i).){
//                s.charAt(i) = "%20";
//            }
//        }
        String str = s.replace(" ","%20");
        System.out.println(str);
    }
}
