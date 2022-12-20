import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class MyElements extends Driver{


        /* ---------------------------------On working html code-----------------------------------------------
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
        placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search" spellcheck="false">
         */
        public By  element011= By.id("twotabsearchtextbox");
        public By  element012= By.cssSelector("input#twotabsearchtextbox");//By.cssSelector("tag#id[attribute=value][attribute=value]")
        public By  element013= By.cssSelector("input.nav-input[name='field-keywords']"); //By.cssSelector("tag.className[attribute=value][attribute=value]")
        public By  element014= By.cssSelector("input[dir='auto']");//By.cssSelector("tag[attribute='value']")
        public By  element015= By.cssSelector("input[class^='nav-input']");//By.cssSelector(input[attribute^='prefixValue'])
        public By  element016= By.cssSelector("#twotabsearchtextbox");//By.cssSelector("#id") performanssız çalışan!
        public By  element017= By.xpath("//*[@id='twotabsearchtextbox']");
        public By  element018= By.xpath("//input[@name='field-keywords']");//By.xpath("(//span[@class='text'])[5]");

 /* ---------------------------------On working html code-----------------------------------------------

<a class="a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal" href="/gp/slredirect/picassoRedirect.html/ref=pa_sp_atf_aps_sr_pg1_1?ie=UTF8&…xternal%2BHard%2BDrive%2BSSD%26qid%3D1671362439%26sr%3D8-1-spons%26psc%3D1">
<span class="a-size-medium a-color-base a-text-normal">16TB External Hard Drive SSD，Portable External Solid State Drive 16TB-Reading Speeds up to 500Mb/s，USB 3.1 Type C SSD Compatible with Desktops,Laptops,PC, XS Windows-Black</span>
    </a>  */


        //public By element021=By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span");
        public By element021=By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[11]/div/div/div/div/div/div/div/div[2]/div/div/div/h2/a");

        //*[@id="search"]/div[1]/div[1]/div/span[1]/div[1]/div[11]/div/div/div/div
       // public By element022=By.xpath("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span");
        public By element022=By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[7]/a");
        public By element023=By.partialLinkText("16TB External Hard Drive SSD");

        // public By element024=By.linkText("16TB External Hard Drive SSD，Portable External Solid State Drive 16TB-Reading Speeds up to 500Mb/s，USB 3.1 Type C SSD Compatible with Desktops,Laptops,PC, XS Windows-Black");//link değişince hata veriyor yaklaşık çalışma süresi 15 dk
        public By element024=By.linkText("16TB External Hard Drive SSD，Portable External Solid State Drive,Black.Reading Speeds up to 500Mb/s，USB 3.1 Type C SSD Compatible with Desktops,Laptops,PC, XS Windows");//link değişince hata veriyor yaklaşık çalışma süresi 15 dk

      //    public By element025=By.xpath("(//h2)[1]");
        public By element025=By.xpath("(//h2)[1][@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']/a");



        /* ---------------------------------On working html code-----------------------------------------------
       <input id="add-to-cart-button" name="submit.add-to-cart" title="Add to Shopping Cart" data-hover="Select <b>__dims__</b> from the left<br> to add to Shopping Cart"
       data-ref class="a-button-input" type="submit" value="Add to Cart" aria-labelledby="submit.add-to-cart-announce" formaction="/cart/add-to-cart/ref=dp_start-bbf_1_glance">
        */
        public By element031=By.xpath("//span[@class='a-declarative']//input[@value='Add to Cart']");
        public By element032=By.cssSelector("[name='submit.add-to-cart']");
        public By element033=By.id("add-to-cart-button");
        //public By element034=By.cssSelector("input[type=submit]");
        public By element034=By.cssSelector("input[data-hover$='Cart']");

        public By element035=By.xpath("(//input[@type='submit'])[2]");

/*
<input name="proceedToRetailCheckout" data-feature-id="proceed-to-checkout-action" class="a-button-input" type="submit"
value="Proceed to checkout" aria-labelledby="sc-buy-box-ptc-button-announce">
 */

 //       public By element061=By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[2]/div/div[1]/form/span/span/span/input");
        public By element061=By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[2]/div/div[3]/div/div/form");


        public By element062=By.name("proceedToRetailCheckout");
       //public By element063=By.cssSelector("input.a-button-input[type='submit']");
        public By element063=By.cssSelector("input.a-button-input[type='submit'][aria-labelledby='sc-buy-box-ptc-button-announce']");

        public By element064=By.xpath("//input[@value='Proceed to checkout']");
        public By element065=By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input");


        /*
        <input type="email" maxlength="128" id="ap_email" name="email" tabindex="1" class="a-input-text a-span12 auth-autofocus auth-required-field">
        */
        public By element081=By.id("ap_email");
        public By element082=By.xpath("//*[@id='ap_email']");
        public By element083=By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[1]/input[1]");
        public By element084=By.xpath("/html/body/div[1]/div[1]/div[2]/div//div/div[1]/input[1]");
        public By element085=By.cssSelector("input[type=email]");


        public By element091=By.cssSelector("span#continue");
        public By element092=By.xpath("//span[@id='continue']");
        public By element093=By.cssSelector("input[aria-labelledby='continue-announce'");
        public By element094=with(By.id("continue")).below(element081);
        public By element095=with(By.className("a-button-text")).below(element085);


        /*
        <input type="password" maxlength="1024" id="ap_password"
        name="password" tabindex="2" class="a-input-text a-span12 auth-autofocus auth-required-field">
        ↓↓↓↓ */
        public By element101=By.cssSelector("input#ap_password");
        public By element102=By.xpath("//div/div/div/div/div/div/form/div/div[1]/input");
        public By element103=By.tagName("Password");
        public By element104=By.xpath("//div/div/div/div/div/div/form/div/div[1]/input[@id='ap_password']");
        public By element105=By.id("ap_password");

        public By element111=By.cssSelector("input.a-button-input[type='submit'][aria-labelledby='auth-signin-button-announce']");
        public By element112=By.xpath("//div/div/div/div/div/div/form/div/div[2]/span/span/input[@id='signInSubmit']");
        public By element113=By.tagName("Sign in");
        public By element114=By.className("a-button-input");
        public By element115=By.id("signInSubmit");
}
