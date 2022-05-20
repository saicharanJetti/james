package Utility;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
public class readProperties {

	Properties pro;
	public readProperties()
	{
		File src=new File("./config/data.properties");
		try {
			FileInputStream fistream=new FileInputStream(src);
			pro=new Properties();
			pro.load(fistream);
			}catch(Exception e)
		{
				System.out.println("exception occured");
		}
		
	}
	public String readurl()
	{
		String url=pro.getProperty("baseurl");
		return url;
	}
	public String getchromepath()
	{
		String path=pro.getProperty("chromepath");
		return path;
	}
	

}
