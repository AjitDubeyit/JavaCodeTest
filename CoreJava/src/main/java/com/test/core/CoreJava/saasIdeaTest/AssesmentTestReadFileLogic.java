package com.test.core.CoreJava.saasIdeaTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.test.core.CoreJava.exception.Animal;

public class AssesmentTestReadFileLogic {

	static BufferedReader br = null;
	public static void main(String[] args) throws IOException {

		Map<String, List<ApiDetail>> apiDetail = new HashMap<String, List<ApiDetail>>();
		try(BufferedReader br  = new BufferedReader(new FileReader(new File("C:\\Users\\91902\\Documents\\Study_Material\\TestingFiles\\APIVersionFile")))){
			String strLine;
			while((strLine = br.readLine()) != null){
				//System.out.println(strLine);
				String []strArr = strLine.split(",");

				if(apiDetail.containsKey(strArr[0])){
					List<ApiDetail> apiDetailList = apiDetail.get(strArr[0]);
					apiDetailList.add(new ApiDetail(strArr[1], strArr[2]));
					apiDetail.put(strArr[0],apiDetailList);
				} else {
					List<ApiDetail> list = new ArrayList<ApiDetail>();
					list.add(new ApiDetail(strArr[1].toString(),strArr[2].toString()));
					apiDetail.put(strArr[0], list);
				}
			}
			//System.out.println(apiDetail);
			Map<String, List<String>> versionMap = new HashMap<String, List<String>>();
			apiDetail.forEach((k,v)->{
				System.out.println(k);
				List<ApiDetail> apiDtlList = apiDetail.get(k);
				apiDtlList.forEach(x->{
					ApiDetail apiDtl = x;
					String key = apiDtl.apiName;
					List<String> versionList = null;

					if(versionMap.containsKey(key)) {
						versionList = versionMap.get(key);
						versionList.add(apiDtl.apiVersion);
						versionMap.put(key, versionList);
					} else {
						versionList = new ArrayList<String>();
						versionList.add(apiDtl.apiVersion);
						versionMap.put(key, versionList);
					}
				});
			});
			System.out.println(versionMap);
			Map<String, String> latestMap = new HashMap<String, String>();
			versionMap.forEach((k,v)->{
				List<String> versionList = v;
				Optional<String> sfsd = versionList.stream().sorted(Comparator.reverseOrder()).findFirst();
				if(sfsd.isPresent()) {
					latestMap.put(k, sfsd.get());
					//System.out.println(sfsd.get());
				} else {
					System.out.println("Empty");
				}
			});
			//
			System.out.println(latestMap);
			
			apiDetail.forEach((k,v) -> {
				List<ApiDetail> list = v;
				list.forEach(x->{
					ApiDetail apidtl = x;
					String key = apidtl.apiName;
					String version = apidtl.apiVersion;
					if(latestMap.containsKey(key) && latestMap.get(key).equals(version)) {
						System.out.println("Latest version is: " + k + " " + key + " " + version);
						
						
					}
					
				});
			});
			
		}
	}
}

class ApiDetail{
	public String apiName;
	public String apiVersion;

	public ApiDetail(String apiName, String apiVersion) {
		this.apiName = apiName;
		this.apiVersion = apiVersion;
	}

}