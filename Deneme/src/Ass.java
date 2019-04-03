import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ass {
	
	
	
	
	public static ArrayList<String> list;//I defined list for all class
	public static void main(String[] args) throws IOException 
	
	{
		StudentClass Ass =new StudentClass();// I called StudentClass class
		File file=new File ("Student.txt");//I defined file
		int a=0;//give  a some variable to exit while
		list=new ArrayList<String>();
		

		Scanner okur=new Scanner(file);
        while(okur.hasNextLine())
        {
           String yazi=okur.nextLine();
            list.add(yazi);
        }// I take all information from file.
		
		while (a==0) {// I create menu by while
			System.out.println("1-Register");
			System.out.println("2-Find the student");
			System.out.println("3-List the all");
			System.out.println("4-Update student");
			System.out.println("5-Delete student");
			System.out.println("6-Student's Gpa");
			System.out.println("7-Avarage Gpa ");
			System.out.println("8-To see sorting ");
			System.out.println("9-To see searching");
			System.out.println("0-Exits");
			Scanner swit=new Scanner(System.in);
			int c = swit.nextInt();
			int exits=0;
			switch(c)  
			{
			case 1:
				// I take all information from user and add to file
				 FileWriter write=new FileWriter(file,true);
				 Scanner input = new Scanner(System.in);
				 System.out.println("ID:");
				 String ID =input.nextLine();
				 write.write(ID+"\n");
				 System.out.println("Name:");
				 String isim =input.nextLine();
				 write.write(isim+"\n");
				 System.out.println("Surname:");
				 String soyisim =input.nextLine();
				 write.write(soyisim+"\n");
				 System.out.println("Enter the 1st lesson:");
				 int lesson1 =input.nextInt();
				 write.write(lesson1+"\n");
				 System.out.println("Enter the 2nd lesson:");
				 int lesson2 =input.nextInt();
			     write.write(lesson2+"\n");
				 System.out.println("Enter the 3rd lesson:");
				 int lesson3 =input.nextInt();
				 write.write(lesson3+"\n");
				 System.out.println("Enter the 4th lesson:");
				 int lesson4 =input.nextInt();
				 write.write(lesson4+"\n");
				 System.out.println("Enter the 5th lesson:");
				 int lesson5 =input.nextInt();
				 write.write(lesson5+"\n");
				 write.write("-\n");
				 write.close();
				 break;
				 
			case 2: 
				// I took ID from user and search from list.
				System.out.println("Enter student's ID:");
				 Scanner input2=new Scanner(System.in);
				 String ID1=input2.nextLine();
				 for(int d=0;d<list.size();d++) {
				
				 if(list.get(d).equals(ID1)) {
					 for (int k = 0;k <7;k++) {
						
						System.out.println(list.get(d));
						d++;
 }
					
					 
}
 }
				 break;
				 
			case 3 :
				// I  read all line at file and Write console
				FileReader fileReader = new FileReader(file);
				String line;

				BufferedReader MyRead = new BufferedReader(fileReader);

				while ((line = MyRead.readLine()) != null) {

				    System.out.println(line);

				}

				MyRead.close();
				break;
			case 4:
				// I used fonction
				Ass update=new Ass();
		        update.Update_ArrayList(file);
				
				break;
			
			case 5:

				//I took ID from user and When I find The person who the user want to find, remove 9 line and write new info file
		        System.out.print("ID");
		        Scanner delete=new Scanner(System.in);
		        String ID3=delete.next();
	            for (int p=0;p<list.size();p++)
			     {
				     if (list.get(p).equals(ID3)) 
				     {
				    	 for (int k=0;k<9;k++)
				    	 {
				    		 list.remove(p);
				    	 }
				    	 break;
				    	 
				     }
			    }System.out.println("The Delete operation was performed successfully.");
			            
			            FileWriter write1=new FileWriter(file);
			            for(int q=0;q<list.size();q++)
			            {
			            	write1.write(list.get(q)+"\n");
			            }
			            write1.close();
				break;
			case 6:
				//I took ID from user and GetGPA
				Scanner gpa1=new Scanner(System.in);
				System.out.println("Enter student's ID:");
				String ID5=gpa1.nextLine();
				
		for(int i=0;i<list.size();i++)
		    {
						if(list.get(i).equals(ID5)) 
						{
							int ders1=Integer.valueOf(list.get(i+3));
							int ders2=Integer.valueOf(list.get(i+4));
							int ders3=Integer.valueOf(list.get(i+5));
							int ders4=Integer.valueOf(list.get(i+6));
							int ders5=Integer.valueOf(list.get(i+7));
							Ass.setGpa(ders1, ders2, ders3, ders4, ders5);
							
						}
						
				}
		       
		        System.out.println(Ass.getGPA());
		       
		     
		        break;
		        
			case 7:
				//I took all not from list and setGpa then write getGPA
				double sum=0;
				
		for(int i=0;i<list.size();i+=9)
		    {
						
						{
							int ders1=Integer.valueOf(list.get(i+3));
							int ders2=Integer.valueOf(list.get(i+4));
							int ders3=Integer.valueOf(list.get(i+5));
							int ders4=Integer.valueOf(list.get(i+6));
							int ders5=Integer.valueOf(list.get(i+7));
							Ass.setGpa(ders1, ders2, ders3, ders4, ders5);
							sum+=Ass.getGPA();
						}
						
				}
		        
		        System.out.println(sum/(list.size()/9));
		        
		       
		       
		       
		        break;
				
			
			case 8:
				//Buble sort
				ArrayList<String> sort1 = new ArrayList<String>();	//Create new arraylist to get all GPA
				for(int i=3;i<list.size();i+=9)
	       	     {   
					    int ders1=Integer.valueOf(list.get(i));
						int ders2=Integer.valueOf(list.get(i+1));
						int ders3=Integer.valueOf(list.get(i+2));
						int ders4=Integer.valueOf(list.get(i+3));
						int ders5=Integer.valueOf(list.get(i+4));
						Ass.setGpa(ders1, ders2, ders3, ders4, ders5);
					 sort1.add(String.valueOf(Ass.getGPA()));  
	       	     }
                
            	 int n = sort1.size();  
                 int a32 = 0;  
                 Ass.start();//start timer
                  for(int i=0; i < n; i++){  
                          for(int j=1; j < (n-i); j++){  
                                   if(Integer.valueOf(sort1.get(j-1)) >Integer.valueOf(sort1.get(j)) ){  
                                          a32 = Integer.valueOf(sort1.get(j-1));  
                                          sort1.set(j-1, String.valueOf(sort1.get(j)));
                                          sort1.set(j,String.valueOf(a32));
                                  }  
                                   
                          }  
                  }
                  Ass.stop();  //stop timer
                 String a1=String.valueOf(Ass.getElapsedMilliseconds());//write timer second
            	

               
				
           	 ArrayList<String> sort = new ArrayList<String>();//Create new arraylist to get all GPA
           	for(int i=3;i<list.size();i+=9)
      	     {   
				    int ders1=Integer.valueOf(list.get(i));
					int ders2=Integer.valueOf(list.get(i+1));
					int ders3=Integer.valueOf(list.get(i+2));
					int ders4=Integer.valueOf(list.get(i+3));
					int ders5=Integer.valueOf(list.get(i+4));
					Ass.setGpa(ders1, ders2, ders3, ders4, ders5);
				 sort.add(String.valueOf(Ass.getGPA()));  
      	     }


			//Selection sort
                Ass.start();
       	     for (int i = 0; i < sort.size() - 1; i++)  
       	        {  
       	            int a3 = i;  
       	            for (int j = i + 1; j < sort.size(); j++){ 
       	                if (Integer.valueOf(sort.get(j)) < Integer.valueOf(sort.get(a3))){  
       	                	a3 = j;
       	                }  
       	            }  
       	            int smallerNumber = Integer.valueOf(sort.get(a3));
       	         sort.set(a3, String.valueOf(sort.get(i)));
       	      sort.set(i,String.valueOf(smallerNumber));  
       	        }  
       	    System.out.println(sort);

            Ass.stop();  
            String a2=String.valueOf(Ass.getElapsedMilliseconds());

       	    System.out.println("Buble sort="+a1);
       	    System.out.println("selection sort="+a2);
       	     
       	     
				break;
			case 9:
				// I took all info from list
				ArrayList<String> sort11 = new ArrayList<String>();
			 for(int i=3;i<list.size();i+=9)
       	     {   
				    int ders1=Integer.valueOf(list.get(i));
					int ders2=Integer.valueOf(list.get(i+1));
					int ders3=Integer.valueOf(list.get(i+2));
					int ders4=Integer.valueOf(list.get(i+3));
					int ders5=Integer.valueOf(list.get(i+4));
					Ass.setGpa(ders1, ders2, ders3, ders4, ders5);
				 sort11.add(String.valueOf(Ass.getGPA()));  
       	     }
			// selection sort 
        	 int n1 = sort11.size();  
             int a321 = 0;  
              for(int i=0; i < n1; i++){  
                      for(int j=1; j < (n1-i); j++){  
                               if(Integer.valueOf(sort11.get(j-1)) >Integer.valueOf(sort11.get(j)) ){  
                                      a321 = Integer.valueOf(sort11.get(j-1));  
                                      sort11.set(j-1, String.valueOf(sort11.get(j)));
                                      sort11.set(j,String.valueOf(a321));
                              }  
                               
                      }  
              }

           // binary search
              System.out.println("You should choose these number");
              System.out.println(sort11);
				Scanner find=new Scanner(System.in);
				int key=find.nextInt();
				   int size = sort11.size();
				int low=0;
				  
				     int high = size - 1;
				     Ass.start();
				        while(high >= low) {
				             int middle = (low + high) / 2;
			             if(Integer.valueOf(sort11.get(middle)) == key) {
			                System.out.print("Binary search fined:");break;
			            }
			             if(Integer.valueOf(sort11.get(middle)) < key) {
				                low = middle + 1;
	             }
			             if(Integer.valueOf(sort11.get(middle)) > key) {
				               high = middle - 1;
				           }
			       }
				     
				Ass.stop();
				System.out.println(Ass.getElapsedMilliseconds());
				
				// Normal Search
				
				Ass.start();
				for(int a4=0;a<sort11.size();a4++)
				{
					if(key==Integer.valueOf(sort11.get(a4)))
					{
						 System.out.print("Normal search fined:");break;
					}
						
				}
				Ass.stop();
				System.out.println(Ass.getElapsedMilliseconds());
				    break;
			case 0:
				exits=1;
				
				break;	
}
	if(exits==1)break;
			
}
}

	private  void Update_ArrayList(File file) throws IOException {
		// I took ID from user 
		 System.out.println("Enter student's ID:");
		 Scanner input4=new Scanner(System.in);
		 Scanner input5=new Scanner(System.in);
		 String ID2=input4.nextLine();

		 System .out.println("\n1-Student's ID\n2-Student's Name\n3-Student's Surname\n4-1st Lesson\n5-2nd Lesson\n6-3rd Lesson\n7-4th Lesson\n8-5th Lesson");
		 int h  = input4.nextInt();
		 System .out.println("Enter Variable:");
		 String info=input5.nextLine();
		 for(int k=0;k<list.size();k+=9) {// I enter all line 
		 if(list.get(k).equals(ID2)) {// When I find ID
			int g=h+k-1; 
			list.remove(g) ;  // I removed That line
			list.add(g, info);// I add new info
		 }
		 }
		 FileWriter updateread= new FileWriter(file);// I write file all line from list
		 for(int i=0;i<list.size();i++){

			 updateread.write(list.get(i)+"\n");


             }
             
             updateread.close();
	}

	}



