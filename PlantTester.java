/**
* Plant testing driver class.
* @author Ronnie Kauanoe
* @since 2/23/2019
*/
public class PlantTester {
   /**
   * Main method.
   * @param args Arguments. 
   */
   public static void main(String[] args) {
      System.out.println("**********Legume Family**********");
      System.out.println(new Koa("Named Koa") + "\n"); 
      System.out.println(new OahuRiverhemp("Named Oahu Riverhemp") + "\n");
      System.out.println(new HwnCoralTree("Named Hawaiian Coral Tree") + "\n");
      System.out.println("**********Soapberry Family**********");
      System.out.println(new OahuSoapberry() + "\n");
      System.out.println(new HwnSoapberry() + "\n");
      System.out.println(new Hopbush() + "\n");
      System.out.println("**********Mallow Family**********");
      System.out.println(new HwnRedHibiscus("Named HI Red Hibiscus") + "\n");
      System.out.println(new HwnCotton("Named HI Cotton") + "\n");
      System.out.println(new FloweringMaple("Named Flowering Maple") + "\n");
      System.out.println("**********Arum Family**********");
      System.out.println(new Taro() + "\n");
      System.out.println(new GiantElephantEar() + "\n");
      System.out.println(new Tarovine() + "\n");
      System.out.println("**********Mulberry Family**********");
      System.out.println(new Breadfruit("Named Breadfruit") + "\n");
      System.out.println(new ChineseBanyan("Named Chinese Banyan") + "\n");
      System.out.println(new IndianBanyan() + "\n");
      System.out.println("**********Morning Glory Family**********");
      System.out.println(new SweetPotato() + "\n");
      System.out.println(new Bayhops() + "\n");
      System.out.println(new OvalLeafClustervine() + "\n");      
   }
}