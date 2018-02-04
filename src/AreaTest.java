import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hsc
 *
 * Aug 20, 2017
 */
public class AreaTest {

	public static void main(String[] args) {
		Area area = new Area();
		System.out.println(area.getAddress("440303000000", area.getAreaList()));
//		File file = new File("files/area.txt");
//		Map<String,String> map = new HashMap<String, String>();
//		try {
//			InputStreamReader read = new InputStreamReader(new FileInputStream(file),"GBK");
//			BufferedReader br = new BufferedReader(read);
//			String s = null;
//			while((s = br.readLine()) != null){
//				String code = s.substring(s.length()-13,s.length()-1);
//				String name = s.substring(0,s.length()-14);
//				if(code.subSequence(2, code.length()).equals("0000000000")){
//					map.put(code, name);
////					System.out.println(name + "  code:" + code + "  省级");
//				}
//				if(!code.subSequence(2, 4).equals("00") && code.subSequence(4, code.length()).equals("00000000")){
//					String sCode = code.substring(0,2) + "0000000000";
//					name = name.substring(map.get(sCode).length(), name.length());
//					map.put(code, name);
////					System.out.println(name + "  code:" + code + "  市级");
//				}
//				if(!code.subSequence(4, 6).equals("00") && code.subSequence(6, code.length()).equals("000000")){
//					String sCode = code.substring(0,4) + "00000000";
//					if(map.get(sCode) != null){
//						name = name.substring(map.get(sCode).length(), name.length());
//					}else{
//						map.put(sCode, map.get(code.substring(0,2) + "0000000000"));
////						System.out.println(map.get(sCode) + "  code:" + sCode + "  县/区级");
//						name = name.substring(map.get(code.substring(0,2) + "0000000000").length(), name.length());
//					}					
//					map.put(code, name);
////					System.out.println(name + "  code:" + code + "  县/区级");
//				}
//			}
//			br.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		for(Map.Entry<String, String> e : map.entrySet()){
//			System.out.println(e.getValue() + "\t" + e.getKey());
//		}
		
	}
	
}
