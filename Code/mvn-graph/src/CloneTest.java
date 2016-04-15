/**
 * 
 */

/**
 * @author narender
 *
 */
public class CloneTest {
	private static final String FIRSTNAME="Narender";
	private static final String MIDDLENAME="Singh";
	private static final String LASTNAME="Tanwar";
	/**
	 * 
	 */
	public CloneTest() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ap="<<FIRSTNAME>>";// <<MIDDLENAME>> <<LASTNAME>>";
		
		System.out.println(call(ap));
		String apClone=ap;
		/*System.out.println(apClone + " ap "+ap);
		ap+="Tanwar";
		System.out.println(apClone + " ap "+ap);*/

	}	
	
	private static String call(final String ap){
		StringBuffer responseAp=new StringBuffer(ap);
		/*if(responseAp.indexOf("<<FIRSTNAME>>")){
			
		}*/
		System.out.println("responseAp : "+responseAp+" -> responseAp.indexOf(\"<<FIRSTNAME>>\")"+responseAp.indexOf("<<FIRSTNAME>>"));
		return responseAp.toString();
	}

}
