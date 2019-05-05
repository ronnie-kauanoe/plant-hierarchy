/**
* Evergreen interface.
* @author Ronnie Kauanoe
* @since 3/5/2019
*/

public interface Evergreen {
   
   /** Plant form. */
   String EVERGREEN_TYPE = "evergreen";
   
   /** Medium evergreen minimum height. */
   double EVERGREEN_MEDIUM_HT_MIN = 9.1;
   /** Medium evergreen maximum height. */
   double EVERGREEN_MEDIUM_HT_MAX = 15.2;
   /** Medium evergreen minimum width. */
   double EVERGREEN_MEDIUM_WD_MIN = 6.1;
   /** Medium evergreen maximum width. */
   double EVERGREEN_MEDIUM_WD_MAX = 12.2;
   
   /** Large evergreen minimum height. */
   double EVERGREEN_LARGE_HT_MIN = 18.3;
   /** Large evergreen maximum height. */
   double EVERGREEN_LARGE_HT_MAX = 30.5;
   /** Large evergreen minimum width. */
   double EVERGREEN_LARGE_WD_MIN = 18.3;
   /** Large evergreen maximum width. */
   double EVERGREEN_LARGE_WD_MAX = 30.5;
      
   /**
   * @param size Size of evergreen.
   * @return Mimimum height of evergreen based on size.
   */
   static double getMinHeightFromSize(String size) {
      if (size.equals("medium")) {
         return EVERGREEN_MEDIUM_HT_MIN;
      } else if (size.equals("large")) {
         return EVERGREEN_LARGE_HT_MIN;
      }
      return 0;
   }
   
   /**
   * @param size Size of evergreen.
   * @return Maximum height of evergreen based on size.
   */
   static double getMaxHeightFromSize(String size) {
      if (size.equals("medium")) {
         return EVERGREEN_MEDIUM_HT_MAX;
      } else if (size.equals("large")) {
         return EVERGREEN_LARGE_HT_MAX;
      }
      return 0;
   }

   /**
   * @param size Size of evergreen.
   * @return Mimimum width of evergreen based on size.
   */
   static double getMinWidthFromSize(String size) {
      if (size.equals("medium")) {
         return EVERGREEN_MEDIUM_WD_MIN;
      } else if (size.equals("large")) {
         return EVERGREEN_LARGE_WD_MIN;
      }
      return 0;
   }

   /**
   * @param size Size of evergreen.
   * @return Maximum width of evergreen based on size.
   */
   static double getMaxWidthFromSize(String size) {
      if (size.equals("medium")) {
         return EVERGREEN_MEDIUM_WD_MAX;
      } else if (size.equals("large")) {
         return EVERGREEN_LARGE_WD_MAX;
      }
      return 0;
   }   
}