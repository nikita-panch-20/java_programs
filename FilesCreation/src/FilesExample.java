import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FilesExample {
	
	public static void createFile() {
		// 1. Create a file
				File f=new File("C:\\Users\\nikit\\OneDrive\\Desktop\\files\\datafile.txt");
				try {
					if(f.createNewFile())
							System.out.println("File created : "+f.getName());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
	}
	public static void checkExistingFile() {
		// 2.Existing file
		
				File file=new File("C:\\Users\\nikit\\OneDrive\\Desktop\\files\\datafile.txt");
				if(file.exists()) {
						System.out.println("File name : "+file.getName());
						System.out.println("Absolute Path :"+file.getAbsolutePath());
						System.out.println("Can write to datafile.txt: "+file.canWrite());
						System.out.println("Can read from datafile.txt: "+file.canRead());
						System.out.println("The length of the file: "+file.length());
				}
				else {
					System.out.println("File doesn't exist");
				}
				
	}
	public static void writeToFile() {
		//3. write to a file
		
				try {
					FileWriter myWriter = new FileWriter("C:\\Users\\nikit\\OneDrive\\Desktop\\files\\datafile.txt");
					myWriter.write("Writing in this file in progress.");
				    myWriter.close();
				} catch (IOException ae) {
					// TODO Auto-generated catch block
					ae.printStackTrace();
				}
				
				
	}
	public static void readToFile() {
		//4. Read a file
		
				try {
				      File myObj = new File("C:\\Users\\nikit\\OneDrive\\Desktop\\files\\datafile.txt");
				      Scanner myReader = new Scanner(myObj);
				      while (myReader.hasNextLine()) {
				        String data = myReader.nextLine();
				        System.out.println(data);
				      }
				      myReader.close();
				    } catch (FileNotFoundException e) {
				      System.out.println(e.getMessage());
				      e.printStackTrace();
				    }
				
				
	}
	
	public static void deleteFile() {
		// 5. delete a file
		
				File myObj = new File("C:\\Users\\nikit\\OneDrive\\Desktop\\files\\datafile.txt"); 
			    if (myObj.delete()) { 
			      System.out.println("Deleted the file: " + myObj.getName());
			    } else {
			      System.out.println("Failed to delete the file.");
			    } 

	}
	public static void main(String[] args) {
		deleteFile();
	}

}
