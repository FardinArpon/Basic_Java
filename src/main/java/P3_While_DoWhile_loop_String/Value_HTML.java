
/*<html>
<body>
<div>
<p>Transaction Successful</p>
<p>Trnx ID: TXN5164870</p>
</div>
</body>
</html>
Extract only transaction ID from the HTML
*/

package P3_While_DoWhile_loop_String;

class Value_html {
    public static void main(String[] args) {
        String HTMl = " <html>\n" +
                "<body>\n" +
                "<div>\n" +
                "<p>Transaction Successful</p>\n" +
                "<p>Trnx ID: TXN5164870</p>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "</html>";
        int code = HTMl.indexOf ("TXN");
        System.out.println(HTMl.substring(code,73));
    }
}
