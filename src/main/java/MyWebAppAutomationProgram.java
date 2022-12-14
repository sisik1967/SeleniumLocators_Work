// This program automate:
// (i)   to open a web browser (Chrome)
// (ii)  to go to an online shopping website (Amazon.com)
// (iii) to search an item (an external hard disk)
// (iv)  to select the item
// (v)   to add the item to the shopping cart


public class MyWebAppAutomationProgram extends MyMethods {
    public static void main(String[] args) throws InterruptedException {
        Constants obje=new Constants();



        //Define elementActions using MyWebElements class
        MyMethods elementActions = new MyMethods();

        //launch browser Chrome and go to amazon.com
        elementActions.launchBrowser(obje.url);

       // Locate WebElement search box in Amazon.com
        elementActions.locateEl("twotabsearchtextbox");

        //Send searchItem (16TB External Hard Drive SSD) to Search Box in Amazon.com
        elementActions.searchElement(obje.searchItem);

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




}
