public class RepeatLettersToSymbol{
    public static void main(String[] args) {
        String str="Hello worl";
        System.out.println(repeatLettersToSymbol(str));
    }

    public static String repeatLettersToSymbol(String str){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char current=str.charAt(i);
            boolean repeat=false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j)==current) {
                    repeat=true;
                    break; 
                }
                
            }
            if (repeat) {
                sb.append("?");
            }else{
                sb.append(current);
            }
        }

        return sb.toString();
    }
}