package template;

public class Main {
    public static void main(String[] args)  {
        WebsiteTemplate mainPage = new MainPage();
        WebsiteTemplate infoPage = new InfoPage();
        mainPage.showPage();

//        infoPage.showPage();

    }
}

//  WebsiteTemplate шаблон нашего сайта в котором поля header и footer статичны а функция
// showPageContent  наследуется в потомках инфо и маин , переопределяется тем самым добавляет в шаблон динамический контент
