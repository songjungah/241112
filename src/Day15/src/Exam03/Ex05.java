package Exam03;

public class Ex05 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(100);
        /*
        StringBuffer sb2 = sb.append("ABC");    // this가 있어서 sb = sb2 동일주소
        StringBuffer sb3 = sb2.append("DEF");   // this가 있어서 sb2 = sb3 동일주소
        StringBuffer sb4 = sb3.append("GHI");   // // this가 있어서 sb3 = sb4 동일주소
         */
        
        // 메서드 체이닝
        String str = sb.append("ABC")
                    .append("DEF")
                    .append("GHI")
                    .toString();
        System.out.println(str);
    }
}
