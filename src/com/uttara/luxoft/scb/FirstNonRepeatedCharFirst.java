package com.uttara.luxoft.scb;




import java.util.*;

public class FirstNonRepeatedCharFirst {

	public static void main(String[] args) {
//		String token = "eyJhbGciOiJSUzI1NiIsImtpZCI6IjUyNmJmMTE4LTdiYzYtNDliYi1hNDIzLWY1OGFhZWZmZDc4NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsiaHR0cHM6Ly9sZWdhY3ktc3RyYXR1cy5pdGcub2MuaHAuY29tL3NjIiwiaHR0cHM6Ly9sZWdhY3ktc3RyYXR1cy5pdGcub2MuaHAuY29tL2dwIiwiaHR0cHM6Ly9yZWdpc3RyeS1yZWxhdGlvbnNoaXAuaXRnLm9jLmhwLmNvbSIsImh0dHBzOi8vYWRkcmVzcy1pZGVudGl0eS5pdGcub2MuaHAuY29tIiwiaHR0cHM6Ly9hZ2dyZWdhdGlvbi1yZWxhdGlvbnNoaXAuaXRnLm9jLmhwLmNvbSIsImh0dHBzOi8vb2F1dGgtYXV0aC5pdGcub2MuaHAuY29tIl0sImF1dGhfdGltZSI6MS43MzgwMDExMjdlKzA5LCJhdXRob3JpemF0aW9uX2RldGFpbHMiOltdLCJjaWQiOiIxZWUwZmFmNC03OGM4LTRmMWUtYjEzNi01ZTcyZGNjOGY3NjYiLCJleHAiOjE3MzgwMDIxODMsImV4dGVybmFsT3JnUmVmSURzIjpbeyJvY19vcmdfaWQiOiI3NjlhYzU3Zi1jMTg3LTQ3YTAtOTVhZi1jMjExN2RmZWU2OWEiLCJ0eXBlIjoiRVhURVJOQUxfT1JHX0lERU5USUZJRVJfVFlQRV9TVFJBVFVTIiwidmFsdWUiOiI3ZWNlNjMwOC04MGJiLTQzMDMtOGM0Yi04NzNmOTEyZGFlNWMifV0sImV4dGVybmFsVXNlclJlZklEcyI6W10sImlhdCI6MTczODAwMTI4MywiaWRwX3R5cGUiOiJocGlkIiwiaWRwX3VzZXJfaWQiOiI4enJrd2dnZDhyNThxYXNzbm9vYXVxcjNmMXdvbm81bSIsImlkdHlwIjoidXNlciIsImlzcyI6Imh0dHBzOi8vb2F1dGgtYXV0aC1pdGcuYXBpLm5vbi1wcm9kLXV3Mi5ocG9uZWNsb3VkLmlvL29hdXRoMi92MS9ocG9jLWl0ZyIsImp0aSI6ImUwZWU0YjFlLTcwNzktNGUzYi1iNTViLTA1NWM2M2VhOWIxZiIsInByb2pfcmVmIjoiN2JmYmM3MjItMzZlNi00MTA5LTkwYjktZjA0MTUxMGVjZTNmIiwic2EiOiJVc2VyVGVzdENvcHRvclYyQHN0cmF0dXNpbnQtaXRnLmhwb2Mtc2EuY29tIiwic2NwIjpbIm9wZW5pZCIsIm9mZmxpbmUiXSwic3ViIjoiNzNhMGRlZjYtNTNkMS00N2E1LWFhODctOTRlOTk1NGJmZTNmIiwidGVuYW50cyI6W3sib25fYmVoYWxmX29mIjpbXSwicGVybWlzc2lvbl9tYXNrcyI6W10sInJvbGVzIjpbIjE0ZDEwZjVkLTIwNjMtNGNmYy1iNTIyLTAzY2RlOGYxNThmNiJdLCJ0ZW5hbnRfZnFpZCI6IjVjMWMyNTQ3YmY5NjVkZWUwMDQ2NWEzYi83NjlhYzU3Zi1jMTg3LTQ3YTAtOTVhZi1jMjExN2RmZWU2OWEiLCJ0ZW5hbnRfaWQiOiI3NjlhYzU3Zi1jMTg3LTQ3YTAtOTVhZi1jMjExN2RmZWU2OWEifV19.yDvR8DsUHoLtCbi-qy3cfM3nj0MONi24l9ZOf_iOeOHZ7I4NYOv1c-RelIhGX8aQsSO7jWfHNoZfpuOrZrlk_M8zIwKsl4C0r5j2djKtKdTIvzKwAEcAZZ1TbCIYKGp6_jOcGgJ5y99gPmxthEAb8veIpNsvZ6cWyOa9brj69XMg5GTsf1QMmmW5c67jJH5KajxFaY4nY0Td8VRD9xoFl3LEmVm02BDADBGHQGRtWED_wLAFxecXXdyGRMmV_8r5OTciSnTI9rbZNvzqw9kCRU-lVetKLaxtwnjT3KBZqpUuIADGFOzQP4-q-FBpEcabKbcoFJSbpvLWrYiRaDY9Pg";
//		System.out.println(isOcToken(token));
	//	String url = "https://useridentity.pie.avatar.ext.hp.com/uls/v1/user_identity/HPID/%id%?email_sync=NOT_REQUIRED";
/*
		if(url != null){
			url = url.replaceAll("%id%", "12345");
			URI uri = null;
			try {
				uri = new URI(url);
			} catch (URISyntaxException e) {
				throw new RuntimeException(e);
			}
			String baseUrl = uri.getScheme() + "://" + uri.getHost() + uri.getPath();
			System.out.println(baseUrl);*/

	/*	String services="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
				"<feed xmlns=\"http://www.w3.org/2005/Atom\" xmlns:papi=\"urn:hp:cloud:eprint:papi:base:1.0\">\n" +
				"  <title>directory</title>\n" +
				"  <id>urn:hp:cloud:eprint:papi:services:directory:2.0</id>\n" +
				"  <updated>2012-05-11T08:16:39+00:00</updated>\n" +
				"</feed>";

		services.substring(services.indexOf("<link href=\"", services.indexOf("<title>" + "tokenManagement" + "</title>")),
				services.indexOf("/>", services.indexOf("<link href=\"", services.indexOf("<title>" + "tokenManagement" + "</title>"))) - 1);
		services = services.replaceAll("<link href=\"", "").replaceAll("\"/>", "").replaceAll("\"", "").trim();*/

		List<String> list = Arrays.asList("abc","bcd",null);
//	list.stream().map(e-> e.toUpperCase()).forEach(System.out::println);
		list.stream().map(e->Optional.ofNullable(e).isPresent() ? e.toUpperCase():" ").forEach(System.out::println);

		System.out.println(list.size());
//		System.out.println(services);

		}






	}

