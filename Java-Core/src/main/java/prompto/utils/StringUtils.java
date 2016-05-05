package prompto.utils;

import java.util.ArrayList;
import java.util.List;

public abstract class StringUtils {

	public static String capitalizeFirst(String value) {
		return Character.toUpperCase(value.charAt(0)) + value.substring(1).toLowerCase();
	}

	public static Character[] stringToCharacterArray(String value) {
		char[] chars = value.toCharArray();
		List<Character> list = new ArrayList<Character>(chars.length);
		for(int i=0;i<chars.length;i++)
			list.add(chars[i]);
		return list.toArray(new Character[chars.length]);
	}

}
