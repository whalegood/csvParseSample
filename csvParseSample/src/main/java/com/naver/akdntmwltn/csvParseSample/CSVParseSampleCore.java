
package com.naver.akdntmwltn.csvParseSample;

import java.util.function.Function;
import java.util.stream.Collectors;

public class CSVParseSampleCore
{
	public static void main(String[] args) throws Exception
	{
		EQDataLoader loader = new EQDataLoader();
		loader.storeData(CSVParseSampleCore.class.getResourceAsStream("/csvParseSample"));
		@SuppressWarnings({ "unchecked", "rawtypes" })
		String result = (String) loader.getData().stream().map(new Function() {
			public Object apply(Object d) {
				return d.toString();
			}
		}).collect(Collectors.joining("\n"));
		System.out.println(result);
	}
}

