public class RString {
    public static void main(String[] args) {
        String str = "this is a string";
        String[] words = str.split(" ");
        String rString = "";
        for(int i=words.length-1;i>=0;i--){
            rString += words[i]+" ";
        }
        rString = rString.trim();
        System.out.println(rString);
    }
}
