package WebDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D28_PROJECT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://sampleapp.tricentis.com/101/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div[1]/ul/li[1]/a")).click();//click the automoblie
		
		WebElement drop = driver.findElement(By.name("Make"));
		Select webele =new Select(drop);
		webele.selectByVisibleText("Volvo");
		
		driver.findElement(By.id("engineperformance")).sendKeys("1500");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[3]/input")).sendKeys("12/03/2002");
		
		
		WebElement drop1 = driver.findElement(By.name("Number of Seats"));
		Select webele1 =new Select(drop1);
		webele1.selectByVisibleText("5");                           // to select no of seat
		
		WebElement drop2 = driver.findElement(By.name("Fuel Type"));
		Select webele2 =new Select(drop2);
		webele2.selectByVisibleText("Petrol");                   // to select fuel type
		
		driver.findElement(By.id("listprice")).sendKeys("100000");//price list
		
		driver.findElement(By.id("licenseplatenumber")).sendKeys("0001");// number plate
		
		driver.findElement(By.id("annualmileage")).sendKeys("150");// mileage
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[9]/button")).click();// for next button
		
		/////////////////// second page       
		
		driver.findElement(By.id("firstname")).sendKeys("ROHIT");//first name
		
		driver.findElement(By.id("firstname")).sendKeys("ROHIT");
		driver.findElement(By.id("lastname")).sendKeys("MANDAL");
		driver.findElement(By.id("birthdate")).sendKeys("01/10/2001");
		
		WebElement el1 =  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span"));
		el1.click();
	
	   driver.findElement(By.id("streetaddress")).sendKeys("balwant colony chinchwad,pune");
	
	   WebElement drop3 = driver.findElement(By.name("Country"));
	   Select webele3 =new Select(drop3);
	   webele3.selectByVisibleText("India");
			
	   driver.findElement(By.id("zipcode")).sendKeys("400113");
			
	   driver.findElement(By.id("city")).sendKeys("pune");
			
	   WebElement drop4 = driver.findElement(By.name("Occupation"));
	   Select webele4 =new Select(drop4);
       webele4.selectByVisibleText("Selfemployed");
				
	   driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[3]/span")).click();
				
	   driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[13]/button[2]")).click(); /////// for next page
		 
	   
	   //////////////////  third page 
	   
	   driver.findElement(By.id("startdate")).sendKeys("01/10/2032");
				
	   WebElement drop6 = driver.findElement(By.name("Insurance Sum"));
	   Select webele6 =new Select(drop6);
	   webele6.selectByValue("10000000");
				
	   WebElement drop7 = driver.findElement(By.name("Merit Rating"));
	   Select webele7 =new Select(drop7);
	   webele7.selectByValue("Bonus 7");
				
	   WebElement drop8 = driver.findElement(By.name("Damage Insurance"));
	   Select webele8 =new Select(drop8);
	   webele8.selectByValue("Full Coverage");
				
	   driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[2]/span")).click();
				
	   WebElement drop9 = driver.findElement(By.name("Courtesy Car"));
	   Select webele9 =new Select(drop9);
	   webele9.selectByValue("Yes");
				
	   driver.findElement(By.id("nextselectpriceoption")).click();////for next page
				
	   
	   String act_onlineClaim ,act_Claimdis,act_wwcover ,act_price;
	 		String exp_onlineClaim = "No",exp_Claimdis = "No",exp_wwcover = "No",exp_price ="353";
	 		
	 	    act_price = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[1]/td[2]/span")).getText();
	 	    if(act_price.equals(exp_price));
	 	    System.out.println("Actual online price is matching");
	 	    
	         act_onlineClaim = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[2]/td[2]")).getText();
	         if(act_onlineClaim.equals(exp_price));
	         System.out.println("Actual online claim is matching");
	         
	         act_Claimdis =  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[3]/td[2]")).getText();
	         if(act_Claimdis.equals(exp_Claimdis));
	         System.out.println("Actual claim discount is matching");
	         
	         act_wwcover = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[4]/td[2]")).getText();
	         if(act_wwcover.equals(exp_wwcover));
	         System.out.println("Actual ww cover is matching");
	         
	         driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[1]/span")).click();

	         driver.findElement(By.id("nextsendquote")).click();
	         
	         driver.findElement(By.id("email")).sendKeys("rohit@gmail.com");
	         driver.findElement(By.id("phone")).sendKeys("7262890604");
	         driver.findElement(By.id("username")).sendKeys("rohit");
	         driver.findElement(By.id("password")).sendKeys("Rohi@1");
	         driver.findElement(By.id("confirmpassword")).sendKeys("Rohi@1");
	         driver.findElement(By.id("Comments")).sendKeys("very nice");
	         
	         driver.findElement(By.id("prevselectpriceoption")).click();
	         
		
	        // driver.findElement(By.id("sendemail")).click();
				/*
				 * driver.findElement(By.xpath("  /html/body/div[4]/div[7]/div/button")).click()
				 * ; driver.findElement(By.
				 * xpath("  //*[@id=\"finished-sub-container\"]/div[1]/div/div[1]")).click();
				 */
	         driver.findElement(By.xpath("  //*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span")).click();
	      
	         String act_onlineClaim1 ,act_Claimdis1,act_wwcover1 ,act_price1;
		 		String exp_onlineClaim1 = "Submit",exp_Claimdis1 = "2",exp_wwcover1 = "Limited",exp_price1 ="953";
		 		
		 	    act_price1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[1]/td[3]/span")).getText();
		 	    if(act_price1.equals(exp_price1));
		 	    System.out.println("Actual online price is matching");
		 	    
		         act_onlineClaim1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[2]/td[3]")).getText();
		         if(act_onlineClaim1.equals(exp_price1));
		         System.out.println("Actual online claim is matching");
		         
		         act_Claimdis1 =  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[3]/td[3]")).getText();
		         if(act_Claimdis1.equals(exp_Claimdis1));
		         System.out.println("Actual claim discount is matching");
		         
		         act_wwcover1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[4]/td[3]")).getText();
		         if(act_wwcover1.equals(exp_wwcover1));
		         System.out.println("Actual ww cover is matching");
		         
		         driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[2]/span")).click();
		         driver.findElement(By.id("nextsendquote")).click();
		         
		         driver.findElement(By.id("email"));
		         driver.findElement(By.id("phone"));
		         driver.findElement(By.id("username"));
		         driver.findElement(By.id("password"));
		         driver.findElement(By.id("confirmpassword"));
		         driver.findElement(By.id("sendemail")).click();
		 		
		 		driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();
		 	    Thread.sleep(2000);
		 		driver.findElement(By.id("prevselectpriceoption")).click();
	}

}
