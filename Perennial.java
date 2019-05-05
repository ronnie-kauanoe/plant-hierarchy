/**
* Perennial interface.
* @author Ronnie Kauanoe
* @since 3/5/2019
*/

public interface Perennial {
   
   /** Plant form. */
   String PERENNIAL_TYPE = "perennial";

   /** Small perennial minimum height. */
   double PERENNIAL_SMALL_HT_MIN = 0.2;
   /** Small perennial maximum height. */
   double PERENNIAL_SMALL_HT_MAX = 0.3;
   /** Small perennial minimum width. */
   double PERENNIAL_SMALL_WD_MIN = 0.9;
   /** Small perennial maximum width. */
   double PERENNIAL_SMALL_WD_MAX = 2.1;
   
   /** Medium perennial minimum height. */
   double PERENNIAL_MEDIUM_HT_MIN = 0.3;
   /** Medium perennial maximum height. */
   double PERENNIAL_MEDIUM_HT_MAX = 0.9;
   /** Medium perennial minimum width. */
   double PERENNIAL_MEDIUM_WD_MIN = 2.1;
   /** Medium perennial maximum width. */
   double PERENNIAL_MEDIUM_WD_MAX = 4.6;
      
   /**
   * @param size Size of perennial.
   * @return Mimimum height of perennial based on size.
   */
   static double getMinHeightFromSize(String size) {
      if (size.equals("small")) {
         return PERENNIAL_SMALL_HT_MIN;
      } else if (size.equals("medium")) {
         return PERENNIAL_MEDIUM_HT_MIN;
      }
      return 0;
   }
   
   /**
   * @param size Size of perennial.
   * @return Maximum height of perennial based on size.
   */
   static double getMaxHeightFromSize(String size) {
      if (size.equals("small")) {
         return PERENNIAL_SMALL_HT_MAX;
      } else if (size.equals("medium")) {
         return PERENNIAL_MEDIUM_HT_MAX;
      }
      return 0;
   }

   /**
   * @param size Size of perennial.
   * @return Mimimum width of perennial based on size.
   */
   static double getMinWidthFromSize(String size) {
      if (size.equals("small")) {
         return PERENNIAL_SMALL_WD_MIN;
      } else if (size.equals("medium")) {
         return PERENNIAL_MEDIUM_WD_MIN;
      }
      return 0;
   }

   /**
   * @param size Size of perennial.
   * @return Maximum width of perennial based on size.
   */
   static double getMaxWidthFromSize(String size) {
      if (size.equals("small")) {
         return PERENNIAL_SMALL_WD_MAX;
      } else if (size.equals("medium")) {
         return PERENNIAL_MEDIUM_WD_MAX;
      }
      return 0;
   }   
}