package Genrics;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUtils {
	public static<T> void sortList
	(List<T> list, Comparator<? super T> comparator) {
		Collections.sort(list,comparator);
	}

}
