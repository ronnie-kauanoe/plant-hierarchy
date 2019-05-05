/**
* Vine interface.
* @author Ronnie Kauanoe
* @since 3/5/2019
*/
public interface Vine {

   /** Plant form. */
   String VINE_TYPE = "vine";
   
   /** Large vine minimum height. */
   double VINE_LARGE_HT_MIN = 9.1;
   /** Large vine maximum height. */
   double VINE_LARGE_HT_MAX = 21.3;
   /** Large vine minimum width. */
   double VINE_LARGE_WD_MIN = 1.8;
   /** Large vine maximum width. */
   double VINE_LARGE_WD_MAX = 3.0;
      
   /**
   * @param size Size of vine.
   * @return Mimimum height of vine based on size.
   */
   static double getMinHeightFromSize(String size) {
      if (size.equals("large")) {
         return VINE_LARGE_HT_MIN;
      }
      return 0;
   }
   
   /**
   * @param size Size of vine.
   * @return Maximum height of vine based on size.
   */
   static double getMaxHeightFromSize(String size) {
      if (size.equals("large")) {
         return VINE_LARGE_HT_MAX;
      }
      return 0;
   }

   /**
   * @param size Size of vine.
   * @return Mimimum width of vine based on size.
   */
   static double getMinWidthFromSize(String size) {
      if (size.equals("large")) {
         return VINE_LARGE_WD_MIN;
      }
      return 0;
   }

   /**
   * @param size Size of vine.
   * @return Maximum width of vine based on size.
   */
   static double getMaxWidthFromSize(String size) {
      if (size.equals("large")) {
         return VINE_LARGE_WD_MAX;
      }
      return 0;
   }   
}