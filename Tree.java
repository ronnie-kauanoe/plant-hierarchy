/**
* Tree interface.
* @author Ronnie Kauanoe
* @since 3/5/2019
*/

public interface Tree {
   
   /** Plant form. */
   String TREE_TYPE = "tree";
   
   /** Small tree minimum height. */
   double TREE_SMALL_HT_MIN = 4.6;
   /** Small tree maximum height. */
   double TREE_SMALL_HT_MAX = 9.1;
   /** Small tree minimum width. */
   double TREE_SMALL_WD_MIN = 4.6;
   /** Small tree maximum width. */
   double TREE_SMALL_WD_MAX = 3.7;
   
   /** Large tree minimum height. */
   double TREE_LARGE_HT_MIN = 15.2;
   /** Large tree maximum height. */
   double TREE_LARGE_HT_MAX = 18.3;
   /** Large tree minimum width. */
   double TREE_LARGE_WD_MIN = 15.2;
   /** Large tree maximum width. */
   double TREE_LARGE_WD_MAX = 18.3;
      
   /**
   * @param size Size of tree.
   * @return Mimimum height of tree based on size.
   */
   static double getMinHeightFromSize(String size) {
      if (size.equals("small")) {
         return TREE_SMALL_HT_MIN;
      } else if (size.equals("large")) {
         return TREE_LARGE_HT_MIN;
      }
      return 0;
   }
   
   /**
   * @param size Size of tree.
   * @return Maximum height of tree based on size.
   */
   static double getMaxHeightFromSize(String size) {
      if (size.equals("small")) {
         return TREE_SMALL_HT_MAX;
      } else if (size.equals("large")) {
         return TREE_LARGE_HT_MAX;
      }
      return 0;
   }

   /**
   * @param size Size of tree.
   * @return Mimimum width of tree based on size.
   */
   static double getMinWidthFromSize(String size) {
      if (size.equals("small")) {
         return TREE_SMALL_WD_MIN;
      } else if (size.equals("large")) {
         return TREE_LARGE_WD_MIN;
      }
      return 0;
   }

   /**
   * @param size Size of tree.
   * @return Maximum width of tree based on size.
   */
   static double getMaxWidthFromSize(String size) {
      if (size.equals("small")) {
         return TREE_SMALL_WD_MAX;
      } else if (size.equals("large")) {
         return TREE_LARGE_WD_MAX;
      }
      return 0;
   }   
}