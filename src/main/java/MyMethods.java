// This program automate:
// (i)   to open a web browser (Chrome)
// (ii)  to go to an online shopping website (Amazon.com)
// (iii) to search an item (an external hard disk)
// (iv)  to select the item
// (v)   to add the item to the shopping cart


public class MyMethods extends MyWebElements {
    public static void main(String[] args) throws InterruptedException {
        //launch browser Chrome and go to amazon.com
        launchBrowser(Constants.url);

        //Define elementActions using MyWebElements class
        MyWebElements elementActions = new MyWebElements();

       // Locate WebElement search box in Amazon.com
        elementActions.locateEl("twotabsearchtextbox");

        //Send searchItem (16TB External Hard Drive SSD) to Search Box in Amazon.com
        elementActions.searchElement("16TB External Hard Drive SSD");

        //Click Enter key to search the item
        elementActions.enterKey();


        //Locate the xpath link text to select the desired item
        elementActions.loacateXpathLinkText("//div[@data-asin='B0BPBZQZ65']//h2/a[contains(@class, 'a-link-normal')]");

        //Click the located item to see the item
        elementActions.clickLocatedItem();
        Thread.sleep(1000);

        //Find or locate Add to Cart button/link
        elementActions.findAddToCartButton("//span[@class='a-declarative']//span[@id='submit.add-to-cart']");
        Thread.sleep(1000);

        //Click the located item to add the item to the shopping cart.
        elementActions.clickLocatedItem();
    }


    //launch browser Chrome and go to amazon.com, then maximize the browser window.
    private static void launchBrowser(String url)  {
        driver.get(url);
        driver.manage().window().maximize();

    }

}
