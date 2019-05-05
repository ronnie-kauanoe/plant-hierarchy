/**
* Bulb interface.
* @author Ronnie Kauanoe
* @since 3/5/2019
*/

public interface Bulb {
   
   /** Plant form. */
   String BULB_TYPE = "bulb";
   
   /** Medium bulb minimum height. */
   double BULB_MEDIUM_HT_MIN = 0.9;
   /** Medium bulb maximum height. */
   double BULB_MEDIUM_HT_MAX = 1.8;
   /** Medium bulb minimum width. */
   double BULB_MEDIUM_WD_MIN = 0.9;
   /** Medium bulb maximum width. */
   double BULB_MEDIUM_WD_MAX = 1.8;
   
   /** Large bulb minimum height. */
   double BULB_LARGE_HT_MIN = 3.7;
   /** Large bulb maximum height. */
   double BULB_LARGE_HT_MAX = 4.6;
   /** Large bulb minimum width. */
   double BULB_LARGE_WD_MIN = 1.8;
   /** Large bulb maximum width. */
   double BULB_LARGE_WD_MAX = 2.4;
      
   /**
   * @param size Size of bulb.
   * @return Mimimum height of bulb based on size.
   */
   static double getMinHeightFromSize(String size) {
      if (size.equals("medium")) {
         return BULB_MEDIUM_HT_MIN;
      } else if (size.equals("large")) {
         return BULB_LARGE_HT_MIN;
      }
      return 0;
   }
   
   /**
   * @param size Size of bulb.
   * @return Maximum height of bulb based on size.
   */
   static double getMaxHeightFromSize(String size) {
      if (size.equals("medium")) {
         return BULB_MEDIUM_HT_MAX;
      } else if (size.equals("large")) {
         return BULB_LARGE_HT_MAX;
      }
      return 0;
   }

   /**
   * @param size Size of bulb.
   * @return Mimimum width of bulb based on size.
   */
   static double getMinWidthFromSize(String size) {
      if (size.equals("medium")) {
         return BULB_MEDIUM_WD_MIN;
      } else if (size.equals("large")) {
         return BULB_LARGE_WD_MIN;
      }
      return 0;
   }

   /**
   * @param size Size of bulb.
   * @return Maximum width of bulb based on size.
   */
   static double getMaxWidthFromSize(String size) {
      if (size.equals("medium")) {
         return BULB_MEDIUM_WD_MAX;
      } else if (size.equals("large")) {
         return BULB_LARGE_WD_MAX;
      }
      return 0;
   }   
}