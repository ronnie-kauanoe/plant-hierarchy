/**
* Oahu Soapberry plant class.
* @author Ronnie Kauanoe
* @since 3/1/2019
*/

public class OahuSoapberry extends Soapberry implements Tree {
   
   /** Scientific plant name. */
   private static String sciPlantName = "Sapindus oahuensis";
   /** Common plant name. */
   private static String commonPlantName = "O\'ahu soapberry";
   /** Hawaiian plant name. */
   private static String hiPlantName = "lonomea";
   /** Plant origin. */
   private static String origin = "endemic";
   /** Conservation status. */
   private static String status = "safe";
   /** Plant form. */
   private static String plantForm = TREE_TYPE;
   /** Size of plant. */
   private static String plantSize = "large";
   /** Latitude of plant's location. */
   private static double latitude = 21.271475;
   /** Longitude of plant's location. */
   private static double longitude = -157.801260;
   
   /**
   * OahuSoapberry constructor without name tag.
   */
   public OahuSoapberry() {
      super(sciPlantName, commonPlantName, hiPlantName, "",
      origin, status, plantForm, plantSize,
      Tree.getMinHeightFromSize(plantSize),
      Tree.getMaxHeightFromSize(plantSize),
      Tree.getMinWidthFromSize(plantSize),
      Tree.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }
      
   /**
   * OahuSoapberry constructor with name tag.
   * @param nameTag user-defined name for plant
   */
   public OahuSoapberry(String nameTag) {
      super(sciPlantName, commonPlantName, hiPlantName, nameTag,
      origin, status, plantForm, plantSize,
      Tree.getMinHeightFromSize(plantSize),
      Tree.getMaxHeightFromSize(plantSize),
      Tree.getMinWidthFromSize(plantSize),
      Tree.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }   
}