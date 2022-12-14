import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyElements extends Driver{
        public By element01= By.id("twotabsearchtextbox");
        public By element02=By.xpath("//div[@data-asin='B0BPBZQZ65']//h2/a[contains(@class, 'a-link-normal')]");
        public By element03=By.xpath("//span[@class='a-declarative']//span[@id='submit.add-to-cart']");
       /*
       public By element04= By.className("a-size-medium a-color-base a-text-normal");
       public By element05=By.xpath("//span[@class='a-button-text' and @id='submit.add-to-cart-announce']");
        */

        /*
        <input name="proceedToRetailCheckout" data-feature-id="proceed-to-checkout-action"
        class="a-button-input" type="submit" value="Proceed to checkout" aria-labelledby="sc-buy-box-ptc-button-announce">
         */
        public By element06=By.cssSelector("a[class*=a-button-text]");

        /*
        <input name="proceedToRetailCheckout" data-feature-id="proceed-to-checkout-action" class="a-button-input" type="submit"
        value="Proceed to checkout" aria-labelledby="sc-buy-box-ptc-button-announce">
        */
        public By element07=By.cssSelector("input[type=submit][value*=Proceed]");

        /*
        <input type="email" maxlength="128" id="ap_email" name="email" tabindex="1" class="a-input-text a-span12 auth-autofocus auth-required-field">
        */
       // public By element08=By.xpath("/html/body/div[1]/div[1]/div[2] //input[1]");
        public By element08=By.id("ap_email");
        public By element09=By.cssSelector("span#continue");

        /*
        <input type="password" maxlength="1024" id="ap_password"
        name="password" tabindex="2" class="a-input-text a-span12 auth-autofocus auth-required-field">
        ↓↓↓↓ */
        public By element10=By.cssSelector("input#ap_password");

}
