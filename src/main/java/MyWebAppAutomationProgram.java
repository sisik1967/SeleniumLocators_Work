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
        elementActions.locateEl(elements.element011);
        elementActions.locateEl(elements.element012);
        elementActions.locateEl(elements.element013);
        elementActions.locateEl(elements.element014);
        elementActions.locateEl(elements.element015);
        elementActions.locateEl(elements.element016);
       // elementActions.locateEl(elements.element017);
       // elementActions.locateEl(elements.element018);

        //Send searchItem (16TB External Hard Drive SSD) to Search Box in Amazon.com
        elementActions.sendElement(obje.SEARCHITEM);

        //Click Enter key to search the item
        elementActions.enterKey();


        //Locate the xpath link text to select the desired item
        Thread.sleep(2000);
       elementActions.loacateXpathLinkText(elements.element021);
       elementActions.loacateXpathLinkText(elements.element022);
       elementActions.loacateXpathLinkText(elements.element023);
       elementActions.loacateXpathLinkText(elements.element024);
       elementActions.loacateXpathLinkText(elements.element025);


        //Click the located item to see the item
         elementActions.clickLocatedItem();
        Thread.sleep(2000);

        //Find or locate Add to Cart button/link
        elementActions.findAddToCartButton(elements.element031);
        elementActions.findAddToCartButton(elements.element032);
        elementActions.findAddToCartButton(elements.element033);
        elementActions.findAddToCartButton(elements.element034);
        elementActions.findAddToCartButton(elements.element035);


        //Click the located item to add the item to the shopping cart.
        elementActions.clickLocatedItem();
        Thread.sleep(2000);

       //Find or locate Proceed To Checkout Button
        elementActions.findGoToChart(elements.element061);
        elementActions.findGoToChart(elements.element062);
        elementActions.findGoToChart(elements.element063);
        elementActions.findGoToChart(elements.element064);
        elementActions.findGoToChart(elements.element065);


        //Click the located item
        elementActions.clickLocatedItem();
        Thread.sleep(3000);

        //Find or locate MailBox
        elementActions.findMailBox(elements.element081);
        elementActions.findMailBox(elements.element082);
        elementActions.findMailBox(elements.element083);
        elementActions.findMailBox(elements.element084);
        elementActions.findMailBox(elements.element085);


        //Send Email from Constants
        elementActions.sendElement(obje.EMAIL);

        //Find or locate Continue
        elementActions.findContinue(elements.element091);
        elementActions.findContinue(elements.element092);
        elementActions.findContinue(elements.element093);
        elementActions.findContinue(elements.element094);
        elementActions.findContinue(elements.element095);
        //Click the located item
        elementActions.clickLocatedItem();

        //Find or locate password
        elementActions.findPassword(elements.element101);
        elementActions.findPassword(elements.element102);
        elementActions.findPassword(elements.element103);
        elementActions.findPassword(elements.element104);
        elementActions.findPassword(elements.element105);

        //Send password from Constants
        elementActions.sendElement(obje.PASSWORD);

        elementActions.findPassword(elements.element111);
        elementActions.findPassword(elements.element112);
        elementActions.findPassword(elements.element113);
        elementActions.findPassword(elements.element114);
        elementActions.findPassword(elements.element115);
    }

}
