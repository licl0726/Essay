package Demo;

public class SpriderRun {
    public static void main(String... args) {
        try {

            //开启爬虫
            Utils utils = new Utils("https://www.bodekang.com/86_86588/25246169.html",
                    "#main > div > div > div.bookname > h1",
                    "#content",
                    "#main > div > div > div.bottem2 > a.next",
                    "人世浮沉.txt");
            utils.crawl();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    void getHtmlMes(){
        Utils utils = new Utils("https://www.bodekang.com/86_86588/25246169.html",
                "#main > div > div > div.bookname > h1",
                "#content",
                "#main > div > div > div.bottem2 > a.next",
                "人世浮沉.txt");
    }
}
