package com.company;

public class TextBlock {

    public static void main(String a[]) {

        String html = "<html>\n" +
                " <body>\n" +
                "     <p> hello world </p>\n" +
                " </body>\n" +
                "</html>\n";

        String java13 = """
                <html>
                   <body>
                       <p> hello world </p>
                   </body>
                </html>
                """;

        String java14 = """
                <html>
                   <body>\
                       <p> hello, '\s' world </p>\
                   </body>
                </html>
                """;

        System.out.println(html);
        System.out.println(java13);
        System.out.println(java14);
    }
}