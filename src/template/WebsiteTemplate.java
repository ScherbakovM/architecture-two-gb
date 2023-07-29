package template;

public  abstract  class WebsiteTemplate {
    public void showPage() {
        System.out.println("Header\n_______");
        showPageContent();
        System.out.println("_______\nFooter");
    }

    public abstract void showPageContent();
}


