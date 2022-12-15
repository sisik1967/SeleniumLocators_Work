// This program automate:
// (i)   to open a web browser (Chrome)
// (ii)  to go to an online shopping website (Amazon.com)
// (iii) to search an item (an external hard disk)
// (iv)  to select the item
// (v)   to add the item to the shopping cart
// (vi)  to click go to Cart
// (iv)  to click Proceed to checkout
// (v)   to find email box and fill email
// (vi)  to continue and find password box and fill password


public class MyWebAppAutomationProgram extends MyMethods {
    public static void main(String[] args) throws InterruptedException {
        Constants obje=new Constants();

        MyElements elements = new MyElements();

        //Define elementActions using MyWebElements class
        MyMethods elementActions = new MyMethods();

        //launch browser Chrome and go to amazon.com
        elementActions.launchBrowser(obje.URL);

       // Locate WebElement search box in Amazon.com
        elementActions.locateEl(elements.element01);

        //Send searchItem (16TB External Hard Drive SSD) to Search Box in Amazon.com
        elementActions.searchElement(obje.SEARCHITEM);

        //Click Enter key to search the item
        elementActions.enterKey();


        //Locate the xpath link text to select the desired item
        elementActions.loacateXpathLinkText(elements.element02);

        //Click the located item to see the item
        elementActions.clickLocatedItem();
        Thread.sleep(1000);

        //Find or locate Add to Cart button/link
        elementActions.findAddToCartButton(elements.element03);
        Thread.sleep(1000);

        //Click the located item to add the item to the shopping cart.
        elementActions.clickLocatedItem();

       //Find or locate Proceed To Checkout Button
        elementActions.findGoToChart(elements.element06);

        //Click the located item
        elementActions.clickLocatedItem();

        //Find or locate Proceed To Checkout Button
        elementActions.findProceedToCheckoutButton(elements.element07);

        //Click the located item
        elementActions.clickLocatedItem();

        //Find or locate MailBox
        elementActions.findMailBox(elements.element08);

        //Send Email from Constants
        elementActions.searchElement(obje.EMAIL);

        //Find or locate Continue
        elementActions.findContinue(elements.element09);

        //Click the located item
        elementActions.clickLocatedItem();

        //Find or locate password
        elementActions.findPassword(elements.element10);

        //Send password from Constants
        elementActions.searchElement(obje.PASSWORD);


    }

}
