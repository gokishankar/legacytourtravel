package org.help;
import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class samplebase {
	      static Actions a;
		  public static WebDriver driver;
		  static Robot r;
		  static Alert s;
		  static JavascriptExecutor j;
		  static Select se;
		public static void browserlaunch() {
			//1
			 driver=new ChromeDriver();
			}
		//2
		public static void launchurl(String url) {
			
			driver.get(url);

		}
		//3
		public static String pageurl() {
			String url=driver.getCurrentUrl();
			System.out.println(url);
			return url;
	}
		//4
	   public static void filltextbox(WebElement ref, String value) {
		ref.sendKeys(value);
		 
		}
	   //5
	   
	    public static void click(WebElement ref) {
	    	ref.click();
			 
	    }
	    //6
	    public static  String gettitle() {
		String title =	driver.getTitle();
	     System.out.println(title);
		return title;
		}
	 
	    //7
	    public static void close() {
			driver.close();
			}
	    //8
	    public static void gettext(WebElement ref ) {
	    	
	    	String txt=ref.getText();
	    	System.out.println(txt);
	    	
	    }
	   //9
	    public static  void getattribute(WebElement ref) {
	    	
	    	String name =ref.getAttribute("name");
	    	System.out.println(name);
			}
	    //10
	    public static void doubleclick(WebElement ref) {
	    	Actions a =new Actions(driver);
			a.doubleClick(ref).perform();

		}
	    //11
	    public static void contextclick(WebElement ref) {
	    	a.contextClick(ref).perform();
		

		}
	    //12

	    public static void moveToelement(WebElement ref) {
	    	a.moveToElement(ref).perform();
	    }
	    //13
	    public static void dragdrop(WebElement src,WebElement des) {
	    	a.dragAndDrop(src, des).perform();
	    }
	   //14 
	    public static void keypaste() throws AWTException {
	    	Robot r=new Robot();
	    	
	    r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);	
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);	
		
		
		}
	    //15
	    public static void screenshots(String picname) throws IOException {
			TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
			File f = new File("C:\\Users\\admin\\eclipse-workspace\\cucumberlegacy\\screenshots\\"+picname+".png");
			FileUtils.copyFile(src,f);

		}
	    //16
	    public static void acceptalert() {
		  Alert s =driver.switchTo().alert();
		  
		  s.accept();

		}
	    //17
	    public static void dismiss() {
			s.dismiss();

		}
	    //18
	    public static  void javascriptsendkeys(WebElement ref,String value) {
	   JavascriptExecutor j=( JavascriptExecutor)driver;
	    j.executeScript("arguments[].setAttribute('value','"+value+"')", ref);

		}
	    //19
	    public static void javaclick(WebElement ref) {
			j.executeScript("arguments[0].click()", ref);

		}
	    //20
	    public static void javagetattribute(WebElement ref) {
			j.executeScript("arguments[0].getAttribute('value')",ref);

		}
	    //21
	    public static void handlewindow() {
	    	
	    	String parent =driver.getWindowHandle();
	    	System.out.println(parent);
			

	    	
		}
	    //22
	    private void windowhandles() {
			Set<String> allwindowid=driver.getWindowHandles();
			List<String> l=new ArrayList();
			l.addAll(allwindowid);
			String childid=l.get(1);
			driver.switchTo().window(childid);

		}
	    
		
	    
	    //23
	    public static void dropdown(WebElement ref,int index,String value,String text) {
	    	Select s = new Select(ref);
	    	s.selectByIndex(index);
	    	s.selectByValue(value);
	    	s.selectByVisibleText(text);
			

		}
	    //24
	    public static void ismultiple() {
			boolean b=  se.isMultiple();
			
			if (b) {
				
				System.out.println("we can select more than one option");
				
				
			} else {
	     
				System.out.println("we can select only one option");
			}

		}
	    //25
	  private static void get() {
			List<WebElement> alloption=se.getOptions();
			int noofoptions=alloption.size();
			System.out.println("noofoptions="+noofoptions);
			for (WebElement x:alloption) {
				System.out.println(x.getText());
				
			}
	  }
		
	  
	//26
	  public static void getselected() {
				List<WebElement> selected=se.getAllSelectedOptions();
				int noofselected =selected.size();
				for (int i = 0; i <selected.size();i++) {
					WebElement selectedoptions=selected.get(i);
					System.out.println(selectedoptions.getText());
					
					
					
				}
			}
			
			//27
				
				public static String getdatadriven (String sheetname,int rownum,int cellnum) throws IOException {
				  
					File f=new File("C:\\Users\\admin\\eclipse-workspace\\morningmaven\\excel\\demoqa.xlsx");
					
					FileInputStream fin=new FileInputStream(f);
					
					Workbook book= new XSSFWorkbook(fin);
					
					Sheet sh=book.getSheet(sheetname);
					Row r= sh.getRow(rownum);
					Cell c=r.getCell(cellnum);
					int type=c.getCellType();
					String name="";
					 if (type==1) {
						  name=c.getStringCellValue();
						 System.out.println(name);
						
					}
					 else if (DateUtil.isCellDateFormatted(c)) {
						 Date d= c.getDateCellValue();
						 SimpleDateFormat sim= new SimpleDateFormat("MM/dd/yy");
						 
						  name =sim.format(d);
						 System.out.println(name);
						 
						
					}
					 else {
						 double da=c.getNumericCellValue();
						 
						 //downcasting
						long l=(long)da;
						 name=String.valueOf(l);
						System.out.println(name);
						}
					 
					 return name;
					 }
				
				//28
				public samplebase() {
					
					PageFactory.initElements(driver, this);
					
				}
					@FindBy(xpath="//input[@placeholder='First Name']")
					private WebElement txtname;
					@FindBy(xpath="//input[@id='userEmail']")
					private WebElement txtemail;
					
					@FindBy(xpath="//input[@placeholder='Mobile Number']")
					private WebElement txtmobile;
					public WebElement getTxtname() {
						return txtname;
					}
					public WebElement getTxtemail() {
						return txtemail;
					}
					public WebElement getTxtmobile() {
						return txtmobile;
					}
					
					
				
	    
			
			
}





