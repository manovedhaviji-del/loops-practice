import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        StringBuilder sb = new StringBuilder();
        // 5 வார்த்தைகளை இன்புட்டாக வாங்குதல்
        for (int i = 0; i < 5; i++) {
            if (sc.hasNext()) {
                sb.append(sc.next());
                if (i < 4) {
                    sb.append(" ");
                }
            }
        }
        
        String finalSentence = sb.toString();
        System.out.println(finalSentence);
        
        // முழு வாக்கியத்தையும் ரிவர்ஸ் செய்தல்
        sb.reverse();
        System.out.println(sb.toString());
    }
}
