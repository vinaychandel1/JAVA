import java.util.regex.*; 
class HelloWorld {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("ab");
        Matcher m=p.matcher("abaaaba");
        while(m.find()){
            System.out.println(m.start()+" ");
        }
    }
}
/*Output:
0 
4 
*/
