package wipro;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UrlDomainCount {

	public static void main(String[] args) {
		List<String>  myList= Arrays.asList("http://www.example.com/blah_blah",
				"http://www.google.com/wpstyle/?p=364",
				"http://www.yahoo.com/testcat_au.html",
				"http://www.google.com/events/#&product=browser",
				"http://www.example.com/wpstyle/?p=364");
//		solution(myList);
		
		 Map<String,Long> al = myList.stream().collect(Collectors.groupingBy(e->{
			try {
				return new URL(e).getHost();
			} catch (MalformedURLException e1) {
				e1.printStackTrace();
			}
			return e;
		}, Collectors.counting()));
		 
		solution(myList);

	}
	  public static void solution(List<String> MyList)
	  {
		  Map<String,Integer> al = new HashMap<String,Integer>();
		  MyList.stream().forEach(e->{
			try {
				if(al.containsKey(new URL(e).getHost()))
				{
					al.put(new URL(e).getHost(),al.get(new URL(e).getHost())+1);
				}
				else
				{
				al.put(new URL(e).getHost(),1);
				}
			} catch (MalformedURLException e1) {
				e1.printStackTrace();
			}
		});
		  System.out.println(al);
	  }
	}
