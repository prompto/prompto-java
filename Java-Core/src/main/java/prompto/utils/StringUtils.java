package prompto.utils;

import java.util.ArrayList;
import java.util.List;

public abstract class StringUtils {

	public static String capitalizeFirst(String value) {
		return Character.toUpperCase(value.charAt(0)) + value.substring(1).toLowerCase();
	}

	public static String capitalizeAll(String value) {
		String[] parts = value.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String part : parts) {
			sb.append(capitalizeFirst(part));
			sb.append(' ');
		}
		if(sb.length()>0)
			sb.setLength(sb.length()-1); // trim last ' '
		return sb.toString();
	}

	public static Character[] stringToCharacterArray(String value) {
		char[] chars = value.toCharArray();
		List<Character> list = new ArrayList<Character>(chars.length);
		for(int i=0;i<chars.length;i++)
			list.add(chars[i]);
		return list.toArray(new Character[chars.length]);
	}

}
