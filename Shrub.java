/**
* Shrub interface.
* @author Ronnie Kauanoe
* @since 3/5/2019
*/

public interface Shrub {
   
   /** Plant form. */
   String SHRUB_TYPE = "shrub";
   
   /** Small shrub minimum height. */
   double SHRUB_SMALL_HT_MIN = 0.6;
   /** Small shrub maximum height. */
   double SHRUB_SMALL_HT_MAX = 1.8;
   /** Small shrub minimum width. */
   double SHRUB_SMALL_WD_MIN = 1.5;
   /** Small shrub maximum width. */
   double SHRUB_SMALL_WD_MAX = 2.1;
   
   /** Medium shrub minimum height. */
   double SHRUB_MEDIUM_HT_MIN = 1.8;
   /** Medium shrub maximum height. */
   double SHRUB_MEDIUM_HT_MAX = 3.0;
   /** Medium shrub minimum width. */
   double SHRUB_MEDIUM_WD_MIN = 3.7;
   /** Medium shrub maximum width. */
   double SHRUB_MEDIUM_WD_MAX = 6.1;
      
   /**
   * @param size Size of shrub.
   * @return Mimimum height of shrub based on size.
   */
   static double getMinHeightFromSize(String size) {
      if (size.equals("small")) {
         return SHRUB_SMALL_HT_MIN;
      } else if (size.equals("medium")) {
         return SHRUB_MEDIUM_HT_MIN;
      }
      return 0;
   }
   
   /**
   * @param size Size of shrub.
   * @return Maximum height of shrub based on size.
   */
   static double getMaxHeightFromSize(String size) {
      if (size.equals("small")) {
         return SHRUB_SMALL_HT_MAX;
      } else if (size.equals("medium")) {
         return SHRUB_MEDIUM_HT_MAX;
      }
      return 0;
   }

   /**
   * @param size Size of shrub.
   * @return Mimimum width of shrub based on size.
   */
   static double getMinWidthFromSize(String size) {
      if (size.equals("small")) {
         return SHRUB_SMALL_WD_MIN;
      } else if (size.equals("medium")) {
         return SHRUB_MEDIUM_WD_MIN;
      }
      return 0;
   }

   /**
   * @param size Size of shrub.
   * @return Maximum width of shrub based on size.
   */
   static double getMaxWidthFromSize(String size) {
      if (size.equals("small")) {
         return SHRUB_SMALL_WD_MAX;
      } else if (size.equals("medium")) {
         return SHRUB_MEDIUM_WD_MAX;
      }
      return 0;
   }   
}